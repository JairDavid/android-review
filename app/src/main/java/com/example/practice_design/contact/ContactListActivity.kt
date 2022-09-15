package com.example.practice_design.contact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.practice_design.databinding.ActivityContactListBinding

class ContactListActivity : AppCompatActivity() {
    lateinit var binding:ActivityContactListBinding
    var data:List<String> = listOf("1","2","3","4","5","6","7","8","9","11","12","13","14","15","16")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var adapter:ArrayAdapter<String> =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, data)
        binding.contactList.adapter = adapter
        adapter.notifyDataSetChanged()

        binding.contactList.setOnItemClickListener { adapterView, view, index, id ->
            Toast.makeText(this,data[index], Toast.LENGTH_SHORT).show()
        }
    }
}