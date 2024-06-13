package com.tylermappes.myapplication.freshfinds

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_genre_selection.*

class GenreSelectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_genre_selection)

        buttonNext.setOnClickListener {
            // Retrieves userType from intent extras
            val userType = intent.getStringExtra("userType")

            // Initialize intent based on userType
            val nextIntent = when (userType) {
                "artist" -> Intent(this, ArtistDetailsActivity::class.java)
                "listener" -> Intent(this, ListenerDetailsActivity::class.java)
                else -> null
            }

            // Checks if nextIntent and starts activity
            nextIntent?.let {
                startActivity(it)
                finish() // Finish this activity after starting next activity
            }
        }
    }
}

