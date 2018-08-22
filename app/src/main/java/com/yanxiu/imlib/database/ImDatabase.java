package com.yanxiu.imlib.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * create by 朱晓龙 2018/8/19 下午11:09
 */
@Database(entities = {DatabaseMember.class, DatabaseTopic.class, DatabaseMsg.class},
        version = 1, exportSchema = false)
public abstract class ImDatabase extends RoomDatabase {

    private static ImDatabase INSTANCE;

    public abstract MemberDao getMemberDao();

    abstract public TopicDao getTopicDao();

    abstract public MsgDao getMsgDao();

    public static ImDatabase getDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context, ImDatabase.class, "im_room.db")
                    .allowMainThreadQueries()
                    .build();
        }
        return INSTANCE;
    }

}
