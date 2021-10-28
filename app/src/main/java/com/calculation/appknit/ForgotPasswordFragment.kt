package com.calculation.appknit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout

class ForgotPasswordFragment : Fragment() {

    lateinit var forgot_password_submit_btn: Button
    lateinit var layoutActivityMain: ConstraintLayout
    lateinit var tvSignIn: TextView
    lateinit var tvComment: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_forgot_password, container, false)

        forgot_password_submit_btn = view.findViewById(R.id.btnSubmitForgotPassword)
        forgot_password_submit_btn.setOnClickListener {
            showCustomAlert()
        }

        layoutActivityMain = view.findViewById(R.id.layoutActivityMain)
        tvSignIn = view.findViewById(R.id.tvSignIn)
        tvComment = view.findViewById(R.id.tvComment)

        tvSignIn.setOnClickListener {
            val signinFragment = SigninFragment()
            activity?.supportFragmentManager?.beginTransaction()?.add(R.id.container,signinFragment)?.commit()
        }

        tvComment.setOnClickListener {
            val commentsFragment = CommentsFragment()
            activity?.supportFragmentManager?.beginTransaction()?.add(R.id.container,commentsFragment)?.commit()
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
}