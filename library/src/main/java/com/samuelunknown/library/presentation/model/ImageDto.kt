package com.samuelunknown.library.presentation.model

import android.net.Uri
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ImageDto(
    val uri: Uri,
    val name: String
) : Parcelable