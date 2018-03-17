package com.bovink.databindingsample.databinding.databindinglayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.bovink.databindingsample.databinding.EventHandlerActBinding;


/**
 * @author bovink
 * @since 2018/03/13
 */

public class EventHandlerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EventHandlerActBinding binding = EventHandlerActBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}
