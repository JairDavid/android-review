package com.example.practice_design.views.retrofit2.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.practice_design.R
import com.example.practice_design.databinding.RetrofitItemHolderBinding
import com.example.practice_design.views.retrofit2.view.DetailRestActivity

class UserAdapter(context:Context):ListAdapter<User, UserAdapter.ViewHolder>(DiffUtilCallback) {
    private val adapterContext = context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       var item = RetrofitItemHolderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: UserAdapter.ViewHolder, position: Int) {
        holder.bind(getItem(position), position)
    }

    inner class ViewHolder(private val binding:RetrofitItemHolderBinding):RecyclerView.ViewHolder(binding.root) {
        fun bind(item: User, position: Int){
            when(item.status){
                "inactive" -> {
                    binding.colorStatus.setBackgroundColor(
                        ContextCompat.getColor(
                            adapterContext,
                            R.color.red
                        )
                    )
                }
                "active" -> {
                    binding.colorStatus.setBackgroundColor(
                        ContextCompat.getColor(
                            adapterContext,
                            R.color.green
                        )
                    )
                }
            }
            binding.retrofitUserText.text = item.name

            binding.root.setOnClickListener {
                adapterContext.apply {
                    val intent = Intent(this, DetailRestActivity::class.java)
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    intent.putExtra("id", item.id)
                    startActivity(intent)
                }
            }
        }
    }

    private object DiffUtilCallback: DiffUtil.ItemCallback<User>() {
        override fun areContentsTheSame(oldItem: User, newItem: User): Boolean {
            return  true
        }

        override fun areItemsTheSame(oldItem: User, newItem: User): Boolean {
            return newItem == oldItem
        }
    }

}