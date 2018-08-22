package com.yanxiu.imlib.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.List;

/**
 * create by 朱晓龙 2018/8/19 下午11:06
 */
@Entity
public class DatabaseTopic {

    @PrimaryKey
    public long topicId;
    @ColumnInfo
    public String topicName;


    @ColumnInfo
    public List<DatabaseMsg> mMsgs;


    @ColumnInfo
    public List<DatabaseMember> mMembers;



}
