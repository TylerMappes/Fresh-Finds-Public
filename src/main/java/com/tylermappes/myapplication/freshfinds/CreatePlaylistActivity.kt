package com.tylermappes.myapplication.freshfinds

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_create_playlist.*

class CreatePlaylistActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_playlist)

        buttonCreate.setOnClickListener {
            val playlistName = editTextPlaylistName.text.toString().trim()

            // Check if the playlist name is not empty
            if (playlistName.isNotEmpty()) {
                // Save playlist functionality (example: using Intent extras)
                val intent = Intent()
                intent.putExtra("playlistName", playlistName)
                setResult(RESULT_OK, intent)
                finish()
            } else {
                // prompts the user to enter a playlist name
                editTextPlaylistName.error = "Please enter a playlist name"
            }
        }
    }
}

