package com.example.control

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.control.databinding.FragmentBioBinding
import com.example.control.game_screen.gameViewModule
import org.koin.android.ext.android.inject

class BioFragment : Fragment() {

    val mViewModel: gameViewModule by inject()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        val view = FragmentBioBinding.inflate(inflater, container, false)
        val level = mViewModel.getCurrentLevel()

        view.bioText.text = level.Bio

        view.continueBtn.setOnClickListener {
            findNavController().popBackStack()
        }

        return view.root
    }
}
