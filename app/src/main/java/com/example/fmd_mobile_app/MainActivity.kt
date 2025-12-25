package com.example.fmd_mobile_app

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.fmd_mobile_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // ViewBinding instance
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up button click listener
        binding.btnSave.setOnClickListener {
            saveProfile()
        }
    }

    private fun saveProfile() {
        // Get values from input fields
        val name = binding.etName.text.toString().trim()
        val email = binding.etEmail.text.toString().trim()
        val phone = binding.etPhone.text.toString().trim()
        val bio = binding.etBio.text.toString().trim()

        // Validate inputs
        when {
            name.isEmpty() -> {
                binding.tilName.error = "Name is required"
                return
            }
            email.isEmpty() -> {
                binding.tilEmail.error = "Email is required"
                return
            }
            phone.isEmpty() -> {
                binding.tilPhone.error = "Phone is required"
                return
            }
            else -> {
                // Clear any previous errors
                binding.tilName.error = null
                binding.tilEmail.error = null
                binding.tilPhone.error = null

                // Show success message with user data
                val message = """
                    Profile Saved!
                    Name: $name
                    Email: $email
                    Phone: $phone
                    Bio: ${bio.ifEmpty { "No bio provided" }}
                """.trimIndent()

                Toast.makeText(this, message, Toast.LENGTH_LONG).show()
            }
        }
    }
}