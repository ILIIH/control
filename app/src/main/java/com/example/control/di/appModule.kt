package com.example.control.di

import com.example.control.data.LevelRepository
import com.example.control.game_screen.gameViewModule
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel {
        gameViewModule(get())
    }
    single {
        LevelRepository()
    }
}
