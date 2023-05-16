package com.example.control

import android.content.SharedPreferences
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.control.databinding.FragmentGreetingsFargmentBinding

class GreetingsFargment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        var count = 0
        val view = FragmentGreetingsFargmentBinding.inflate(inflater, container, false)
        if (isItFirstEnter()) {
            initFirstEnter()
        } else {
            findNavController().navigate(R.id.to_start_fragment)
        }

        view.nextButton.setOnClickListener {
            when(count){
                0 -> view.textDescription.text = getString(R.string.greetings_text2)
                1 -> view.textDescription.text = getString(R.string.greetings_text3)
                2 -> view.textDescription.text = getString(R.string.greetings_text4)
                3 -> view.textDescription.text = getString(R.string.greetings_text5)
                4 -> view.textDescription.text = getString(R.string.greetings_text6)
                5 -> view.textDescription.text = getString(R.string.greetings_text7)
                else -> findNavController().navigate(R.id.to_start_fragment)
            }
            count++
        }

        return view.root
    }

    fun initFirstEnter() {
        val prefs = PreferenceManager.getDefaultSharedPreferences(requireContext())
        val editor: SharedPreferences.Editor = prefs.edit()
        editor.putString("Initialized", "true"); // Storing string
        editor.putInt("Score", 0); // Storing string
        editor.apply(); // commit changes
    }

    fun isItFirstEnter(): Boolean {
        val prefs = PreferenceManager.getDefaultSharedPreferences(requireContext())
        val res = prefs.getString("Initialized", null); // getting String
        return res == null
    }
}
