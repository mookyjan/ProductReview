package com.mudassir.domain.usecase

import com.mudassir.domain.SchedulerProvider
import com.mudassir.domain.SingleUseCase
import com.mudassir.domain.entity.ProductEntity
import com.mudassir.domain.gateway.ProductGateway
import io.reactivex.rxjava3.core.Single

class ProductUseCase(
    schedulers: SchedulerProvider,
    private val productGateway: ProductGateway
) : SingleUseCase<Boolean, List<ProductEntity>>(schedulers) {


    override fun buildUseCaseObservable(isRefresh: Boolean?): Single<List<ProductEntity>> {

        return productGateway.getProductList()
    }
}