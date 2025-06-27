package com.iiiivivii.workoutrpg

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tvLevel: TextView
    private lateinit var progressBicep: ProgressBar
    private lateinit var progressChest: ProgressBar
    private lateinit var progressCore: ProgressBar
    private lateinit var progressLeg: ProgressBar
    private lateinit var btnStartWorkout: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Bind UI
        tvLevel = findViewById(R.id.tvLevel)
        progressBicep = findViewById(R.id.progressBicep)
        progressChest = findViewById(R.id.progressChest)
        progressCore = findViewById(R.id.progressCore)
        progressLeg = findViewById(R.id.progressLeg)
        btnStartWorkout = findViewById(R.id.btnStartWorkout)

        // Dummy data XP
        val bicepXP = 45
        val chestXP = 70
        val coreXP = 30
        val legXP = 20

        val totalXP = bicepXP + chestXP + coreXP + legXP
        val totalLevel = totalXP / 100

        // Tampilkan level
        tvLevel.text = getString(R.string.total_level_text, totalLevel)

        // Update progress bar
        progressBicep.progress = bicepXP
        progressChest.progress = chestXP
        progressCore.progress = coreXP
        progressLeg.progress = legXP

        // Tombol navigasi ke halaman pemilihan bagian tubuh
        btnStartWorkout.setOnClickListener {
            val intent = Intent(this, SelectBodyPartActivity::class.java)
            startActivity(intent)
        }
    }
}
