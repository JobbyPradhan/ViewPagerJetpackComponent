package com.mhs.viewpagerjetpackcomponent.viewpager

import androidx.annotation.DrawableRes
import com.mhs.viewpagerjetpackcomponent.R

data class Pager(
    @DrawableRes val image : Int,
    val des:String
)

val dataList = listOf<Pager>(
    Pager(R.drawable.ic_launcher_foreground,"image1"),
    Pager(R.drawable.ic_launcher_foreground,"image2"),
    Pager(R.drawable.ic_launcher_foreground,"image3")
)