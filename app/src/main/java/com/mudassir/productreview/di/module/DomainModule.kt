package com.mudassir.productreview.di.module

import com.mudassir.domain.SchedulerProvider
import com.mudassir.domain.gateway.ProductGateway
import com.mudassir.domain.usecase.ProductUseCase
import dagger.Module
import dagger.Provides

@Module
class DomainModule {
    @Provides
    fun provideProductListUseCase(schedulerProvider: SchedulerProvider, productGateway: ProductGateway)
            = ProductUseCase(schedulerProvider,productGateway)
}