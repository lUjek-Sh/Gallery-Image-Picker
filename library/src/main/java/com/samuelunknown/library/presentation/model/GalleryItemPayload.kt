package com.samuelunknown.library.presentation.model

internal sealed class GalleryItemPayload {
    data class SelectionPayload(val item: GalleryItem.Image)
}