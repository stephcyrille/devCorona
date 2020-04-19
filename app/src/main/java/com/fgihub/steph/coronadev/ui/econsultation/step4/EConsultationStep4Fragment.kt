package com.fgihub.steph.coronadev.ui.econsultation.step4

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.navigation.Navigation

import com.fgihub.steph.coronadev.R
import kotlinx.android.synthetic.main.fragment_e_consultation_step4.view.*

class EConsultationStep4Fragment : Fragment() {

    companion object {
        fun newInstance() = EConsultationStep4Fragment()
    }

    private lateinit var viewModel: EConsultationStep4ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_e_consultation_step4, container, false)
        val spinner = root.spinner_other
        val countries = arrayOf(" ", "Allemagne", "Angleterre", "Belgique", "Espagne", "Etas Unis", "France", "Italie", "Suisse")

        val adapter = ArrayAdapter(
            root.context, R.layout.support_simple_spinner_dropdown_item ,countries
        )

        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {

            }
        }

        root.e_consultation_end_button.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_consultation_step4_to_end)
        )

        return root
    }

}
