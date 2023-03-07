package com.kooapps.stackybirdan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kooapps.stackybirdan.fsps.skdiwjhu.Kiwowkosijxchuzgys
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named

class MainActivity : AppCompatActivity() {
    val ijsadji by viewModel<Kiwowkosijxchuzgys>(named("MainModel"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ijsadji.vicjjicokkocxkookdsjif(this)
    }
}