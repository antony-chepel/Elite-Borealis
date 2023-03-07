package com.kooapps.stackybirdan.gbvd.uwiwi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.kooapps.stackybirdan.asisjdajisij
import com.kooapps.stackybirdan.databinding.ActivityHewqiqisokkdixchuBinding
import com.kooapps.stackybirdan.dsuidshuf
import kotlin.random.Random

class Hewqiqisokkdixchu : AppCompatActivity() {
    private lateinit var fodkkokoxokzokcko : ActivityHewqiqisokkdixchuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fodkkokoxokzokcko = ActivityHewqiqisokkdixchuBinding.inflate(layoutInflater)
        setContentView(fodkkokoxokzokcko.root)
        fokewkokoewkorko()
    }


    private fun fokewkokoewkorko() = with(fodkkokoxokzokcko){

        dosoaokxkozckkoz.setOnClickListener {
            startActivity(Intent(this@Hewqiqisokkdixchu,Kisokxijchgygyv::class.java))
        }

        nvcjbuij.setOnClickListener {
            finishAffinity()
        }
        val gotkrkoijjijizxchuhuzx = intent.getIntExtra("el_check",1)
        val fewpl = intent.getStringExtra("elb_loose")
        val aplalppsllpslpkocjixhuczhu = intent.getIntExtra("el_1_bor", 0)
        val goktkorkokodskofko = intent.getIntExtra("el_2_bor", 0)
        val fplelpwlplpsadlppdsaokxcijz = intent.getIntExtra("el_3_bor", 0)
        val hjjivcjib = intent.getIntExtra("el_4_bor", 0)

        if(fewpl == "elb_loose"){
            fplslpdlp.text = "Time is over, try again"
        }
        if(aplalppsllpslpkocjixhuczhu != 0){
            imageView.setImageResource(aplalppsllpslpkocjixhuczhu)
        }
        if(goktkorkokodskofko != 0){
            imageView.setImageResource(goktkorkokodskofko)
        }
        if(fplelpwlplpsadlppdsaokxcijz != 0){
            imageView.setImageResource(fplelpwlplpsadlppdsaokxcijz)
        }
        if(hjjivcjib != 0){
            imageView.setImageResource(hjjivcjib)
        }
        val nvucbygcyhuhucx = dsuidshuf[Random.nextInt(4)]
        val dpewelplplpwqlpkosdjixuhc = asisjdajisij[Random.nextInt(8)]
        if(gotkrkoijjijizxchuhuzx == nvucbygcyhuhucx && fewpl != "elb_loose"){
            fplslpdlp.text = "Congratulate, you found artifact!"
            kcxkvuixcjhuxchu.visibility = View.VISIBLE
            kcxkvuixcjhuxchu.text = "You got $dpewelplplpwqlpkosdjixuhc elite scores"
        }

    }
}