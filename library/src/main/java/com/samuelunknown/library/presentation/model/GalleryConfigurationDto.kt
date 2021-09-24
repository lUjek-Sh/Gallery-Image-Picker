package com.samuelunknown.library.presentation.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GalleryConfigurationDto(
    val mimeTypes: List<String>? = null
) : Parcelable