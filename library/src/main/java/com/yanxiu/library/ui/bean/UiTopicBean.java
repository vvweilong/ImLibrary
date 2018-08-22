package com.yanxiu.library.ui.bean;

import java.util.List;

/**
 * create by 朱晓龙 2018/8/15 下午3:38
 * 对应UI 显示的 bean 数据
 */
public class UiTopicBean {
    //成员列表
    private List<UiMemberBean> mUiMemberBeanList;
    //消息列表
    private List<UiMsgBean> mUiMsgBeans;
    //对话名称
    private String topicName;
    //对话类别  群聊/私聊
    private int topicType;
    //对话 图标
    private String icon;
    //是否有未读消息 (红点显示)
    private boolean unread;
    //数据库对应字段
    private long topicId;


}
