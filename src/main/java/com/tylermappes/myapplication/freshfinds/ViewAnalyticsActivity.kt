package com.tylermappes.myapplication.freshfinds

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tylermappes.myapplication.freshfinds.R
import kotlinx.android.synthetic.main.activity_view_analytics.*

class ViewAnalyticsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_analytics)

        // Implement functionality to view analytics

        // Example of updating the chart and listener count
        buttonYTD.setOnClickListener {
            // Update chart for Year to Date
        }

        buttonMonthly.setOnClickListener {
            // Update chart for Monthly
        }

        buttonWeekly.setOnClickListener {
            // Update chart for Weekly
        }

        buttonDaily.setOnClickListener {
            // Update chart for Daily
        }

        buttonBackToHome.setOnClickListener {
            finish()
        }
    }
}
