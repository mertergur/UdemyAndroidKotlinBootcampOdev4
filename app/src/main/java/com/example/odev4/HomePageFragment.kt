package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4.databinding.FragmentHomePageBinding

class HomePageFragment : Fragment() {
    private lateinit var binding: FragmentHomePageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomePageBinding.inflate(inflater, container, false)

        binding.buttonHomePageToA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.mainpageToPageA)
        }

        binding.buttonHomePageToB.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.mainpageToPageX)
        }
        return binding.root
    }
}