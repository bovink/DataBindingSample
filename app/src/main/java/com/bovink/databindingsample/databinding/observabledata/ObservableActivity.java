package com.bovink.databindingsample.databinding.observabledata;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.bovink.databindingsample.databinding.ObservableActBinding;
import com.bovink.databindingsample.model.Student;


/**
 * @author bovink
 * @since 2018/03/14
 */

public class ObservableActivity extends AppCompatActivity {

    Student student;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ObservableActBinding binding = ObservableActBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        student = new Student();
        student.setName("kyotaga");
        student.setClassName("class d");
        student.setTeacher("chyabashi");
        student.age.set("13");

        binding.setStudent(student);

        EventHandler handler = new EventHandler();
        binding.setHandler(handler);

    }

    public class EventHandler {

        public void changeClass() {

            student.setClassName("class b");
            student.setTeacher("hoshi");
            student.age.set("14");
        }
    }
}
