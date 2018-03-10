package sample.kingja.aop4android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


//    public void test(View view) {
//        getMsg("hey man!");
//    }

//    @TestAnnoTrace(value = "jordan", type = 23)
//    private String getMsg(String msg) {
//        System.out.println("getMsg: " + msg);
////        int i = 1 / 0;
//        return msg;
//    }
    @TestAnnoTrace(value = "jordan", type = 23)
    public void test(View view) {
        System.out.println("test");
    }
}

