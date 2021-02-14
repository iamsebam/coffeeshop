package com.sebastianmatyjaszczyk.feature_landing.di

import com.sebastianmatyjaszczyk.feature_landing.LandingFeatureRepository
import com.sebastianmatyjaszczyk.feature_landing.LandingViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val landingFeatureModules
    get() = listOf(landingRepository, landingViewModel)

private val landingViewModel = module {
    viewModel {
        LandingViewModel(get())
    }
}

private val landingRepository = module {
    single {
        LandingFeatureRepository()
    }
}