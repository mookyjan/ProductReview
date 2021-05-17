package com.mudassir.productreview.util

import android.view.View
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide


@BindingAdapter("android:src")
fun bindingImage(imageView: ImageView, urlPath: String?) {
    urlPath?.let {
        Glide.with(imageView.context)
            .load(it)
//            .error(ContextCompat.getDrawable(imageView.context, R.drawable.loading))
            .into(imageView)
    }
}


@BindingAdapter("android:visibility")
fun setVisibility(view: View, value: Boolean?) {
    view.visibility = if (value!!) View.VISIBLE else View.GONE
}