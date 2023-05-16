package com.example.control.game_screen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.control.data.Level
import com.example.control.data.LevelRepository

class gameViewModule(
    private val repo: LevelRepository,
) : ViewModel() {

    var dialogType = 0

    private val _passStatus = MutableLiveData<Boolean>()
    val passStatus: LiveData<Boolean>
        get() = _passStatus

    private val _nextEvent = MutableLiveData<Boolean>()
    val nextEvent: LiveData<Boolean>
        get() = _nextEvent

    private val _currentGameID = MutableLiveData<Int>()
    val currentGameID: LiveData<Int>
        get() = _currentGameID

    private val _additionalInfoShow = MutableLiveData<Boolean>()
    val additionalInfoShow: LiveData<Boolean>
        get() = _additionalInfoShow

    init {
        _passStatus.postValue(false)
        _additionalInfoShow.postValue(false)
    }

    fun goToNexEvent() {
        _nextEvent.postValue(true)
    }

    fun setId(id: Int) {
        repo.setCurrentLevelId(id)
    }

    fun getCurrentLevel(): Level {
        return repo.getCurrentLevel()
    }

    fun saveLevelId(save: (id: Int) -> Unit) {
        save(repo.getCurrentLevelId())
    }

    fun additionalInfoHide() {
        _additionalInfoShow.postValue(false)
    }

    fun passStatusHide() {
        _passStatus.postValue(false)
    }

    fun additionalInfoShow() {
        _additionalInfoShow.postValue(true)
    }

    fun passStatusShow() {
        _passStatus.postValue(true)
    }
}
