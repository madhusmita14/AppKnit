package com.calculation.appknit

import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.calculation.appknit.databinding.FragmentSigninBinding

class SigninFragment : Fragment() {

    lateinit var tvNotaMember: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view =  inflater.inflate(R.layout.fragment_signin, container, false)

        tvNotaMember = view.findViewById(R.id.tvNotaMember)

        val spannable = SpannableString("Not a member?Sign up")
        spannable.setSpan(ForegroundColorSpan(Color.RED),13,20,Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        tvNotaMember.text = spannable

        return view;
    }
}