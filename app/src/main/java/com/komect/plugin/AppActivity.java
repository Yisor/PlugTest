package com.komect.plugin;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.google.gson.Gson;
import com.komect.network.app.activity.MainActivity;
import com.komect.network.app.activity.OrderInfoActivity;
import com.komect.plugin.databinding.ActivityAppBinding;

public class AppActivity extends AppCompatActivity {

    private ActivityAppBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_app);
    }


    public void onInstall(View view) {
        Gson gson = new Gson();
    }


    public void onNext(View view) {
        Intent intent = new Intent(AppActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
