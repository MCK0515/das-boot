package com.boot.dasboot.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("database_sequences")
class DatabaseSequence{
    @Id
    var id: String = ""

    var seq: Long = 0
}
