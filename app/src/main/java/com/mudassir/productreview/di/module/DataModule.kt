package com.mudassir.productreview.di.module

import com.mudassir.data.gateway.ProductGateWayImpl
import com.mudassir.data.remote.ProductRemoteDataSource
import com.mudassir.data.remote.api.ProductReviewService
import com.mudassir.data.repository.ProductRepository
import com.mudassir.domain.gateway.ProductGateway
import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Provides
    fun provideProductListRemoteDataSource(productReviewService: ProductReviewService) =
        ProductRemoteDataSource(productReviewService)


    @Provides
    fun provideProductListRepository(productRemoteDataSource: ProductRemoteDataSource) =
        ProductRepository(productRemoteDataSource)

    @Provides
    fun provideProductListGateWay(productRepository: ProductRepository): ProductGateway =
        ProductGateWayImpl(productRepository)

}