package com.example.remindersexcersise.java.Repository

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.remindersexcersise.java.Dao.RemindersDao
import com.example.remindersexcersise.java.Database.ReminderRoomDatabase
import com.example.remindersexcersise.java.Model.Reminder

class ReminderRepository(context: Context) {

    private var reminderDao: RemindersDao

    init {
        val reminderRoomDatabase = ReminderRoomDatabase.getDatabase(context)
        reminderDao = reminderRoomDatabase!!.reminderDao()
    }

    fun getAllReminders() : LiveData<List<Reminder>> {
        return reminderDao?.getAllReminders() ?: MutableLiveData(emptyList())
    }

    suspend fun insertReminder(reminder: Reminder) {
        reminderDao.insertReminder(reminder)
    }

    suspend fun deleteReminder(reminder: Reminder) {
        reminderDao.deleteReminder(reminder)
    }

    suspend fun deleteAllReminders() {
        reminderDao.deleteAllReminders()
    }


    suspend fun updateReminder(reminder: Reminder) {
        reminderDao.updateReminder(reminder)
    }
}
