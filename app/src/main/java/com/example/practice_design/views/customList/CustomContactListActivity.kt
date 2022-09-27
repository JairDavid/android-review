package com.example.practice_design.views.customList

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practice_design.MainMenuActivity
import com.example.practice_design.databinding.ActivityCustomContactListBinding
import com.example.practice_design.domain.Person

class CustomContactListActivity : AppCompatActivity() {
    lateinit var binding: ActivityCustomContactListBinding
    var data: MutableList<Person> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCustomContactListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        data.add(Person("Jose","Smith","asdsfasfda","3124","https://cdn.dribbble.com/users/1577045/screenshots/4914645/media/028d394ffb00cb7a4b2ef9915a384fd9.png"))
        data.add(Person("Daniel","Smith","dgdfhdfhdfg","12421","https://t3.ftcdn.net/jpg/03/91/19/22/360_F_391192211_2w5pQpFV1aozYQhcIw3FqA35vuTxJKrB.jpg"))
        data.add(Person("Maria","Smith","vfrgeerthn","45242","https://dl.memuplay.com/new_market/img/com.vicman.newprofilepic.icon.2022-06-07-21-33-07.png"))
        data.add(Person("Bernardo","Smith","afdfsdgbvs","345457","https://www.rd.com/wp-content/uploads/2017/09/01-shutterstock_476340928-Irina-Bg.jpg"))
        data.add(Person("Ken","Smith","fsdvsdghrss","234346","https://www.jokesforfunny.com/wp-content/uploads/2021/06/0596bdb89b60fe771acd2f5972a9d3e3-905x1200.jpg"))
        data.add(Person("Malí","Smith","jfyfjrthdrt","234235","https://i.pinimg.com/736x/e4/12/a2/e412a293b8c27167eab647f8927fcbe0.jpg"))

        binding.recyclerListView.layoutManager = LinearLayoutManager(this)
        var adapter = ContactAdapter(this)
        binding.recyclerListView.adapter = adapter
        adapter.submitList(data)
        adapter.notifyDataSetChanged()

        binding.backRecyclerMenu.setOnClickListener{
            startActivity(Intent(this, MainMenuActivity::class.java))
            finish()
        }

    }
}