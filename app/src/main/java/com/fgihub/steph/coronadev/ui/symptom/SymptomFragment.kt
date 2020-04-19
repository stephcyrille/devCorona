package com.fgihub.steph.coronadev.ui.symptom

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.fgihub.steph.coronadev.databinding.FragmentSymptomBinding

class SymptomFragment : Fragment() {

    companion object {
        fun newInstance() =
            SymptomFragment()
    }

    private lateinit var viewModel: SymptomViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding =  FragmentSymptomBinding.inflate(inflater)

        return binding.root
    }

/*    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SymptomViewModel::class.java)
        // TODO: Use the ViewModel
    }*/

}
