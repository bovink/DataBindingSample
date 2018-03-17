package com.bovink.databindingsample.databinding.layoutbinding;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.bovink.databindingsample.databinding.EventHandlerActBinding;
import com.bovink.databindingsample.model.Person;


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

        Person person1 = new Person();
        person1.setName("lilei");

        Person person2 = new Person();
        person2.setName("hanmeimei");

        binding.setPerson1(person1);
        binding.setPerson2(person2);

        MethodReference methodReference = new MethodReference();
        ListenerBinding listenerBinding = new ListenerBinding();

        binding.setReference(methodReference);
        binding.setBinding(listenerBinding);
    }

    /**
     * must exactly match the signature of the method in the Listener object
     */
    public class MethodReference {

        public void methodDoSomething(View view) {

            System.out.println("MethodReference.methodDoSomething");
        }
    }

    /**
     * must match the expected return value of the listener (unless it is expecting void)
     */
    public class ListenerBinding {

        public void listenerDoSomething() {

            System.out.println("ListenerBinding.listenerDoSomething");
        }
    }
}
