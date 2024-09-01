package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import com.example.odev4.databinding.FragmentPageYBinding

class PageYFragment : Fragment() {

    private lateinit var binding: FragmentPageYBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPageYBinding.inflate(inflater,container,false)

        val backpress = object : OnBackPressedCallback(true){

            override fun handleOnBackPressed() {

                Navigation.findNavController(binding.textView5).navigate(R.id.pageYToHomePage)

            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,backpress)

        return binding.root


    }


}