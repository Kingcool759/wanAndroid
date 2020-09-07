package com.example.wanandroid.fragment

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wanandroid.R
import com.example.wanandroid.viewmodel.ProjectViewPagerViewModel

class ProjectViewPagerFragment : Fragment() {

    companion object {
        fun newInstance() = ProjectViewPagerFragment()
    }

    private lateinit var viewModel: ProjectViewPagerViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.project_view_pager_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ProjectViewPagerViewModel::class.java)
        // TODO: Use the ViewModel
    }

}