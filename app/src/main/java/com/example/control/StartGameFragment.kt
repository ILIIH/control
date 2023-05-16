package com.example.control

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.control.databinding.FragmentStartGameBinding

class StartGameFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        val view = FragmentStartGameBinding.inflate(inflater, container, false)
        view.startGame.setOnClickListener {
            findNavController().navigate(R.id.to_game_fragment)
        }
        view.myScore.setOnClickListener {
            findNavController().navigate(R.id.to_scoreFragment)
        }
        view.settings.setOnClickListener {
            findNavController().navigate(R.id._to_settingsFragment)
        }
        view.help.setOnClickListener {
            findNavController().navigate(R.id.to_helpFragment)
        }
        return view.root
    }
}
