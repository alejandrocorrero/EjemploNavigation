package com.example.ejemplonavigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.fragment_a.*


class AFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_a, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        button.setOnClickListener {
            findNavController().navigate(
                AFragmentDirections.actionAFragmentToBFragment(
                    "a"
                )
            )
        }

        //setupAppBar()

    }

    private fun setupAppBar() {

        var appBarConfiguration = AppBarConfiguration.Builder(findNavController().graph).build()
        NavigationUI.setupActionBarWithNavController(
            activity as AppCompatActivity,
            findNavController(),
            appBarConfiguration
        );
    }

}
