package com.blessednafula.myposts

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.blessednafula.myposts.databinding.PostviewBinding

class PostRvAdapter (var context: Context, var postList: List<Post>): RecyclerView.Adapter<RetrofitViewHolder>() {


        override fun onBindViewHolder(holder: RetrofitViewHolder, position: Int) {
            var currentItem = postList.get(position)
            with(holder.bindingView) {
            tvUserId.text= currentItem.id.toString()
                tvid.text = currentItem.userId.toString()
                tvTitle.text = currentItem.title
                tvUsername.text = currentItem.body
            }

        }

        override fun getItemCount(): Int {
            return postList.size
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RetrofitViewHolder {
            var binding = PostviewBinding.inflate(LayoutInflater.from(context), parent, false)
            return RetrofitViewHolder(binding)
        }
    }

    class RetrofitViewHolder(var bindingView: PostviewBinding) :
        RecyclerView.ViewHolder(bindingView.root) {

    }

