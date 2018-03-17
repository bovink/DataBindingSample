package com.bovink.databindingsample.databinding.databindinglayout;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.bovink.databindingsample.R;
import com.bovink.databindingsample.databinding.ActivityDataBindingLayoutBinding;
import com.bovink.databindingsample.model.JavaBeansUser;
import com.bovink.databindingsample.model.PojoUser;

/**
 * @author bovink
 * @since 2018/3/17
 */

public class DataBindingLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityDataBindingLayoutBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding_layout);

        PojoUser pojoUser = new PojoUser("Bruce", "Wayne");
        binding.setPojoUser(pojoUser);

        JavaBeansUser javaBeansUser = new JavaBeansUser("Clark", "Kent");
        binding.setJavaBeansUser(javaBeansUser);

    }
}
