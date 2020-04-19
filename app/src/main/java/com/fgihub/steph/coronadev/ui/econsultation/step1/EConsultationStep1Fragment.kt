package com.fgihub.steph.coronadev.ui.econsultation.step1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation

import com.fgihub.steph.coronadev.R
import kotlinx.android.synthetic.main.fragment_e_consultation_step1.view.*

class EConsultationStep1Fragment : Fragment() {

    companion object {
        fun newInstance() =
            EConsultationStep1Fragment()
    }

    private lateinit var viewModel: EConsultationStep1ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root =  inflater.inflate(R.layout.fragment_e_consultation_step1, container, false)

        root.e_consult_btn_continue.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_nav_consultation_to_EConsultationStep2Fragment2)
        )

        return  root
    }


}
