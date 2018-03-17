package com.bovink.databindingsample.databinding.databindinglayout;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.bovink.databindingsample.R;
import com.bovink.databindingsample.databinding.FirstActBinding;
import com.bovink.databindingsample.model.Person;


/**
 * @author bovink
 * @since 2018/03/08
 */

public class LayoutBindActivity extends AppCompatActivity {

    Person person;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // first way to bind
        FirstActBinding binding = DataBindingUtil.setContentView(this, R.layout.first_act);

        // second way to bind
//        FirstActBinding binding = FirstActBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());

        person = new Person();
        person.setName("lilei");
        person.setSex("male");

        binding.setPerson(person);

    }
}
