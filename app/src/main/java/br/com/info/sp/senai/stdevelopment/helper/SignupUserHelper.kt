package br.com.info.sp.senai.stdevelopment.helper

import android.widget.EditText
import br.com.info.sp.senai.stdevelopment.R
import br.com.info.sp.senai.stdevelopment.activity.SignupActivity
import br.com.info.sp.senai.stdevelopment.model.User

/**
 * Created by Rafael on 11/03/2018.
 */

class SignupUserHelper {

    var name: EditText? = null
    var email: EditText? = null
    var password: EditText? = null
    var user: User? = null

    constructor (signupActivity: SignupActivity) {
        this.name = signupActivity.findViewById(R.id.etUsername)
        this.email = signupActivity.findViewById(R.id.etEmail)
        this.password = signupActivity.findViewById(R.id.etPassword)
        this.user = User()
    }
}