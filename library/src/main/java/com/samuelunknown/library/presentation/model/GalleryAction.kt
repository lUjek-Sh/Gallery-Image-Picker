package com.samuelunknown.library.presentation.model

sealed class GalleryAction {
    data class ChangeSelectionAction(val item: GalleryItem.Image) : GalleryAction()
    object Accept : GalleryAction()
    object Cancel : GalleryAction()
}