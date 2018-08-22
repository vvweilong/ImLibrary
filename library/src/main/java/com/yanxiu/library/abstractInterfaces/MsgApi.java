package com.yanxiu.library.abstractInterfaces;

/**
 * create by 朱晓龙 2018/8/22 下午5:52
 */
public interface MsgApi {

    void sendMsg();

    void receiveMsg();

    void updateMsg();

    void getMsgList(int limit, long startId, long topicId);


}
