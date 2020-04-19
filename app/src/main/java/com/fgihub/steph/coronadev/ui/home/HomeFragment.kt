package com.fgihub.steph.coronadev.ui.home

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.fgihub.steph.coronadev.R
import com.fgihub.steph.coronadev.databinding.CartViewBinding
import com.fgihub.steph.coronadev.databinding.FragmentHomeBinding
import com.fgihub.steph.coronadev.ui.home.adapter.NewsItemAdapter
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
    /**
     * Lazily initialize our [HomeViewModel].
     */

    private lateinit var homeViewModel: HomeViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // val root =  inflater.inflate(R.layout.cart_view, container, false)
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)

        val binding = FragmentHomeBinding.inflate(inflater)

        binding.lifecycleOwner = this
        binding.homeViewModel = homeViewModel

        return binding.root
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        recycler_view.layoutManager = LinearLayoutManager(activity)
        recycler_view.adapter = NewsItemAdapter()
        recycler_view.itemAnimator = DefaultItemAnimator()
        recycler_view.setHasFixedSize(true)

    }




}
