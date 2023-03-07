package com.kooapps.stackybirdan.gbvd.uwiwi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.google.android.material.snackbar.Snackbar
import com.kooapps.stackybirdan.databinding.ActivityKisokxijchgygyvBinding
import com.kooapps.stackybirdan.uhasygsdgy
import kotlin.random.Random

class Kisokxijchgygyv : AppCompatActivity() {

    private var fpepeeplws : CountDownTimer? = null
    private lateinit var apspspwoweioijdjisfhufsdhu : ActivityKisokxijchgygyvBinding
    var saidjokxokzckozxsjiaji = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        apspspwoweioijdjisfhufsdhu = ActivityKisokxijchgygyvBinding.inflate(layoutInflater)
        setContentView(apspspwoweioijdjisfhufsdhu.root)
        hgctrxrdxvgydsyg()
        wuwqjijisduhaygxcgygyz()


    }




    override fun onDestroy() {
        super.onDestroy()
        fpepeeplws?.cancel()
    }

    private fun wuwqjijisduhaygxcgygyz() = with(apspspwoweioijdjisfhufsdhu){
        val yxuxuz = uhasygsdgy[Random.nextInt(6)]
        val spwplqlpqwpko = uhasygsdgy[Random.nextInt(6)]
        val jcxjvjuhcxhuvcxhudjisji = uhasygsdgy[Random.nextInt(6)]
        val txtfzftgyugyyuhhu = uhasygsdgy[Random.nextInt(6)]

        eokowe.setImageResource(yxuxuz)
        kkcxijvijjihuhdufg.setImageResource(spwplqlpqwpko)
        llcoxookovjivhuchu.setImageResource(jcxjvjuhcxhuvcxhudjisji)
        spwplqlplplpslpokxcjzji.setImageResource(txtfzftgyugyyuhhu)


        eokowe.setOnClickListener {
            saidjokxokzckozxsjiaji = 1
            kkcxijvijjihuhdufg.alpha = 0.5f
            llcoxookovjivhuchu.alpha = 0.5f
            eokowe.alpha = 1.0f
            spwplqlplplpslpokxcjzji.alpha = 0.5f
            forkoeko.alpha = 1.0f
        }
        kkcxijvijjihuhdufg.setOnClickListener {
            saidjokxokzckozxsjiaji = 2
            kkcxijvijjihuhdufg.alpha = 1.0f
            forkoeko.alpha = 1.0f
            eokowe.alpha = 0.5f
            llcoxookovjivhuchu.alpha = 0.5f
            spwplqlplplpslpokxcjzji.alpha = 0.5f
        }
        llcoxookovjivhuchu.setOnClickListener {
            saidjokxokzckozxsjiaji = 3
            llcoxookovjivhuchu.alpha = 1.0f

            kkcxijvijjihuhdufg.alpha = 0.5f
            eokowe.alpha = 0.5f
            spwplqlplplpslpokxcjzji.alpha = 0.5f
            forkoeko.alpha = 1.0f
        }
        spwplqlplplpslpokxcjzji.setOnClickListener {
            saidjokxokzckozxsjiaji = 4
            spwplqlplplpslpokxcjzji.alpha = 1.0f
            llcoxookovjivhuchu.alpha = 0.5f
            forkoeko.alpha = 1.0f
            eokowe.alpha = 0.5f
            kkcxijvijjihuhdufg.alpha = 0.5f
        }

        forkoeko.setOnClickListener {
            if(saidjokxokzckozxsjiaji == 0){
                Snackbar.make(apspspwoweioijdjisfhufsdhu.root,"You have to choose treasure",Snackbar.LENGTH_SHORT).show()
            } else {
                startActivity(Intent(this@Kisokxijchgygyv,Hewqiqisokkdixchu::class.java)
                    .putExtra("el_check",saidjokxokzckozxsjiaji)
                    .putExtra("el_1_bor",yxuxuz)
                    .putExtra("el_2_bor",spwplqlpqwpko)
                    .putExtra("el_3_bor",jcxjvjuhcxhuvcxhudjisji)
                    .putExtra("el_4_bor",txtfzftgyugyyuhhu)
                )
                fpepeeplws?.cancel()
            }
        }

    }

    private fun hgctrxrdxvgydsyg() = with(apspspwoweioijdjisfhufsdhu){
        fpepeeplws?.cancel()
        var kkixijuhgyc = 15
        fpepeeplws = object : CountDownTimer(15000,1000){
            override fun onTick(p0: Long) {
                kkixijuhgyc --
                xkzioxcjizijsjiajiaduh.text = "Time : $kkixijuhgyc sec"
            }

            override fun onFinish() {
                kkixijuhgyc = 15
                startActivity(
                    Intent(this@Kisokxijchgygyv,Hewqiqisokkdixchu::class.java)
                        .putExtra("elb_loose","elb_loose")
                )
            }

        }.start()
    }
}