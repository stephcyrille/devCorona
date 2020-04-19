package com.fgihub.steph.coronadev.ui.econsultation

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

import com.fgihub.steph.coronadev.R
import kotlinx.android.synthetic.main.fragment_e_consultation_end.view.*

class EConsultationEndFragment : Fragment() {

    companion object {
        fun newInstance() = EConsultationEndFragment()
    }

    private lateinit var viewModel: EConsultationEndViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_e_consultation_end, container, false)

        root.end_e_consultation_back_home_button.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_consultation_end_to_home)
        )
        return root


    }

}
