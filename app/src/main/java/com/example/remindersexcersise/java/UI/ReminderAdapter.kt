package com.example.remindersexcersise.java.UI

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.remindersexcersise.R
import com.example.remindersexcersise.databinding.FragmentFirstBinding
import com.example.remindersexcersise.databinding.FragmentItemRemindersRvBinding
import com.example.remindersexcersise.databinding.FragmentSecondBinding
import com.example.remindersexcersise.java.Model.Reminder

class ReminderAdapter(private val reminders: List<Reminder>):
    RecyclerView.Adapter<ReminderAdapter.ViewHolder>() {


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val binding = FragmentItemRemindersRvBinding.bind(itemView)


        fun databind(reminder: Reminder) {
            binding.tvReminder.text = reminder.reminderText
//            itemView.tvReminder.text = reminder.reminderText
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReminderAdapter.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.fragment_item_reminders_rv, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return reminders.size
    }

    override fun onBindViewHolder(holder: ReminderAdapter.ViewHolder, position: Int) {
        holder.databind(reminders[position])
    }
}