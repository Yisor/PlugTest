package com.komect.plugin;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import com.komect.mylibrary.User;
import com.komect.plugin.databinding.ActivityAppBinding;

public class AppActivity extends AppCompatActivity {

    private ActivityAppBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_app);
    }


    public void onNext(View view) {
        //Intent intent = new Intent(AppActivity.this, TestActivity.class);
        //startActivity(intent);
        //User user = new User("测试", 12);
        //Toast.makeText(AppActivity.this, user.getName(), Toast.LENGTH_SHORT).show();
        Toast.makeText(AppActivity.this, "依赖测试", Toast.LENGTH_SHORT).show();
    }
}
