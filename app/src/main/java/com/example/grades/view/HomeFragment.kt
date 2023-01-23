package com.example.grades.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.grades.R
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment(R.layout.fragment_home) {

    val args: HomeFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        clickButton()
    }

    private fun clickButton() {
        buttonRegister.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_registerFragment2)
        }
        buttonList.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToListFragment3(
                args.students!!
            )
            findNavController().navigate(action)
        }
    }
}