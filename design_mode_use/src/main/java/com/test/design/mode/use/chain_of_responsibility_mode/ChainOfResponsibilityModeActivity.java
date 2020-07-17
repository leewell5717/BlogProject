package com.test.design.mode.use.chain_of_responsibility_mode;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.test.design.mode.use.R;

/**
 * Description: 责任链模式
 */
public class ChainOfResponsibilityModeActivity extends Activity {

    public static final String Tag = "XXX";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chain_of_responsibility_mode);

        GroupLeader groupLeader = new GroupLeader();
        DepartmentLeader departmentLeader = new DepartmentLeader();
        DirectorLeader directorLeader = new DirectorLeader();
        BossLeader bossLeader = new BossLeader();
        groupLeader.setNextLeader(departmentLeader);
        departmentLeader.setNextLeader(directorLeader);
        directorLeader.setNextLeader(bossLeader);

        Leave zhangLeave = new Leave("张三","临时有事",3);
        Log.e(Tag, zhangLeave.toString());
        groupLeader.handle(zhangLeave);
        Leave liLeave = new Leave("李四","想要出去玩",7);
        Log.e(Tag, liLeave.toString());
        groupLeader.handle(liLeave);

        Log.e(Tag, "------------------------------------");

        try{
            int a = Integer.parseInt("aaa");
        }catch (NullPointerException e){
            Log.e(Tag, "空指针异常");
        }catch (IllegalArgumentException e){
            Log.e(Tag, "非法参数异常");
        }catch (ClassCastException e){
            Log.e(Tag, "类型转化异常");
        }catch (IndexOutOfBoundsException e){
            Log.e(Tag, "下标越界异常");
        }catch (ArithmeticException e){
            Log.e(Tag, "算术异常");
        }catch (Exception e){
            Log.e(Tag, "发生异常");
        }
    }
}