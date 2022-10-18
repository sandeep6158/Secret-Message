package com.example.secretmessage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController


class MessageFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view3= inflater.inflate(R.layout.fragment_message, container, false)

        val startButton3 = view3.findViewById<Button>(R.id.next)

        startButton3.setOnClickListener{
            view3.findNavController().navigate(R.id.action_messageFragment_to_welcomeFragment)
        }



        return view3
    }


}