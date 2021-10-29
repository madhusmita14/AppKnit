package com.calculation.appknit

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import com.android.volley.AuthFailureError
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.VolleyError
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONException
import org.json.JSONObject

class ForgotPasswordFragment : Fragment() {

    lateinit var forgot_password_submit_btn: Button
    lateinit var layoutActivityMain: ConstraintLayout
    lateinit var tvSignIn: TextView
    lateinit var tvComment: TextView
    lateinit var tvTab: TextView
    lateinit var etEmailForgotPassword: EditText

    var forgotPassword_URL = "http://54.224.217.172/development/api//user/resendVerification"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_forgot_password, container, false)

        forgot_password_submit_btn = view.findViewById(R.id.btnSubmitForgotPassword)
        forgot_password_submit_btn.setOnClickListener {
            //showCustomAlert()
            forgotPasswordApi()
        }

        layoutActivityMain = view.findViewById(R.id.layoutActivityMain)
        tvSignIn = view.findViewById(R.id.tvSignIn)
        tvComment = view.findViewById(R.id.tvComment)
        tvTab = view.findViewById(R.id.tvTab)
        etEmailForgotPassword  = view.findViewById(R.id.etEmailForgotPassword)

        tvSignIn.setOnClickListener {
            val signinFragment = SigninFragment()
            activity?.supportFragmentManager?.beginTransaction()?.add(R.id.container,signinFragment)?.commit()
        }

        tvComment.setOnClickListener {
            val commentsFragment = CommentsFragment()
            activity?.supportFragmentManager?.beginTransaction()?.add(R.id.container,commentsFragment)?.commit()
        }

        tvTab.setOnClickListener {
            val intent = Intent(this@ForgotPasswordFragment.requireContext(),TabsActivity::class.java)
            startActivity(intent);
        }

        return view
    }

    private fun showCustomAlert() {
        val dialogView = layoutInflater.inflate(R.layout.forgot_password_dialogbox, null)
        val customDialog = AlertDialog.Builder(requireContext())
            .setView(dialogView)
            .show()

        val forgot_password_dialog_ok_btn = dialogView.findViewById<Button>(R.id.forgot_password_dialog_ok_btn)
        forgot_password_dialog_ok_btn.setOnClickListener {
            customDialog.dismiss()
        }
    }

    private fun forgotPasswordApi() {
        var email_str = etEmailForgotPassword.text.toString()
        val stringRequest =
            object : StringRequest(
                Request.Method.POST, forgotPassword_URL, Response.Listener<String>
                { response ->
                    try {
                        val obj = JSONObject(response)
                        var code = obj.getInt("code")
                        var message = obj.getString("message")
                        var format = obj.getString("format")

                        //Toast.makeText(context,""+message,Toast.LENGTH_SHORT).show()
                        Log.d("response",""+response)

                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                },
                object : Response.ErrorListener {
                    override fun onErrorResponse(error: VolleyError?) {
                        Log.d("message",""+error?.message)
                    }

                })
            {
                override fun getParams(): MutableMap<String, String> {
                    return params
                }

                override fun getBodyContentType(): String {
                    return "text/html"
                }

                @Throws(AuthFailureError::class)
                override fun getBody(): ByteArray? {
                    val params2 = HashMap<String, String>()
                    params2.put("email","nandita.appknit@gmail.com")
                    params2.put("requestType","1")
                    params2.put("userType","1")
                    return JSONObject(params2 as Map<*, *>).toString().toByteArray()
                }
            }

        Volley.newRequestQueue(context).add(stringRequest)
    }
}