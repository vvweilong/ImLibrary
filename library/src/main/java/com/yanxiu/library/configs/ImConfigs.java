package com.yanxiu.library.configs;

/**
 * create by 朱晓龙 2018/8/15 下午3:56
 * 用户登录后进行 im 模块的初始化
 * 获取一些用户信息 imId  imToken
 */
public class ImConfigs {
    //当前用户的 imId
    private long imId;
    //登录 token
    private String imToken;
    //服务器地址
    private String host;

    public long getImId() {
        return imId;
    }

    public void setImId(long imId) {
        this.imId = imId;
    }

    public String getImToken() {
        return imToken;
    }

    public void setImToken(String imToken) {
        this.imToken = imToken;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
