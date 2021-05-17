package com.mudassir.data.remote.api

import com.mudassir.domain.entity.ProductEntity
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface ProductReviewService {

    @GET("products")
    fun getProductData(): Single<List<ProductEntity>>
}