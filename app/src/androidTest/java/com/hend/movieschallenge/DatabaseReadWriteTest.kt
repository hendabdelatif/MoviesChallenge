package com.hend.movieschallenge

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.matcher.ViewMatchers.assertThat
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.hend.movieschallenge.persistence.AppDatabase
import com.hend.movieschallenge.persistence.MovieDao
import com.hend.movieschallenge.persistence.dbmodels.MovieEntity
import kotlinx.coroutines.runBlocking
import org.hamcrest.CoreMatchers.equalTo
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException

@RunWith(AndroidJUnit4::class)
class DatabaseReadWriteTest {

    private lateinit var movieDao: MovieDao
    private lateinit var db: AppDatabase

    @Before
    fun createDb() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        db = Room.inMemoryDatabaseBuilder(
            context, AppDatabase::class.java
        ).build()
        movieDao = db.movieDao()
    }

    @After
    @Throws(IOException::class)
    fun closeDb() {
        db.close()
    }

    @Test
    @Throws(Exception::class)
    fun readAndWriteInDB() {

        val movieEntity =
            MovieEntity(1, 0.0, 2, false,
                "", false, "", "",
                "New Movie", 0.0, "", "",
                "", "")

        runBlocking {
            movieDao.insertMovie(movieEntity)
            val byTitle = movieDao.getMovieEntityByTitle("New Movie")
            assertThat(byTitle, equalTo(movieEntity))
        }
    }
}