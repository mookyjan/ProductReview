package com.mudassir.domain.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ProductEntity(
    val id: String,
    val name: String,
    val description: String,
    val price: String,
    val imgUrl: String?,
    val averageReviewStar: Float,
    val reviews: List<Review>
) : Parcelable

@Parcelize
data class Review(
    val productId: String,
    val locale: String?,
    val rating: Int,
    val imgUrl: String? = null,
    val text: String
) : Parcelable
