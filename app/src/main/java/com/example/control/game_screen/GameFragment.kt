package com.example.control.game_screen

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.control.R
import com.example.control.databinding.FragmentGameBinding
import org.koin.android.ext.android.inject

class GameFragment : Fragment() {

    val mViewModel: gameViewModule by inject()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        var count = 1
        val view = FragmentGameBinding.inflate(inflater, container, false)

        mViewModel.additionalInfoHide()
        mViewModel.passStatusHide()

        val pref = requireActivity().getSharedPreferences(
            "MyPref",
            Context.MODE_PRIVATE,
        )
        var game_id = pref.getInt("game_id", 0)
        mViewModel.setId(game_id)
        Log.i("game_id", "Loaded :$game_id")
        val level = mViewModel.getCurrentLevel()

        view.photoPerson.setBackgroundResource(
            resources
                .getIdentifier(level.roomPhoto, "drawable", requireActivity().packageName),
        )

        mViewModel.goToNexEvent()

        if (mViewModel.dialogType == 7) {
            view.QuestionsText.text = "..."
            mViewModel.additionalInfoShow()
            mViewModel.passStatusShow()
        }

        mViewModel.additionalInfoShow.observe(viewLifecycleOwner) {
            if (!it) {
                view.askAdditionalInfo.visibility = View.GONE
                view.askAdditionalInfoText.visibility = View.GONE
            } else {
                view.askAdditionalInfo.visibility = View.VISIBLE
                view.askAdditionalInfoText.visibility = View.VISIBLE
            }
        }

        mViewModel.passStatus.observe(viewLifecycleOwner) {
            if (!it) {
                view.dontPassPerson.visibility = View.GONE
                view.passPerson.visibility = View.GONE
            } else {
                view.dontPassPerson.visibility = View.VISIBLE
                view.passPerson.visibility = View.VISIBLE
            }
        }
        view.askAdditionalInfo.setOnClickListener {
            showDialog("Documents choosing", requireActivity())
        }
        var arrayIndex = 0
        mViewModel.nextEvent.observe(viewLifecycleOwner) {
            if (count % 2 != 0) {
                if (mViewModel.dialogType == 0 && level.dialog1.size > arrayIndex && mViewModel.dialogType != 7) {
                    view.QuestionsText.text =
                        "You : " + level.dialog1[arrayIndex].phrasesBorderGuard
                } else {
                    count = 0
                    arrayIndex = 0
                    mViewModel.additionalInfoShow()
                    mViewModel.passStatusShow()
                    mViewModel.dialogType = 7
                }
            } else {
                if (mViewModel.dialogType == 0 && level.dialog1.size > arrayIndex && mViewModel.dialogType != 7) {
                    view.QuestionsText.text =
                        "${level.FullName} : " + level.dialog1[arrayIndex].phrasesPerson
                } else {
                    count = 0
                    arrayIndex = 0
                    mViewModel.additionalInfoShow()
                    mViewModel.passStatusShow()
                    mViewModel.dialogType = 7
                }
                arrayIndex++
            }
            count++
        }

        view.backgtoud.setOnClickListener {
            mViewModel.goToNexEvent()
        }

        view.dontPassPerson.setOnClickListener {
            val bundle = Bundle()
            bundle.putBoolean("prediction", level.isItSpy)
            mViewModel.saveLevelId {
                val pref = requireActivity().getSharedPreferences(
                    "MyPref",
                    0,
                ) // 0 - for private mode
                val res = it + 1

                Log.i("game_id", "Saved :$res")
                val editor: SharedPreferences.Editor = pref.edit()
                editor.putInt("game_id", res); // Storing integer
                editor.commit()
            }
            findNavController().navigate(R.id.to_gameResultFragment, bundle)
        }
        view.passPerson.setOnClickListener {
            val bundle = Bundle()
            bundle.putBoolean("prediction", !level.isItSpy)
            mViewModel.saveLevelId {
                val pref = requireActivity().getSharedPreferences(
                    "MyPref",
                    0,
                ) // 0 - for private mode
                val res = it + 1
                Log.i("game_id", "Saved :$res")

                val editor: SharedPreferences.Editor = pref.edit()
                editor.putInt("game_id", res); // Storing integer
                editor.commit()
            }
            findNavController().navigate(R.id.to_gameResultFragment, bundle)
        }
        return view.root
    }

    private fun showDialog(title: String, activity: Activity) {
        val dialog = Dialog(activity)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.documents_dialog)
        val idBtn = dialog.findViewById(R.id.passport_check) as ImageView
        val documentsBtn = dialog.findViewById(R.id.documents) as ImageView

        idBtn.setOnClickListener {
            dialog.dismiss()
            findNavController().navigate(R.id.to_passportFragment)
        }
        documentsBtn.setOnClickListener {
            dialog.dismiss()
            findNavController().navigate(R.id.to_bioFragment)
        }

        dialog.show()
    }
}
