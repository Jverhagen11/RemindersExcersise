package com.example.remindersexcersise.java.Viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.remindersexcersise.java.Model.Reminder
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

class RemindersViewModel(application: Application)  : AndroidViewModel(application) {

//    private val ioScope = CoroutineScope(Dispatchers.IO)
//    private val reminderRepository = ReminderRepository(application.applicationContext)
//    val reminders: LiveData<List<Reminder>> = reminderRepository.getAllReminders()
}