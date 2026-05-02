package com.example.myapplication

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        sharedPreferences = getSharedPreferences("MyNotes", MODE_PRIVATE)

        val savedNote = sharedPreferences.getString("note", "")
        binding.etNote.setText(savedNote)
        binding.etNote.setText(savedNote)
        binding.btnSave.setOnClickListener {
            val note = binding.etNote.text.toString()
            if (note.isNotEmpty()) {
                val editor = sharedPreferences.edit()
                editor.putString("note", note)
                editor.apply()
                binding.tvNote.text = "note saved successfully"
                Toast.makeText(this@MainActivity, "saved $note", Toast.LENGTH_LONG).show()
                binding.tvNote.text = note
            } else {
                binding.tvNote.text = "Please write your note"
            }
        }
    }
}