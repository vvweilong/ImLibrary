package com.yanxiu.library.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yanxiu.library.ui.bean.UiTopicBean;

/**
 * A simple {@link Fragment} subclass.
 * 聊天列表 提供下拉加载功能
 * 每个聊天页面只对应一个 topic 对象
 *
 */
public class MsgListFragment extends Fragment {

    private UiTopicBean mUiTopicBean;


    public MsgListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_msg_list, container, false);
        return null;
    }

}
