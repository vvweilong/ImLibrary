package com.yanxiu.library.abstractInterfaces;

/**
 * create by 朱晓龙 2018/8/15 下午3:26
 * topic 仓库
 * 包含 topic 列表
 * topic 下 member 列表
 * topic 下 msg 列表
 * 向外提供接口方法 各种数据操作功能
 * 增删改查
 */

public interface TopicDataRepositories {
    // region topicList页面
    /*增删改查 主要功能接口*/
    /**请求获取一个新的 topic 信息*/
    void requestAddTopic(long topicId);
    /**请求删除 topic server + local（db）*/
    void requestDelTopic(long topicId);
    /**请求更新 指定 topic /topic 列表的信息 member+msg*/
    void updateTopics(long... topicId);




    //endregion


    // region msgList页面
    /**获取一个 topic 唯一实例 用于聊天界面*/
    void getTopicByTopicId();
    /**群聊点击 成员头像 创建私聊 通过 memberid 获取 唯一 topic 实例 如果没有 创建 mocktopic */
    void getTopicByMemberId();

    /**用户发送 新消息*/
    void sendNewMsg();

    /**创建一个本地 topic 可以是私聊 可以是 群聊*/
    void createTopic();

    //endregion
}