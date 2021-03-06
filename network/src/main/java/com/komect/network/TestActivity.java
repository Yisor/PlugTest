package com.komect.network;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.komect.network.databinding.ActivityTestBinding;

public class TestActivity extends AppCompatActivity {

    private ActivityTestBinding binding;
    private User user;
    private UserHandle mHandle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_test);
        user = new User("测试", 18);
        binding.setUser(user);

        Button button = (Button) findViewById(R.id.btn_calculate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                int sum = 10 + user.getAge();
                user.setAge(sum);
                binding.setUser(user);
            }
        });
    }
}
