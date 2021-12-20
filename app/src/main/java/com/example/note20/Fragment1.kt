package com.example.note20

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

class Fragment1 : Fragment(R.layout.fragment_1) {
    private lateinit var noteEditText: EditText
    private lateinit var addNoteButton: Button
    private lateinit var textView: TextView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val sharedPreferences = getSharedPreferences("my_NOTES_PREF",MODE_PRIVATE)
        val text = getSharedPreferences.getString("Note", "")
        textView.text = text
        noteEditText = findViewById(R.id.editTextNote)
        addNoteButton = findViewById(R.id.buttonAdd)
        textView = findViewById(R.id.textView)
        addNoteButton.setOnClickListener{
            val note = noteEditText.text.toString()
            val text = textView.text.toString()
            val result = note +"/n"+ text
            textView.text = result
            sharedPreferences.edit()
                .putString("NOTE",result)
                .apply()
        }
    }
}