package com.mudassir.productreview.di.component

import android.app.Application
import android.content.Context
import com.mudassir.data.NetworkModule
import com.mudassir.productreview.ProductReviewApp
import com.mudassir.productreview.di.module.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
    AppModule::class,
    AndroidInjectionModule::class,
    ViewModelFactoryModule::class,
    ActivityModule::class,
    FragmentModule::class,
    NetworkModule::class,
    DomainModule::class,
    DataModule::class
))
interface AppComponent {

    fun inject( application : ProductReviewApp)

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun application(application : Application): Builder

        @BindsInstance
        fun context(context: Context) : Builder

        fun build(): AppComponent
    }
}