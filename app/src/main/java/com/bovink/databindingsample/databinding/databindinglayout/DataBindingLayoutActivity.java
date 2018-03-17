package com.bovink.databindingsample.databinding.databindinglayout;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.bovink.databindingsample.R;
import com.bovink.databindingsample.databinding.ActivityDataBindingLayoutBinding;
import com.bovink.databindingsample.model.JavaBeansUser;
import com.bovink.databindingsample.model.PojoUser;

/**
 * @author bovink
 * @since 2018/3/17
 */

public class DataBindingLayoutActivity extends AppCompatActivity {

    PojoUser pojoUser;
    JavaBeansUser javaBeansUser;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityDataBindingLayoutBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding_layout);
        // another way for data binding layout
//        ActivityDataBindingLayoutBinding binding = ActivityDataBindingLayoutBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());

        pojoUser = new PojoUser("Bruce", "Wayne");
        binding.setPojoUser(pojoUser);

        javaBeansUser = new JavaBeansUser("Clark", "Kent");
        binding.setJavaBeansUser(javaBeansUser);

        EventHandler handler = new EventHandler();
        binding.setHandler(handler);
    }

    public class EventHandler {

        /**
         * must exactly match the signature of the method in the Listener object
         */
        public void bruceSays(View view) {

            Toast.makeText(DataBindingLayoutActivity.this, "I'm BatMan.", Toast.LENGTH_SHORT).show();
        }

        /**
         * must match the expected return value of the listener (unless it is expecting void)
         */
        public void clarkSays() {

            Toast.makeText(DataBindingLayoutActivity.this, "I'm SuperMan.", Toast.LENGTH_SHORT).show();
        }
    }
}
