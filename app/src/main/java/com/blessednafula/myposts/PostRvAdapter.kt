package com.blessednafula.myposts

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.blessednafula.myposts.databinding.PostviewBinding
import retrofit2.http.POST

abstract class PostRvAdapter (var context: Context, var postList: List<Post>): RecyclerView.Adapter<PostRvAdapter.RetrofitViewHolder>() {
    abstract val commentActivity: Unit
    abstract val tvTitle: Any

    override fun onBindViewHolder(holder: RetrofitViewHolder, position: Int) {
            var currentItem = postList.get(position)
            with(holder.bindingView) {
            tvUserId.text= currentItem.id.toString()
                tvid.text = currentItem.userId.toString()
                tvTitle.text = currentItem.title
                tvUsername.text = currentItem.body
                val context=holder.itemView.context
                holder.bindingView.Cvposts.setOnClickListener {
                    val intent=Intent(context,commentActivity::class.java)
                    val currentPosts = null
                    intent.putExtra("POST_ID",currentPosts.id)
                    context.startActivity(intent)
            }

        }

        fun getItemCount(): Int {
            return postList.size
        }

        fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RetrofitViewHolder {
            var binding = PostviewBinding.inflate(LayoutInflater.from(context), parent, false)
            return RetrofitViewHolder(binding)
        }
    }

    class RetrofitViewHolder(var bindingView: PostviewBinding) :
        RecyclerView.ViewHolder(bindingView.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RetrofitViewHolder {
        TODO("Not yet implemented")
    }
}


