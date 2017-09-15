package com.sy.androidftpservicedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sy.androidftpservicedemo.service.FtpService;

/**
 * 因为项目需要，查看了一些资料，整理一份，以后使用方便。
 * 修改和添加用户名和密码在raw的文件夹下文件中
 * 修改文件接收的路径也在raw文件下
 * 修改端口号在service
 * 测试用的是FZ客户端（使用方法可以直接拖动文件）
 * 测试网址的格式：
 *
 */

public class MainActivity extends AppCompatActivity {
    private Button bt_startservice;
    Intent serviceIntent ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_startservice = (Button) findViewById(R.id.bt_startservice);
        bt_startservice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                serviceIntent = new Intent(MainActivity.this, FtpService.class);
                startService(serviceIntent);

            }
        });
    }
}
