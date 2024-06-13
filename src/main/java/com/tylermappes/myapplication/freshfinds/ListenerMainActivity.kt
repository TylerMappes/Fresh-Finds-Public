package com.tylermappes.myapplication.freshfinds

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_listener_main.*

class ListenerMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listener_main)

        // Initializes the "You May Like" section with initial suggestions
        initYouMayLikeSection()

        // Button click listeners
        buttonBrowseMore.setOnClickListener {
            // Replaces the current suggestions with new ones
            refreshYouMayLikeSection()
        }

        buttonCreatePlaylist.setOnClickListener {
            // Navigate to create playlist screen
            val intent = Intent(this, CreatePlaylistActivity::class.java)
            startActivity(intent)
        }

        buttonAddToPlaylist.setOnClickListener {
            // Navigate to add to playlist screen
            val intent = Intent(this, AddToPlaylistActivity::class.java)
            startActivity(intent)
        }

        buttonViewAllPlaylists.setOnClickListener {
            // Navigate to view all playlists screen
            val intent = Intent(this, ViewAllPlaylistsActivity::class.java)
            startActivity(intent)
        }

        buttonReturnToMain.setOnClickListener {
            // Navigate back to main screen
            finish()
        }
    }

    private fun initYouMayLikeSection() {
        // TODO: Initialize the "You May Like" section with initial suggestions
        // This might involve fetching data based on user preferences (favorite genres)
    }

    private fun refreshYouMayLikeSection() {
        // TODO: Replace the current suggestions in the "You May Like" section with new ones
    }
}
