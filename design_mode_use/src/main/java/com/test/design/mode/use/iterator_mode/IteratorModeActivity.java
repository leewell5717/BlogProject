package com.test.design.mode.use.iterator_mode;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.test.design.mode.use.R;

/**
 * Description: 迭代器模式
 */
public class IteratorModeActivity extends Activity {

    private static final String TAG = "XXX";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iterator_mode);

        MyArrayList arrayList = new MyArrayList();
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("ccc");
        arrayList.add("ddd");
        MyArrayListIterator arrayListIterator = new MyArrayListIterator(arrayList);
        while (arrayListIterator.hasNext()){
            Log.e(TAG, "数据有：" + arrayListIterator.next());
        }
    }
}