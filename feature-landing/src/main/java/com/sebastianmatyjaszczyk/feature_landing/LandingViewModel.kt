package com.sebastianmatyjaszczyk.feature_landing

import androidx.lifecycle.ViewModel

class LandingViewModel(
    private val repository: LandingFeatureRepository
) : ViewModel() {

    val appName
        get() = repository.appName
}