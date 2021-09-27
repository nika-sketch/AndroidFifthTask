package ge.nlatsabidze.fifthtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import ge.nlatsabidze.fifthtask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val emailKey = "email"
        val passwordKey = "password"

        val email = binding.etEmail
        val password = binding.etPassword
        val saveBtn = binding.btnSave

        saveBtn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra(emailKey, email.text.toString())
                putExtra(passwordKey, password.text.toString())
            }
            startActivity(intent)
        }
    }
}