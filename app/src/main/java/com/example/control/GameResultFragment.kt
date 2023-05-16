package com.example.control

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.control.databinding.FragmentGameResultBinding
import com.example.control.game_screen.gameViewModule
import org.koin.android.ext.android.inject

class GameResultFragment : Fragment() {

    val mViewModel: gameViewModule by inject()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        val view = FragmentGameResultBinding.inflate(inflater, container, false)
        val bundle = requireArguments()
        val predictionResult = bundle.getBoolean("prediction")
        val level = mViewModel.getCurrentLevel()
        if (predictionResult) {
            view.score.text = "Score : +1"
        } else {
            view.score.text = "Score : -1"
        }
        var description = ""
        if (level.isItSpy) {
            description = level.whyItSpyDescription
        } else {
            description = "That was the regular person who just wanted to cross the border"
        }
        view.resultDesctiption.text = "Result description : " + description

        view.continueBtn.setOnClickListener {
            findNavController().navigate(R.id.continue_to_gameFragment_from_result)
        }

        return view.root
    }
}
