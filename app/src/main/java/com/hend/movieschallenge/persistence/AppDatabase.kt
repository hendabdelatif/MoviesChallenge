package com.hend.movieschallenge.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.hend.movieschallenge.persistence.dbmodels.MovieData
import com.hend.movieschallenge.persistence.dbmodels.MovieEntity
/**
 * Abstract class for Room Database and entities included
 */
@Database(entities = [MovieData::class, MovieEntity::class], version = 1, exportSchema = true)
@TypeConverters(value = [TypeResponseConverter::class])
abstract class AppDatabase : RoomDatabase() {
  abstract fun movieDao(): MovieDao
}
