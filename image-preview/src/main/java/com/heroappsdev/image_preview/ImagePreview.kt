package com.heroappsdev.imagepreview

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.unit.dp

@Composable
fun ImagePreview(
    image: Painter,
    modifier: Modifier = Modifier,
    description: String = "",
    contentDescription: String = "",
    onImageClick: () -> Unit = {}
) {
    Box(
        modifier = modifier
            .aspectRatio(1f)
            .clip(RoundedCornerShape(15.dp))
            .shadow(15.dp, RoundedCornerShape(15.dp))
            .clickable { onImageClick }
    ) {
        Image(
            painter = image,
            contentDescription = contentDescription
        )
    }
}