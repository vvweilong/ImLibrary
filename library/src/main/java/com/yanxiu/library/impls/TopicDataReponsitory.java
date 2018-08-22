package com.yanxiu.library.impls;

import com.yanxiu.library.TopicItemBean;
import com.yanxiu.library.abstractInterfaces.SyncServerLocal;
import com.yanxiu.library.abstractInterfaces.TopicDataRepositories;
import com.yanxiu.library.datasprocess.TopicDataApis;

import java.util.ArrayList;

/**
 * create by 朱晓龙 2018/8/15 下午3:48
 * 单例模式的仓库
 */
public class TopicDataReponsitory implements TopicDataRepositories {
    /**
     * 单例模式 保证im数据统一
     */
    private static TopicDataReponsitory INSTANCE;

    public static TopicDataReponsitory getInstance() {
        if (INSTANCE == null) INSTANCE = new TopicDataReponsitory();
        return INSTANCE;
    }

    public TopicDataReponsitory() {
        serverApi = new TopicDataServerApiImpl();
        localDbApi = new TopicDataDbApiImpl();
        topicSyncHelper=new TopicSyncHelper();
        memoryTopicData = new ArrayList<>();
        initLocalData();
    }

    /*初始化 本地数据 将数据库内容加载到内存中*/
    private void initLocalData() {
        //获取数据库内容
        localDbApi.getTopicList();
        //加载到内存
        memoryTopicData.addAll(new ArrayList<TopicItemBean>());
    }


    private TopicDataApis serverApi;
    private TopicDataApis localDbApi;
    private SyncServerLocal topicSyncHelper;


    /*内存中 唯一的 im 数据实例*/
    private ArrayList<TopicItemBean> memoryTopicData;

    /*收到 外部通知 被加入一个新的 topic 中 请求获取新 topic 数据并 更新数据库*/
    @Override
    public void requestAddTopic(long topicId) {
        //先从服务器获取 topic 信息
        serverApi.getTopicById(topicId);
        //获取信息后保存到本地数据库
        localDbApi.updateTopicByIds();

        //内存同步

        //回调给 UI 层

    }

    @Override
    public void requestDelTopic(long topicId) {
        //先请求服务器 删除某个 topic

        //删除本地 topic 数据  topic+msg

        //内存同步

        //回调给 UI 层
    }

    @Override
    public void updateTopics(long... topicId) {
        //请求更新 某个 某几个 topic 的数据

        //更新保存本地数据库

        //内存同步

        //回调给 UI
    }

    /**
     * 根据 topic id 获取 topic 实例
     */
    @Override
    public void getTopicByTopicId() {
        //首先 内存获取 理论上 内存中一定含有 目标 topic

        //如果没有，检查数据库中是否含有

        //如果有 同步数据库并返回结果

        //如果没有 回调给 上层 没有目标 topic 由上层决定 是否需要请求 目标 topic 的信息
    }

    @Override
    public void getTopicByMemberId() {
        //首先 内存查找

        //数据库查找

        //内存同步

        //回调结果

    }


    /**
     * 发送一条新消息
     */
    @Override
    public void sendNewMsg() {
        //更新对应 topic 的 msg 列表
        //数据库插入信息
        //内存同步

        //向服务器发送 请求
        //请求结果 更新数据库
        //内存同步
        //回调 UI
    }

    /**
     * 创建一个新的对话
     */
    @Override
    public void createTopic() {
        //创建一个内存的 topic 对象
        //数据库创建一个 临时本地 topic
        //网络请求创建 topic

        //网络创建成功 更新本地数据库
        //内存同步
        //网络创建失败

        //回调给 UI
    }
}
