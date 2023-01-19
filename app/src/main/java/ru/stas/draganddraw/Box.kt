package ru.stas.draganddraw

import android.graphics.PointF
import android.os.Parcelable
import kotlinx.parcelize.IgnoredOnParcel
import kotlinx.parcelize.Parcelize

@Parcelize
data class Box(val start: PointF) : Parcelable {

    @IgnoredOnParcel
    var end: PointF = start

    val left: Float
    get() = start.x.coerceAtMost(start.y)

    val right: Float
        get() = start.x.coerceAtLeast(end.x)

    val top: Float
        get() = start.y.coerceAtMost(end.y)

    val bottom: Float
        get() = start.y.coerceAtLeast(end.y)
}
