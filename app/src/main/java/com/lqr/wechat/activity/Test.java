package com.lqr.wechat.activity;

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/**
 * Created by Administrator on 2018/5/15 0015.
 */

public class Test {
    public void testsoft(){
        ArrayList<Object> arrayList=new ArrayList<>();
        SoftReference<Object> softReference=new SoftReference<Object>(arrayList);
        Object object=softReference.get();

        WeakReference<Object> weakReference=new WeakReference<Object>(arrayList);
        Object obj=weakReference.get();
    }

}
