package com.tylermappes.myapplication.freshfinds

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_user_type_selection.*

class UserTypeSelectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_type_selection)

        buttonListener.setOnClickListener {
            val intent = Intent(this, GenreSelectionActivity::class.java)
            intent.putExtra("userType", "listener")
            startActivity(intent)
        }

        buttonArtist.setOnClickListener {
            val intent = Intent(this, GenreSelectionActivity::class.java)
            intent.putExtra("userType", "artist")
            startActivity(intent)
        }
    }
}
