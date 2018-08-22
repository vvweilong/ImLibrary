package com.yanxiu.imlib.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * create by 朱晓龙 2018/8/19 下午11:07
 */
@Entity
public class DatabaseMember {

    @PrimaryKey
    public long memberId;
    @ColumnInfo
    public String memberName;
    @ColumnInfo
    public String avaral;
}
