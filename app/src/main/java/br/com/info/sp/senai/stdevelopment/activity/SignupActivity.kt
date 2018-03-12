package br.com.info.sp.senai.stdevelopment.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import br.com.info.sp.senai.stdevelopment.R
import br.com.info.sp.senai.stdevelopment.dao.UserDAO
import br.com.info.sp.senai.stdevelopment.helper.SignupUserHelper
import br.com.info.sp.senai.stdevelopment.model.User

class SignupActivity : AppCompatActivity() {

    private var helper: SignupUserHelper? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val tvLoginAccount = findViewById<TextView>(R.id.tvLoginAccount)
        tvLoginAccount.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        val btnSignup = findViewById<Button>(R.id.btnSignup)
        btnSignup.setOnClickListener({
            val intent = Intent(this, LoginActivity::class.java)
            var dao: UserDAO = UserDAO(this)
            startActivity(intent)
        })


    }
}
