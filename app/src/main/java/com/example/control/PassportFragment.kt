package com.example.control

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.control.databinding.FragmentPassportBinding
import com.example.control.game_screen.gameViewModule
import org.koin.android.ext.android.inject

class PassportFragment : Fragment() {

    val mViewModel: gameViewModule by inject()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        val view = FragmentPassportBinding.inflate(inflater, container, false)

        val level = mViewModel.getCurrentLevel()

        view.profileImg.setBackgroundResource(
            resources
                .getIdentifier(level.idPhoto, "drawable", requireActivity().packageName),
        )

        view.dataOfBirth.text = level.dateOfBirth
        view.dateOfExpiry.text = level.dateOfExpiry
        view.nationality.text = level.nationality
        view.name3.text = level.FullName
        view.sex.text = level.Sex
        view.placeOfBirth.text = level.placeOfBirth
        view.placeOfIsssue.text = level.placeOfBirth
        view.signature.text = level.Signature
        view.passportNo.text = level.passportNo

        view.chiper1.text = "<<${level.FullName}<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<"
        view.chiper2.text = "<<<<<<<${level.passportNo}<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<"

        view.continueBtn.setOnClickListener {
            findNavController().popBackStack()
        }
        return view.root
    }
}
