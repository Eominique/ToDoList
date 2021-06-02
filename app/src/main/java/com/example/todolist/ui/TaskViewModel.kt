package com.example.todolist.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.todolist.data.TaskDao
import javax.inject.Inject

class TaskViewModel @Inject constructor(
 private val taskDao: TaskDao
): ViewModel() {

val tasks = taskDao.getTasks().asLiveData()





}