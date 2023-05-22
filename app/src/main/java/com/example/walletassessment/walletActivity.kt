package com.example.walletassessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.walletassessment.databinding.ActivityWalletBinding

class walletActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWalletBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWalletBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data : List<model> = listOf(
            model(
                "Sun, 21 May, 2023",
                "05:55 PM",
                "200",
                "DGE344DSBR515"
            ),
            model(
                "Mon, 22 May, 2023",
                "06:00 AM",
                "50",
                "DARF0A4DGDF5AD"
            ),
            model(
                "Mon, 22 May, 2023",
                "07:30 PM",
                "50",
                "FGRF5DV2DAD5GF"
            )
        )

        binding.ReViewHRs.layoutManager = LinearLayoutManager(this)
        val adapter = Adapter(this, data)
        binding.ReViewHRs.adapter = adapter
        binding.ReViewHRs.hasFixedSize()
    }
}