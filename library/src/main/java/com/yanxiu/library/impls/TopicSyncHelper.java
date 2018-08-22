package com.yanxiu.library.impls;

import com.yanxiu.library.TopicItemBean;
import com.yanxiu.library.abstractInterfaces.SyncServerLocal;

/**
 * create by 朱晓龙 2018/8/22 下午5:41
 * 用于 数据库内的 临时 topic 与 服务器真实 topic 的合并同步
 */
public class TopicSyncHelper implements SyncServerLocal {
    @Override
    public void checkNeedSync() {
        //查找数据库 所有的 topic 是否含有临时对话

        //有临时对话 需要进行同步操作

    }
    /**
     * 临时 topic 的同步操作
     * 前提条件  1、已经从服务器获取了最新的 topic 信息并对数据库进行了更新 但还未进行内存同步
     *          2、本地数据库中有临时的 topic 删除数据库的操作 由同步后调用者进行操作 降低本类的耦合
     * 目的 删除 本地临时数据库中的临时 topic 在内存中更新 topic 信息
     * */
    @Override
    public boolean syncTopic(TopicItemBean serverData, TopicItemBean localData) {
        // 临时 topic 的同步
        //对比 topic 并在内存中替换成功后 返回 true

        return true;
    }
}
