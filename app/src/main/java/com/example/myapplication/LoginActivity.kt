package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.myapplication.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //jpg logo
        Glide.with(this).load(R.raw.logo1).into(binding.logo01)

        /*//로그인 버튼
        binding.login01.setOnClickListener{
            val intent = Intent(this,~~~Activity::class.java)
            startActivity(intent)
            finish()
        }*/
        //회원가입 버튼
        binding.join01.setOnClickListener{
            val intent = Intent(this, JoinActivity::class.java)
            startActivity(intent)
            finish()
        }
        //아이디/비번 찾기 버튼
        binding.idpwSearch01.setOnClickListener{
            val intent = Intent(this, IdpwSearchActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}