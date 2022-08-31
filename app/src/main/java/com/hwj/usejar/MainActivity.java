package com.hwj.usejar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.hwj.litesdk.LiteSdkUtil;
import com.hwj.sdk.SdkLibUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        findViewById(R.id.btnClick).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //这里能成功运行，表示代码已经没啥问题了，不混淆的类名、函数名都暴露成功
                //就连mmkv的使用到so的快速存储也能行，但其实业务module自身还会集成跟sdk重复的三方框架，解决方法看代码
                LiteSdkUtil.test();
                Toast.makeText(MainActivity.this, SdkLibUtil.testFun(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}