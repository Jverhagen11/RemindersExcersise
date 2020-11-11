package com.example.remindersexcersise.java.Dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.remindersexcersise.java.Model.Reminder

@Dao
interface RemindersDao {

    @Query("SELECT * FROM reminderTable")
    fun getAllReminders(): LiveData<List<Reminder>>

    @Insert
    suspend fun insertReminder(reminder: Reminder)


    @Query("DELETE FROM reminderTable")
    suspend fun deleteAllReminders()

    @Update
    suspend fun updateReminder(reminder: Reminder)

    @Delete
    suspend fun deleteReminder(reminder: Reminder)
}