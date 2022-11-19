package com.yatik.socialconnect

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yatik.socialconnect.databinding.ActivityCreatePostBinding
import com.yatik.socialconnect.model.PostDao

class CreatePostActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCreatePostBinding
    private lateinit var postDao: PostDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreatePostBinding.inflate(layoutInflater)
        setContentView(binding.root)

        postDao = PostDao()

        binding.postButton.setOnClickListener {
            val input = binding.postInput.text.toString().trim()
            if(input.isNotEmpty()) {
                postDao.addPost(input)
                finish()
            }
        }
    }
}