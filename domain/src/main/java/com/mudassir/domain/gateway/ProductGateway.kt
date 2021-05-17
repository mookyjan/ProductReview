package com.mudassir.domain.gateway

import com.mudassir.domain.entity.ProductEntity
import io.reactivex.rxjava3.core.Single

interface ProductGateway {

    fun getProductList(): Single<List<ProductEntity>>
}