package com.mudassir.productreview.ui.list

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.mudassir.productreview.R
import com.mudassir.productreview.di.module.ViewModelFactory
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class ProductListFragment : Fragment() {


    companion object {
        fun newInstance() = ProductListFragment()
    }

    @Inject
    lateinit var viewModelFactory: ViewModelFactory
    private val mViewModel: ProductListViewModel by viewModels { viewModelFactory }


    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.product_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }


}