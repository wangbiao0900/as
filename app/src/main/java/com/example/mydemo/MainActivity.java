package com.example.mydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.cloudplay.messagesdk.MessageHandler;
import com.cloudplay.messagesdk.MessageSDK;
import com.cloudplay.messagesdk.SendListener;
import com.cloudplay.messagesdk.entity.MessageInfo;
import com.google.gson.Gson;

import bean.Bean;
import bean.CpContentBean;
import bean.PayContentBean;

public class MainActivity extends AppCompatActivity {

    private TextView send;
    private TextView success;
    private TextView reception;
    private TextView examine;
    private Button   intents;
    private MessageSDK messageSDK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }
    //初始化id
    private void initView() {
        send = (Button) findViewById(R.id.send);
        //云实例成功
        success =(TextView) findViewById(R.id.success);
        //接收
        reception =(TextView) findViewById(R.id.jieshou);
        //查看是否发送成功
        examine =(TextView) findViewById(R.id.chakan);
        //json转字符串进行的测试跳转
        intents= (Button) findViewById(R.id.intents);
    }
    private void initData() {
        //json转字符串进行的测试跳转
        intents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                MainActivity.this.startActivity(intent);
            }
        });
        //开始进行初始化
        messageSDK = MessageSDK.init("com.example.mydemo", "1e536667ec3");
        //如果云实例成功后  messageSDK.isRunningCloud()==true
        if (messageSDK.isRunningCloud()==true) {
            success.setText("云实力运行成功");
            //接收消息
            messageSDK.setMessageHandler(new MessageHandler() {
                @Override
                public void onReceiveMessage(MessageInfo messageInfo) {
                    reception.setText("消息成功接收为：" + messageInfo.getMid() + messageInfo.getPayload() + "");
                }
            });
            //点击发送消息
            send.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    messageSDK.sendMessage(new Gson().toJson(new Bean(1, new CpContentBean("", "", ""), new PayContentBean("", "", 0, "", "", "", ""))), new SendListener() {
                        @Override
                        public void sendResult(boolean b, String s) {
                            examine.setText(s + "消息发送成功"+"");
                        }
                    });
                }
            });
        }
    }
    //断开长链接
    @Override
    protected void onDestroy() {
        super.onDestroy();
        messageSDK.disConnect();
    }
}