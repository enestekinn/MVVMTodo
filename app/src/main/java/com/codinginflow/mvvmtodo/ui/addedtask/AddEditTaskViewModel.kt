package com.codinginflow.mvvmtodo.ui.addedtask

import androidx.hilt.Assisted
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.codinginflow.mvvmtodo.data.Task

class AddEditTaskViewModel (
    @Assisted private val state : SavedStateHandle
        ) : ViewModel() {

            val task  = state.get<Task>("task")//fragmentden gonderdigimiz argumant ile ayni olmali

    var taskName = state.get<String>("taskName") ?: task?.name ?: ""
    set(value)  {
        field = value
        state.set("taskName",value)
    }

    var taskImportance = state.get<Boolean>("taskImportance") ?: task?.important ?: false
    set(value) {
        field = value
        state.set("taskImportance",value)
    }


}