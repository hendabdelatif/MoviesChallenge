package com.hend.movieschallenge.persistence

import androidx.room.TypeConverter
import com.hend.movieschallenge.persistence.dbmodels.MovieEntity
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types

/**
 * Used to put it on list of MovieEntity in order to save it to Room database
 */
object TypeResponseConverter {

  private val moshi = Moshi.Builder().build()

    @JvmStatic
    @TypeConverter
    fun fromStringType(value: String): List<MovieEntity>? {
        val listType = Types.newParameterizedType(List::class.java, MovieEntity::class.java)
        val adapter: JsonAdapter<List<MovieEntity>> = moshi.adapter(listType)
        return adapter.fromJson(value)
    }

  @JvmStatic
  @TypeConverter
  fun fromMovieType(type: List<MovieEntity>?): String {
    val listType = Types.newParameterizedType(List::class.java, MovieEntity::class.java)
    val adapter: JsonAdapter<List<MovieEntity>> = moshi.adapter(listType)
    return adapter.toJson(type)
  }
}
