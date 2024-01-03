package edu.uw.ischool.newart.viewbindingfun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import edu.uw.ischool.newart.viewbindingfun.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGo.setOnClickListener { btn ->
            Toast.makeText(this, "Greetings ${binding.edtFirstName.text}!",Toast.LENGTH_SHORT).show()
        }
    }
}
