package com.yanxiu.imlib.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * create by 朱晓龙 2018/8/19 下午11:16
 */
@Dao
public interface TopicDao {

    @Insert
    void insert(DatabaseTopic... topics);

    @Query("SELECT * FROM DatabaseTopic")
    List<DatabaseTopic> getTopics();
}
