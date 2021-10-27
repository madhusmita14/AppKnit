package com.calculation.appknit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentTransaction
import com.calculation.appknit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var forgot_password_submit_btn: Button
    lateinit var layoutActivityMain: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        forgot_password_submit_btn = binding.btnSubmitForgotPassword
        forgot_password_submit_btn.setOnClickListener {
            showCustomAlert()
        }

        layoutActivityMain = binding.layoutActivityMain
    }

    private fun showCustomAlert() {
        val dialogView = layoutInflater.inflate(R.layout.forgot_password_dialogbox, null)
        val customDialog = AlertDialog.Builder(this)
            .setView(dialogView)
            .show()

        val forgot_password_dialog_ok_btn = dialogView.findViewById<Button>(R.id.forgot_password_dialog_ok_btn)
        forgot_password_dialog_ok_btn.setOnClickListener {
            customDialog.dismiss()

            layoutActivityMain.visibility = View.GONE
            var mainFragment: SigninFragment = SigninFragment()
            supportFragmentManager.beginTransaction().add(R.id.container, mainFragment).commit()
        }
    }
}