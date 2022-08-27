package com.blessednafula.myposts

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.blessednafula.myposts.databinding.ActivityCommentBinding

class commentRvadapter(var comments:List<Comment>):RecyclerView.Adapter<CommentsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentsViewHolder {
        var binding=ActivityCommentBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CommentsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CommentsViewHolder, position: Int) {
        var currentComments:comments.get(position)
        with(holder.binding){
            tvTitle=currentComments.title
            tvBody.currentComments.
        }
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}
class CommentsViewHolder(var binding: ActivityCommentBinding):RecyclerView.ViewHolder(binding.root)