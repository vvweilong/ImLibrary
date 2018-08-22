package com.yanxiu.library.ui.bean;

/**
 * create by 朱晓龙 2018/8/15 下午3:40
 */
public class UiMsgBean {
    //消息类型
    private int msgType;
    //消息内容
    private String content;
    //发送者
    private UiMemberBean sender;
    //时间信息
    private long sendTime;
    private long receiveTime;
    //是否已读
    private boolean unread;
    //唯一标识 与数据库对应的 字段
    private String reqId;
}
