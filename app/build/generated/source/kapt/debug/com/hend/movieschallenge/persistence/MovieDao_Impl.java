package com.hend.movieschallenge.persistence;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.hend.movieschallenge.persistence.dbmodels.DBMovie;
import com.hend.movieschallenge.persistence.dbmodels.MovieData;
import com.hend.movieschallenge.persistence.dbmodels.MovieEntity;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class MovieDao_Impl implements MovieDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MovieData> __insertionAdapterOfMovieData;

  private final EntityInsertionAdapter<MovieEntity> __insertionAdapterOfMovieEntity;

  private final EntityDeletionOrUpdateAdapter<MovieEntity> __updateAdapterOfMovieEntity;

  public MovieDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMovieData = new EntityInsertionAdapter<MovieData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `MovieData` (`page`,`total_results`,`total_pages`,`results`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MovieData value) {
        stmt.bindLong(1, value.getPage());
        stmt.bindLong(2, value.getTotal_results());
        stmt.bindLong(3, value.getTotal_pages());
        final String _tmp;
        _tmp = TypeResponseConverter.INSTANCE.fromMovieType(value.getResults());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp);
        }
      }
    };
    this.__insertionAdapterOfMovieEntity = new EntityInsertionAdapter<MovieEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `MovieEntity` (`id`,`popularity`,`vote_count`,`video`,`poster_path`,`adult`,`backdrop_path`,`original_language`,`title`,`vote_average`,`overview`,`release_date`,`full_poster_path`,`full_backdrop_path`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MovieEntity value) {
        stmt.bindLong(1, value.getId());
        stmt.bindDouble(2, value.getPopularity());
        stmt.bindLong(3, value.getVote_count());
        final int _tmp;
        _tmp = value.getVideo() ? 1 : 0;
        stmt.bindLong(4, _tmp);
        if (value.getPoster_path() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPoster_path());
        }
        final int _tmp_1;
        _tmp_1 = value.getAdult() ? 1 : 0;
        stmt.bindLong(6, _tmp_1);
        if (value.getBackdrop_path() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getBackdrop_path());
        }
        if (value.getOriginal_language() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getOriginal_language());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getTitle());
        }
        stmt.bindDouble(10, value.getVote_average());
        if (value.getOverview() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getOverview());
        }
        if (value.getRelease_date() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getRelease_date());
        }
        if (value.getFull_poster_path() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getFull_poster_path());
        }
        if (value.getFull_backdrop_path() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getFull_backdrop_path());
        }
      }
    };
    this.__updateAdapterOfMovieEntity = new EntityDeletionOrUpdateAdapter<MovieEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR REPLACE `MovieEntity` SET `id` = ?,`popularity` = ?,`vote_count` = ?,`video` = ?,`poster_path` = ?,`adult` = ?,`backdrop_path` = ?,`original_language` = ?,`title` = ?,`vote_average` = ?,`overview` = ?,`release_date` = ?,`full_poster_path` = ?,`full_backdrop_path` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MovieEntity value) {
        stmt.bindLong(1, value.getId());
        stmt.bindDouble(2, value.getPopularity());
        stmt.bindLong(3, value.getVote_count());
        final int _tmp;
        _tmp = value.getVideo() ? 1 : 0;
        stmt.bindLong(4, _tmp);
        if (value.getPoster_path() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPoster_path());
        }
        final int _tmp_1;
        _tmp_1 = value.getAdult() ? 1 : 0;
        stmt.bindLong(6, _tmp_1);
        if (value.getBackdrop_path() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getBackdrop_path());
        }
        if (value.getOriginal_language() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getOriginal_language());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getTitle());
        }
        stmt.bindDouble(10, value.getVote_average());
        if (value.getOverview() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getOverview());
        }
        if (value.getRelease_date() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getRelease_date());
        }
        if (value.getFull_poster_path() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getFull_poster_path());
        }
        if (value.getFull_backdrop_path() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getFull_backdrop_path());
        }
        stmt.bindLong(15, value.getId());
      }
    };
  }

  @Override
  public Object insert(final MovieData movieData, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMovieData.insert(movieData);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertMovie(final MovieEntity movieEntity, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMovieEntity.insert(movieEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final MovieEntity movieEntity, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfMovieEntity.handle(movieEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertDBMovie(final DBMovie dbMovie, final Continuation<? super Unit> p1) {
    return RoomDatabaseKt.withTransaction(__db, new Function1<Continuation<? super Unit>, Object>() {
      @Override
      public Object invoke(Continuation<? super Unit> __cont) {
        return MovieDao.DefaultImpls.insertDBMovie(MovieDao_Impl.this, dbMovie, __cont);
      }
    }, p1);
  }

  @Override
  public Object get(final Continuation<? super DBMovie> p0) {
    final String _sql = "SELECT * FROM MovieData LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, true, _cancellationSignal, new Callable<DBMovie>() {
      @Override
      public DBMovie call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
          try {
            final int _cursorIndexOfPage = CursorUtil.getColumnIndexOrThrow(_cursor, "page");
            final int _cursorIndexOfTotalResults = CursorUtil.getColumnIndexOrThrow(_cursor, "total_results");
            final int _cursorIndexOfTotalPages = CursorUtil.getColumnIndexOrThrow(_cursor, "total_pages");
            final int _cursorIndexOfResults = CursorUtil.getColumnIndexOrThrow(_cursor, "results");
            final DBMovie _result;
            if(_cursor.moveToFirst()) {
              final MovieData _tmpMovieData;
              if (! (_cursor.isNull(_cursorIndexOfPage) && _cursor.isNull(_cursorIndexOfTotalResults) && _cursor.isNull(_cursorIndexOfTotalPages) && _cursor.isNull(_cursorIndexOfResults))) {
                final int _tmpPage;
                _tmpPage = _cursor.getInt(_cursorIndexOfPage);
                final int _tmpTotal_results;
                _tmpTotal_results = _cursor.getInt(_cursorIndexOfTotalResults);
                final int _tmpTotal_pages;
                _tmpTotal_pages = _cursor.getInt(_cursorIndexOfTotalPages);
                final List<MovieEntity> _tmpResults;
                final String _tmp;
                _tmp = _cursor.getString(_cursorIndexOfResults);
                _tmpResults = TypeResponseConverter.INSTANCE.fromStringType(_tmp);
                _tmpMovieData = new MovieData(_tmpPage,_tmpTotal_results,_tmpTotal_pages,_tmpResults);
              }  else  {
                _tmpMovieData = null;
              }
              _result = new DBMovie(_tmpMovieData);
            } else {
              _result = null;
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
            _statement.release();
          }
        } finally {
          __db.endTransaction();
        }
      }
    }, p0);
  }

  @Override
  public Object getMovieEntityById(final int id, final Continuation<? super MovieEntity> p1) {
    final String _sql = "SELECT * FROM MovieEntity WHERE id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, true, _cancellationSignal, new Callable<MovieEntity>() {
      @Override
      public MovieEntity call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
            final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_count");
            final int _cursorIndexOfVideo = CursorUtil.getColumnIndexOrThrow(_cursor, "video");
            final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
            final int _cursorIndexOfAdult = CursorUtil.getColumnIndexOrThrow(_cursor, "adult");
            final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path");
            final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "original_language");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
            final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
            final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
            final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "release_date");
            final int _cursorIndexOfFullPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "full_poster_path");
            final int _cursorIndexOfFullBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "full_backdrop_path");
            final MovieEntity _result;
            if(_cursor.moveToFirst()) {
              final int _tmpId;
              _tmpId = _cursor.getInt(_cursorIndexOfId);
              final double _tmpPopularity;
              _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
              final int _tmpVote_count;
              _tmpVote_count = _cursor.getInt(_cursorIndexOfVoteCount);
              final boolean _tmpVideo;
              final int _tmp;
              _tmp = _cursor.getInt(_cursorIndexOfVideo);
              _tmpVideo = _tmp != 0;
              final String _tmpPoster_path;
              _tmpPoster_path = _cursor.getString(_cursorIndexOfPosterPath);
              final boolean _tmpAdult;
              final int _tmp_1;
              _tmp_1 = _cursor.getInt(_cursorIndexOfAdult);
              _tmpAdult = _tmp_1 != 0;
              final String _tmpBackdrop_path;
              _tmpBackdrop_path = _cursor.getString(_cursorIndexOfBackdropPath);
              final String _tmpOriginal_language;
              _tmpOriginal_language = _cursor.getString(_cursorIndexOfOriginalLanguage);
              final String _tmpTitle;
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
              final double _tmpVote_average;
              _tmpVote_average = _cursor.getDouble(_cursorIndexOfVoteAverage);
              final String _tmpOverview;
              _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
              final String _tmpRelease_date;
              _tmpRelease_date = _cursor.getString(_cursorIndexOfReleaseDate);
              final String _tmpFull_poster_path;
              _tmpFull_poster_path = _cursor.getString(_cursorIndexOfFullPosterPath);
              final String _tmpFull_backdrop_path;
              _tmpFull_backdrop_path = _cursor.getString(_cursorIndexOfFullBackdropPath);
              _result = new MovieEntity(_tmpId,_tmpPopularity,_tmpVote_count,_tmpVideo,_tmpPoster_path,_tmpAdult,_tmpBackdrop_path,_tmpOriginal_language,_tmpTitle,_tmpVote_average,_tmpOverview,_tmpRelease_date,_tmpFull_poster_path,_tmpFull_backdrop_path);
            } else {
              _result = null;
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
            _statement.release();
          }
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object getMovieEntityByTitle(final String title,
      final Continuation<? super MovieEntity> p1) {
    final String _sql = "SELECT * FROM MovieEntity WHERE title = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (title == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, title);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, true, _cancellationSignal, new Callable<MovieEntity>() {
      @Override
      public MovieEntity call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
            final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_count");
            final int _cursorIndexOfVideo = CursorUtil.getColumnIndexOrThrow(_cursor, "video");
            final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
            final int _cursorIndexOfAdult = CursorUtil.getColumnIndexOrThrow(_cursor, "adult");
            final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path");
            final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "original_language");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
            final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
            final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
            final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "release_date");
            final int _cursorIndexOfFullPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "full_poster_path");
            final int _cursorIndexOfFullBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "full_backdrop_path");
            final MovieEntity _result;
            if(_cursor.moveToFirst()) {
              final int _tmpId;
              _tmpId = _cursor.getInt(_cursorIndexOfId);
              final double _tmpPopularity;
              _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
              final int _tmpVote_count;
              _tmpVote_count = _cursor.getInt(_cursorIndexOfVoteCount);
              final boolean _tmpVideo;
              final int _tmp;
              _tmp = _cursor.getInt(_cursorIndexOfVideo);
              _tmpVideo = _tmp != 0;
              final String _tmpPoster_path;
              _tmpPoster_path = _cursor.getString(_cursorIndexOfPosterPath);
              final boolean _tmpAdult;
              final int _tmp_1;
              _tmp_1 = _cursor.getInt(_cursorIndexOfAdult);
              _tmpAdult = _tmp_1 != 0;
              final String _tmpBackdrop_path;
              _tmpBackdrop_path = _cursor.getString(_cursorIndexOfBackdropPath);
              final String _tmpOriginal_language;
              _tmpOriginal_language = _cursor.getString(_cursorIndexOfOriginalLanguage);
              final String _tmpTitle;
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
              final double _tmpVote_average;
              _tmpVote_average = _cursor.getDouble(_cursorIndexOfVoteAverage);
              final String _tmpOverview;
              _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
              final String _tmpRelease_date;
              _tmpRelease_date = _cursor.getString(_cursorIndexOfReleaseDate);
              final String _tmpFull_poster_path;
              _tmpFull_poster_path = _cursor.getString(_cursorIndexOfFullPosterPath);
              final String _tmpFull_backdrop_path;
              _tmpFull_backdrop_path = _cursor.getString(_cursorIndexOfFullBackdropPath);
              _result = new MovieEntity(_tmpId,_tmpPopularity,_tmpVote_count,_tmpVideo,_tmpPoster_path,_tmpAdult,_tmpBackdrop_path,_tmpOriginal_language,_tmpTitle,_tmpVote_average,_tmpOverview,_tmpRelease_date,_tmpFull_poster_path,_tmpFull_backdrop_path);
            } else {
              _result = null;
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
            _statement.release();
          }
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }
}
