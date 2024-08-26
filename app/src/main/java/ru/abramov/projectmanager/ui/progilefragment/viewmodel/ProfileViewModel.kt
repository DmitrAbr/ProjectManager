package ru.abramov.projectmanager.ui.progilefragment.viewmodel

import androidx.lifecycle.ViewModel
import ru.abramov.projectmanager.ui.progilefragment.repository.ProfileRepository

class ProfileViewModel(val profileRepository: ProfileRepository):ViewModel() {
    constructor(): this(ProfileRepository())

    fun loadDataTeam() = profileRepository.teamItem
    fun loadDataArchive() = profileRepository.archiveItems
}