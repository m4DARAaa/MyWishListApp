package com.example.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish_table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo("wish_title")
    val title: String = "",
    @ColumnInfo("wish_desc")
    val description: String = ""
)

object DummyWish {
    val wishList = listOf(
        Wish(title = "monitor", description = "2k/ 240Hz"),
        Wish(title = "vga", description = "rx6800xt"),
        Wish(title = "cpu", description = "ryzen 7 9800x3d")


    )
}