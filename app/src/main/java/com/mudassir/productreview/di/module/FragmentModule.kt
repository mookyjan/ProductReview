package com.mudassir.productreview.di.module

import com.mudassir.productreview.ui.detail.ProductDetailFragment
import com.mudassir.productreview.ui.list.ProductListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract fun productListFragment() : ProductListFragment

    @ContributesAndroidInjector
    abstract fun productDetailFragment(): ProductDetailFragment
}