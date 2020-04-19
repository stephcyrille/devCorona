package com.fgihub.steph.coronadev.ui.econsultation.step2

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

import com.fgihub.steph.coronadev.R
import kotlinx.android.synthetic.main.fragment_e_consultation_step2.view.*

class EConsultationStep2Fragment : Fragment() {

    companion object {
        fun newInstance() = EConsultationStep2Fragment()
    }

    private lateinit var viewModel: EConsultationStep2ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_e_consultation_step2, container, false)

        root.e_consultation_step2_btn_next.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_EConsultationStep2Fragment2_to_EConsultationStep3Fragment)
        )

        return root
    }

}
