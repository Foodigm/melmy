package com.melmy.melmyprototype.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.melmy.melmyprototype.data.MissionRepository

class MissionListViewModelFactory(
        private val repository: MissionRepository)
    : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MissionListViewModel(repository) as T
    }
}