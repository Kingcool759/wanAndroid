package com.example.wanandroid.fragment

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wanandroid.R
import com.example.wanandroid.viewmodel.SystemViewPagerViewModel

class SystemViewPagerFragment : Fragment() {

    companion object {
        fun newInstance() = SystemViewPagerFragment()
    }

    private lateinit var viewModel: SystemViewPagerViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.system_view_pager_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SystemViewPagerViewModel::class.java)
        // TODO: Use the ViewModel
    }

}