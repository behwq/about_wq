package com.example.about

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.about.databinding.FragmentUpdatePasswordBinding
import com.google.android.gms.common.util.DataUtils
import kotlinx.android.synthetic.main.activity_update.*

class updatePassowrd : Fragment() {

    private lateinit var binding: FragmentUpdatePasswordBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_update_password,
            container,
            false
        )

        binding.upBtn.setOnClickListener{
            uppassuppass()
        }
        return binding.root
    }

    private fun uppassuppass(){
        if (currentpass.text.isNotEmpty() && newpass.text.isNotEmpty() && confirmpass.text.isNotEmpty()){
            if (newpass.text.toString()== currentpass.text.toString()){
                //            val user =auth.currentUser
            }
            else{
                Toast.makeText(activity,"Password Does Not Match", Toast.LENGTH_SHORT).show()

            }
        }
        else{
            Toast.makeText(activity,"Please fill out all the fields", Toast.LENGTH_SHORT).show()
        }

    }

    override fun onResume() {
        super.onResume()

        // Set title bar
        (activity as MainActivity).setActionBarTitle("Update Password")
    }
}
