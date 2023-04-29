package com.notescomposeapp.model

import com.notescomposeapp.utils.getFormattedDate
import java.util.*

data class Note(
    var title: String,
    var text: String,
    var creationDate: String = Calendar.getInstance().getFormattedDate(),
    var lastUpdateDate: String? = null
)