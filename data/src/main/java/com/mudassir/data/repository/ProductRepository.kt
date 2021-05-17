package com.mudassir.data.repository

import com.mudassir.data.remote.ProductRemoteDataSource
import com.mudassir.domain.entity.ProductEntity
import io.reactivex.rxjava3.core.Single

class ProductRepository constructor(private val productRemoteDataSource: ProductRemoteDataSource) {

    fun getProductList(): Single<List<ProductEntity>> {

        return productRemoteDataSource.getProductList()
    }
}