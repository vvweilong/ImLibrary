package com.yanxiu.library.abstractInterfaces;

/**
 * create by 朱晓龙 2018/8/15 下午3:20
 * Topic列表页的 交互
 * 1、显示列表
 * 2、显示新消息提醒
 * 3、更新 topic 列表
 *
 * 主动功能  页面开启时自动调用的 列表获取/更新
 * 被动     新消息提醒，topic 信息变更提醒
 *
 */
public interface TopicListContract {
    interface IView {

    }

    interface IPresenter {
        void getTopicList();
        /**
         * 更新包含三部分 1、列表长度 2、最新消息内容 3？、member ？
         * */
        void updateTopicList();

    }
}
