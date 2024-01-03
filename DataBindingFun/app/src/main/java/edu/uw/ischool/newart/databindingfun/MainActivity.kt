package edu.uw.ischool.newart.databindingfun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import androidx.databinding.DataBindingUtil
import edu.uw.ischool.newart.databindingfun.databinding.ActivityMainBinding

fun String.toEditable() : Editable =
    Editable.Factory.getInstance().newEditable(this)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.edtPlayerName.text = "Fred".toEditable()
        binding.chkPlayerActive.isActivated = true
        binding.swtPlayerType.isActivated = false
    }
}
