package com.example.recicleviewejemplo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recicleviewejemplo.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val fakeVideoData: Array<JSONObject> = arrayOf(
            JSONObject("{\"title\": \"An awesome video title\", \"channel\": \"ChannelName\", \"views\": \"6k views\", \"datePosted\": \"5 days ago\", \"duration\": \"05:00\"}"),
            JSONObject("{\"title\": \"Car\", \"channel\": \"CarVision\", \"views\": \"8k views\", \"datePosted\": \"5 days ago\", \"duration\": \"05:00\"}"),
            JSONObject("{\"title\": \"Sofi\", \"channel\": \"SofiVision\", \"views\": \"10k views\", \"datePosted\": \" days ago\", \"duration\": \"05:25\"}"),
            JSONObject("{\"title\": \"Chilo\", \"channel\": \"ChiloVision\", \"views\": \"150k views\", \"datePosted\": \"A month ago\", \"duration\": \"05:02\"}"),
            JSONObject("{\"title\": \"John\", \"channel\": \"JohnVision\", \"views\": \"254k views\", \"datePosted\": \"2 years ago\", \"duration\": \"0:00\"}")
        )

        binding.rvVideoEntries.adapter = MainAdapter(fakeVideoData)
    }
}