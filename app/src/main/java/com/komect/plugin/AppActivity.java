package com.komect.plugin;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.komect.network.TestActivity;
import com.komect.plugin.databinding.ActivityAppBinding;

public class AppActivity extends AppCompatActivity {

    private ActivityAppBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_app);
    }


    public void onInstall(View view) {

    }


    public void onNext(View view) {
        Intent intent = new Intent(AppActivity.this, TestActivity.class);
        startActivity(intent);
    }
}
