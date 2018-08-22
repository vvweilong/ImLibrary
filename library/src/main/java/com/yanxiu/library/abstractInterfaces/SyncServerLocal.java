package com.yanxiu.library.abstractInterfaces;

import com.yanxiu.library.TopicItemBean;

/**
 * create by 朱晓龙 2018/8/22 下午5:38
 * 本地数据 服务器数据辅助类
 * 主要用于 本地与服务器 创建 topic 的差异性 进行同步工作
 */
public interface SyncServerLocal {
    /**
     * 检查本地是否需要同步的 mockTopic
     */
    void checkNeedSync();
    /**
     * 对 服务器和本地数据进行同步操作
     * */
    boolean syncTopic(TopicItemBean serverData, TopicItemBean localData);



}
