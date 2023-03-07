package com.kooapps.stackybirdan.gbvd

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.kooapps.stackybirdan.fsps.Bxpslplpdokijedhuf
import com.kooapps.stackybirdan.fsps.Repwlpslpxc
import com.kooapps.stackybirdan.fsps.Uowkskojixcji
import com.kooapps.stackybirdan.fsps.Losijshu
import com.kooapps.stackybirdan.fsps.skdiwjhu.Jowokkwoisjxc
import com.kooapps.stackybirdan.fsps.skdiwjhu.Kiwowkosijxchuzgys
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val cokkoxkokxijvhud = module {

    single  <Uowkskojixcji> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(Uowkskojixcji::class.java)
    }

    single <Bxpslplpdokijedhuf> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(Bxpslplpdokijedhuf::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://eliteborealis.xyz/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        Repwlpslpxc(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        Losijshu(get(named("HostInter")))
    }
    single{
        kmkckmxmkmkvkmijhuhfud()
    }
    single (named("SharedPreferences")) {
        goktokrkokoe(androidApplication())
    }
}

fun goktokrkokoe(kohkobkovok: Application): SharedPreferences {
    return kohkobkovok.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun kmkckmxmkmkvkmijhuhfud(): Gson {
    return GsonBuilder().create()
}

val vobokkovkoijfd = module {
    viewModel (named("MainModel")){
        Kiwowkosijxchuzgys((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        Jowokkwoisjxc(get())
    }
}