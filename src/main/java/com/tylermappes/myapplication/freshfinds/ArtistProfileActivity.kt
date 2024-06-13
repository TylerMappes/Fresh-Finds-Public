package com.tylermappes.myapplication.freshfinds

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tylermappes.myapplication.freshfinds.R
import kotlinx.android.synthetic.main.activity_artist_profile.*

class ArtistProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_artist_profile)

        buttonUploadPicture.setOnClickListener {
            val intent = Intent(this, UploadPictureActivity::class.java)
            startActivity(intent)
        }

        buttonCreateBiography.setOnClickListener {
            val intent = Intent(this, CreateBiographyActivity::class.java)
            startActivity(intent)
        }

        buttonViewAnalytics.setOnClickListener {
            val intent = Intent(this, ViewAnalyticsActivity::class.java)
            startActivity(intent)
        }

        buttonUploadTrack.setOnClickListener {
            // Add upload track activity here
        }

        buttonBackToHome.setOnClickListener {
            finish()
        }
    }
}
