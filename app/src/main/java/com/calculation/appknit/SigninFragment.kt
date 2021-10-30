package com.calculation.appknit

import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.android.volley.AuthFailureError
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.VolleyError
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.calculation.appknit.databinding.FragmentSigninBinding
import org.json.JSONException
import org.json.JSONObject

class SigninFragment : Fragment() {

    lateinit var tvNotaMember: TextView
    lateinit var btnLogin: Button
    lateinit var etEmailAddress: EditText
    lateinit var etPassword: EditText

    var login_URL = "http://54.224.217.172/development/api/user/login"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view =  inflater.inflate(R.layout.fragment_signin, container, false)

        tvNotaMember = view.findViewById(R.id.tvNotaMember)
        btnLogin = view.findViewById(R.id.btnLogin)
        etEmailAddress = view.findViewById(R.id.etEmailAddress)
        etPassword = view.findViewById(R.id.etPassword)

        btnLogin.setOnClickListener {
//            if(etEmailAddress.text.toString() == ""){
//                Toast.makeText(context,"Email address can't be empty",Toast.LENGTH_SHORT).show()
//            }
//            else if(etPassword.text.toString() == ""){
//                Toast.makeText(context,"Password can't be empty",Toast.LENGTH_SHORT).show()
//            }
//            else{
//
//            }
            loginApi();
        }

        val spannable = SpannableString("Not a member?Sign up")
        spannable.setSpan(ForegroundColorSpan(Color.RED),13,20,Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        tvNotaMember.text = spannable

        return view;
    }

    private fun loginApi() {
        var email = etEmailAddress.text.toString()
        var password = etPassword.text.toString()

        val json = JSONObject()
        json.put("email","gurlal.appknit@gmail.com")
        json.put("password","12345678")
        json.put("userType","1")

        val request = JsonObjectRequest(
            Request.Method.POST, login_URL, json, { response ->

                try {
                    val obj = response

                    var code = obj.getInt("code")
                    val message = obj.getString("message")
                    val format = obj.getString("format")

                    Log.d("response",""+response)

                    if(code == 100){
                        Toast.makeText(context,"Logged in successfully",Toast.LENGTH_SHORT).show()
                    }
                } catch (e: JSONException) {
                    e.printStackTrace()
                }
            }, { error ->

            }
        )
        // add to request queue
        Volley.newRequestQueue(context).add(request)

    }
}