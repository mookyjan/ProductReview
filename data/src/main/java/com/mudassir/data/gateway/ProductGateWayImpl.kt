package com.mudassir.data.gateway

import com.mudassir.data.repository.ProductRepository
import com.mudassir.domain.entity.ProductEntity
import com.mudassir.domain.gateway.ProductGateway
import io.reactivex.rxjava3.core.Single

class ProductGateWayImpl constructor(private val productRepository: ProductRepository): ProductGateway {

    override fun getProductList(): Single<List<ProductEntity>> {
        return productRepository.getProductList()
    }
}