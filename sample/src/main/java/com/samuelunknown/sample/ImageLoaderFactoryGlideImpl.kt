package com.samuelunknown.sample

import android.content.Context
import android.net.Uri
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.MultiTransformation
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.samuelunknown.galleryImagePicker.presentation.imageLoader.ImageLoader
import com.samuelunknown.galleryImagePicker.presentation.imageLoader.ImageLoaderFactory
import kotlin.math.roundToInt

class ImageLoaderFactoryGlideImpl(private val appContext: Context) : ImageLoaderFactory {

    val radius: Int by lazy {
        appContext.resources
            .getDimension(R.dimen.image_corner_radius)
            .roundToInt()
    }

    override fun create(): ImageLoader = object : ImageLoader {
        override fun load(imageView: ImageView, uri: Uri) {

            Glide.with(appContext)
                .load(uri)
                .transform(
                    MultiTransformation(
                        CenterCrop(),
                        RoundedCorners(radius)
                    )
                )
                .placeholder(R.drawable.bg_placeholder)
                .into(imageView)
        }

        override fun cancel(imageView: ImageView) {
            Glide.with(appContext).clear(imageView)
        }
    }
}