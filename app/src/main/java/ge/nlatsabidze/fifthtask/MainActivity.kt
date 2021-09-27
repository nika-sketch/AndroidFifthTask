package ge.nlatsabidze.fifthtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.text.TextUtils
import android.util.Patterns
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
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
            if (isValidEmail(email.text.toString()) && password.text.toString().length != 0) {
                startActivity(intent)
            } else {
                Toast.makeText(applicationContext, "Wrong email or password", LENGTH_SHORT).show()
            }
        }
    }

    private fun isValidEmail(email: String): Boolean {
        return !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
}