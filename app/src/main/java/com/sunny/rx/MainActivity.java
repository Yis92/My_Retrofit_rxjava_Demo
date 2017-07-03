package com.sunny.rx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.sunny.rx.entity.StartResp;
import com.sunny.rx.http.HttpMethods;
import com.sunny.rx.subscribers.ProgressSubscriber;
import com.sunny.rx.subscribers.SubscriberOnNextListener;

import java.util.HashMap;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.btn_load)
    Button btnLoad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HttpMethods.getInstance().getTopMovie(new ProgressSubscriber("load...", new SubscriberOnNextListener<StartResp>() {
                    @Override
                    public void onNext(StartResp startResp) {
                        Toast.makeText(getApplicationContext(), startResp.getName(), Toast.LENGTH_LONG).show();
                    }
                }, MainActivity.this));
            }
        });
    }

}
