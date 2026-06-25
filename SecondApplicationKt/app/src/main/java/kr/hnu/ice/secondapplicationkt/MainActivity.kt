package kr.hnu.ice.secondapplicationkt

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import coil.load

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ImageView>(R.id.worldcupImage).load(
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQQB9QsUSyKQ3ZKpmGNuZ7MxLeQXe3aVnZObm8lsLFYpv_GgkJ-BNRcU4c&s=10"
        ) {
            crossfade(true)
        }
    }
}