package com.soogil.example

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.soogil.example.aac.FirstFragmentViewModel
import com.soogil.example.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private lateinit var viewModel:FirstFragmentViewModel
    private var _binding:FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        activity.let {
            viewModel = FirstFragmentViewModel(activity?.application)
            _binding = FragmentFirstBinding.inflate(inflater)
            binding.lifecycleOwner = this // live data 사용 시 반드시 필요
            binding.viewModel = viewModel
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }

    fun nextFragment(view:View) {
        Log.d("Log","nextFragment")
        findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
    }
}