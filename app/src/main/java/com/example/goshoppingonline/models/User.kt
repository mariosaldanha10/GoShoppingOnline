package com.example.goshoppingonline.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

class User(uid: String, trim: String, trim1: String, trim2: String) {


@Parcelize
    data class User(
        val id: String = "",
        val firstName: String = "",
        val lastName: String = "",
        val email: String = "",
        val image: String = "",
        val mobile: Long = 0,
        val gender: String = "",
        val profileCompleted: Int = 0
): Parcelable

}