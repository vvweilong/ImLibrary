package com.yanxiu.imlib.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * create by 朱晓龙 2018/8/19 下午11:07
 */
@Entity
public class DatabaseMsg {


    @PrimaryKey
    public String reqId;
    @ColumnInfo
    public String content;

    @ColumnInfo
    public int msgType;

    @ColumnInfo
    public DatabaseMember sender;

    @ColumnInfo
    public long topicId;

    @ColumnInfo
    public int widht;
    @ColumnInfo
    public int height;


}
