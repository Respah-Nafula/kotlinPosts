package com.blessednafula.myposts

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.blessednafula.myposts.databinding.ActivityCommentBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.http.POST

class CommentActivity : AppCompatActivity() {
    lateinit var binding:ActivityCommentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCommentBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun obtainPostsId(){
        var postId = intent.extras?.getInt("POST_ID") ?: 0
    }
}
fun fetchPostById(){

    var apiClient = ApiClient.buildapiClient(ApiInterface::class.java)
    val postId = 0
    var request=apiClient.getPostsById(postId)

    request.enqueue(object : Callback<Post>{
        override fun onResponse(call: Call<Post>, response: Response<Post>) {
            if(response.isSuccessful){
                var post=response.body()
                val binding = null
                binding..text = post?.title
                binding.tvbody.text = post?.body

//                binding.tvBody.text= post?.title
//                binding.tvBody.text = post?.body
            }
        }

        override fun onFailure(call: Call<Post>, t: Throwable) {
            val baseContext = null
            Toast.makeText(baseContext,t.message,Toast.LENGTH_LONG)
        }
    })
}
fun fetchComments(){
    var ApiClient=ApiClient.buildapiClient((ApiInterface::class.java))
    var response=ApiInterface.getPostsById()
}