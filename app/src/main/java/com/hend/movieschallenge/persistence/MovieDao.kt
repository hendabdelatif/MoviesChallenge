package com.hend.movieschallenge.persistence

import androidx.room.*
import com.hend.movieschallenge.persistence.dbmodels.DBMovie
import com.hend.movieschallenge.persistence.dbmodels.MovieData
import com.hend.movieschallenge.persistence.dbmodels.MovieEntity

/**
 * Contains all queries required on database
 */
@Dao
interface MovieDao {

  @Insert(onConflict = OnConflictStrategy.REPLACE)
  suspend fun insert(movieData: MovieData)

  @Insert(onConflict = OnConflictStrategy.REPLACE)
  suspend fun insertMovie(movieEntity: MovieEntity)

  @Update(onConflict = OnConflictStrategy.REPLACE)
  suspend fun update(movieEntity: MovieEntity)

  @Transaction
  suspend fun insertDBMovie(dbMovie: DBMovie) {
    insert(dbMovie.movieData)
    dbMovie.movieData.results.forEach {
      insertMovie(it)
    }
  }

  @Transaction
  @Query("SELECT * FROM MovieData LIMIT 1")
  suspend fun get(): DBMovie?

  @Transaction
  @Query("SELECT * FROM MovieEntity WHERE id = :id LIMIT 1")
  suspend fun getMovieEntityById(id: Int): MovieEntity?

  @Transaction
  @Query("SELECT * FROM MovieEntity WHERE title = :title LIMIT 1")
  suspend fun getMovieEntityByTitle(title : String): MovieEntity?

}
