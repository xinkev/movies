package io.github.xinkev.movies.database.entities

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "UpcomingMovie",
    indices = [
        Index(value = ["movieId"], unique = true)
    ],
    foreignKeys = [
        ForeignKey(
            entity = Movie::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("movieId"),
            onUpdate = ForeignKey.CASCADE,
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class UpcomingMovieEntry(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val movieId: Long,
)
