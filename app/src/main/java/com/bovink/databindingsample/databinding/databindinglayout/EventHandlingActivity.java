package com.bovink.databindingsample.databinding.databindinglayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.bovink.databindingsample.databinding.EventHandlerActBinding;
import com.bovink.databindingsample.model.PojoUser;


/**
 * @author bovink
 * @since 2018/03/13
 */

public class EventHandlingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EventHandlerActBinding binding = EventHandlerActBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        PojoUser bruce = new PojoUser("Bruce", "Wayne");
        binding.setBruce(bruce);

        PojoUser bane = new PojoUser("Bane", "");
        binding.setBane(bane);

        Choice choice = new Choice();
        binding.setChoice(choice);
    }

    public class Choice {

        public void kickAss(PojoUser whosleg, PojoUser whosass) {

            Toast.makeText(EventHandlingActivity.this, whosleg.lastName + " is kicking " + whosass.lastName + "'s ass.", Toast.LENGTH_SHORT).show();
        }
    }
}
