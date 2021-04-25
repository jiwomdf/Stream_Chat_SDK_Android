package id.kjsindonesia.ia.streamchatsdkforandroid.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ChatUser(
    val firstName: String,
    val username: String
) : Parcelable
