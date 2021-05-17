package com.mudassir.data.remote

import com.mudassir.data.remote.api.ProductReviewService

class ProductRemoteDataSource constructor(private val productReviewService: ProductReviewService){

    fun getProductList() = productReviewService.getProductData()

}