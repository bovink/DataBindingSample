package com.bovink.databindingsample.databinding.databindinglayout;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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

        PojoUser clark = new PojoUser("Clark", "Kent");
        binding.setClark(clark);

        PojoUser bane = new PojoUser("", "Bane");
        binding.setBane(bane);

        Action action = new Action();
        binding.setAction(action);
    }

    public class Action {

        boolean revenge = false;

        public void kickAss(PojoUser whosleg, PojoUser whosass) {

            Toast.makeText(EventHandlingActivity.this, whosleg.lastName + " is kicking " + whosass.lastName + "'s ass", Toast.LENGTH_SHORT).show();
        }

        public void runAway(View view, PojoUser whoIsRun, PojoUser chaserA, PojoUser chaserB) {

            view.setBackgroundColor(Color.parseColor("#66CCFF"));
            Toast.makeText(EventHandlingActivity.this, whoIsRun.lastName + " is run away from " + chaserA.lastName + " and " + chaserB.lastName, Toast.LENGTH_SHORT).show();
        }

        public void revenge(PojoUser enemyA, PojoUser enemyB, boolean decidedToRevenge) {

            revenge = decidedToRevenge;

            if (decidedToRevenge) {

                Toast.makeText(EventHandlingActivity.this, "Bane wanna revenge " + enemyA.lastName + " and " + enemyB.lastName, Toast.LENGTH_SHORT).show();
            } else {

                Toast.makeText(EventHandlingActivity.this, "Bane was scared and ran away", Toast.LENGTH_SHORT).show();
            }
        }

        public boolean choose() {

            if (revenge) {

                Toast.makeText(EventHandlingActivity.this, "Bane broken Bruce's back in front of Clark", Toast.LENGTH_SHORT).show();
            } else {

                Toast.makeText(EventHandlingActivity.this, "Bane ran away with tears", Toast.LENGTH_SHORT).show();
            }
            return false;
        }

    }
}
