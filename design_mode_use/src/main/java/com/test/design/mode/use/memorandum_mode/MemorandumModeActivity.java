package com.test.design.mode.use.memorandum_mode;

import android.app.Activity;
import android.os.Bundle;

import com.test.design.mode.use.R;

/**
 * Description: 备忘录模式
 */
public class MemorandumModeActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memorandum_mode);

        Originator originator = new Originator();
        originator.startWrite();
        Caretaker caretaker = new Caretaker();
        caretaker.setMemorandum(originator.saveWrite());
        originator.stopWrite();
        originator.restoreWrite(caretaker.getMemorandum());
    }
}