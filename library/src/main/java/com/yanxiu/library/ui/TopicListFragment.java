package com.yanxiu.library.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yanxiu.imlib.R;
import com.yanxiu.library.ui.bean.UiTopicBean;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * 用户 topic 列表页几乎没有页面交互  只有点击 进入 msglistfragment 一项
 *
 */
public class TopicListFragment extends Fragment {
    //显示的 topic 列表
    private ArrayList<UiTopicBean> mTopicBeanArrayList;

    public TopicListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_topic_list, container, false);
    }

}
