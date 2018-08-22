package com.yanxiu.library.datasprocess;

import java.util.List;

/**
 * create by 朱晓龙 2018/8/15 下午3:31
 * 数据抽象方法集合
 * 适用于 数据库与服务器的数据接口调用
 */
public interface TopicDataApis<E> {
    /**
     * 获取用户 topic 列表
     */
    void getTopicList();

    /**
     * 获取 指定 topic 的详细信息
     */
    void getTopicById(long... id);

    /**
     * 指定 id 删除 topic
     */
    void deleteTopicByIds(long... ids);

    /**
     * 指定 id 更新 topic
     */
    void updateTopicByIds(long... ids);

    void updateTopicByData(List<E> serDatas);

}
