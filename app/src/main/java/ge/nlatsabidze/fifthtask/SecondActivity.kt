package ge.nlatsabidze.fifthtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import ge.nlatsabidze.fifthtask.databinding.ActivityMainBinding

import ge.nlatsabidze.fifthtask.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val emailKey = "email"
        val passwordKey = "password"

        val email = intent.getStringExtra(emailKey)
        val password = intent.getStringExtra(passwordKey)

        binding.txtEmail.apply {
            text = email
        }

        binding.txtId.apply {
            text = password
        }
    }
}