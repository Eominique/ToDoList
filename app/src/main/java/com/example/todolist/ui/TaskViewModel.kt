package com.example.todolist.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.todolist.data.TaskDao
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flatMapLatest
import javax.inject.Inject

class TaskViewModel @Inject constructor(
 private val taskDao: TaskDao
): ViewModel() {

 val searchQuery = MutableStateFlow("")

 private val taskFlow = searchQuery.flatMapLatest {
  taskDao.getTasks(it)
 }

val tasks = taskFlow.asLiveData()





}