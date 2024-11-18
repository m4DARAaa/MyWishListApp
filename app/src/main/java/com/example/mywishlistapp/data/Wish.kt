package com.example.mywishlistapp.data

data class Wish(val id: Long = 0L,
                val title: String = "",
                val description: String = "")
object DummyWish{
    val wishList= listOf(
        Wish(title = "monitor", description = "2k/ 240Hz"),
        Wish(title = "vga", description = "rx6800xt"),
        Wish(title = "cpu", description = "ryzen 7 9800x3d")





    )
}