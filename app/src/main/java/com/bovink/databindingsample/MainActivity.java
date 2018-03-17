package com.bovink.databindingsample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private String mPackageName;
    List<Map<String, String>> mapList;
    private ListView listView;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;

        listView = findViewById(R.id.lv_activity);

        int type = getIntent().getIntExtra("type", 0);

        if (type == 1) {

            mapList = generateResourceList();
            mPackageName = "com.bovink.databindingsample.databinding.databindinglayout.";
        } else if (type == 2) {

            mapList = generateEventList();
            mPackageName = "com.bovink.databindingsample.databinding.layoutdetails.";
        } else if (type == 3) {

            mapList = generateViewList();
            mPackageName = "com.bovink.databindingsample.databinding.expression.";
        } else if (type == 4) {

            mapList = generateViewsList();
            mPackageName = "com.bovink.databindingsample.databinding.observabledata.";
        } else if (type == 5) {

            mapList = generateViews2List();
            mPackageName = "com.bovink.databindingsample.databinding.generatebinding.";
        } else if (type == 6) {

            mapList = generateViews3List();
            mPackageName = "com.bovink.databindingsample.databinding.converter.";
        } else if (type == 7) {

            mapList = generateCustomSetters();
            mPackageName = "com.bovink.databindingsample.databinding.attributesetters.";
        } else {

            mapList = generateBindList();
            mPackageName = "com.bovink.databindingsample.";
        }

        SimpleAdapter simpleAdapter = new SimpleAdapter(this,
                mapList,
                R.layout.list_item_activity,
                new String[]{"name"},
                new int[]{R.id.tv_name}
        );

        listView.setAdapter(simpleAdapter);

        listView.setOnItemClickListener(new MyOnItemClickListener());
    }

    private class MyOnItemClickListener implements AdapterView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            String activityName = mapList.get(position).get("name");
            if (activityName.contains(".")) {
                System.out.println("activityName = " + activityName);
                activityName = activityName.split("\\.")[0];
            }

            try {
                Class clazz = Class.forName(mPackageName + activityName);
                Intent intent = new Intent(mContext, clazz);
                if (activityName.equals("MainActivity")) {
                    intent.putExtra("type", position + 1);
                }
                startActivity(intent);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    private List<Map<String, String>> generateBindList() {

        List<Map<String, String>> mapList = new ArrayList<>();
        Map<String, String> map;

        map = new HashMap<>();
        map.put("name", "MainActivity.DataBindingLayout");
        mapList.add(map);
        map = new HashMap<>();
        map.put("name", "MainActivity.LayoutDetails");
        mapList.add(map);
        map = new HashMap<>();
        map.put("name", "MainActivity.Expression");
        mapList.add(map);
        map = new HashMap<>();
        map.put("name", "MainActivity.Observable");
        mapList.add(map);
        map = new HashMap<>();
        map.put("name", "MainActivity.GenerateBinding");
        mapList.add(map);
        map = new HashMap<>();
        map.put("name", "MainActivity.Converter");
        mapList.add(map);
        map = new HashMap<>();
        map.put("name", "MainActivity.AttributeSetters");
        mapList.add(map);

        return mapList;
    }

    private List<Map<String, String>> generateResourceList() {

        List<Map<String, String>> mapList = new ArrayList<>();
        Map<String, String> map;

        map = new HashMap<>();
        map.put("name", "DataBindingLayoutActivity");
        mapList.add(map);
        map = new HashMap<>();
        map.put("name", "LayoutBindActivity");
        mapList.add(map);
        map = new HashMap<>();
        map.put("name", "EventHandlingActivity");
        mapList.add(map);

        return mapList;
    }

    private List<Map<String, String>> generateEventList() {

        List<Map<String, String>> mapList = new ArrayList<>();
        Map<String, String> map;

        map = new HashMap<>();
        map.put("name", "ImportActivity");
        mapList.add(map);

        map = new HashMap<>();
        map.put("name", "CustomBindActivity");
        mapList.add(map);

        map = new HashMap<>();
        map.put("name", "IncludeActivity");
        mapList.add(map);

        return mapList;
    }

    private List<Map<String, String>> generateViewList() {

        List<Map<String, String>> mapList = new ArrayList<>();
        Map<String, String> map;

        map = new HashMap<>();
        map.put("name", "ExpressionActivity");
        mapList.add(map);

        map = new HashMap<>();
        map.put("name", "CollectionActivity");
        mapList.add(map);

        map = new HashMap<>();
        map.put("name", "ResourceActivity");
        mapList.add(map);
        return mapList;
    }

    private List<Map<String, String>> generateViewsList() {

        List<Map<String, String>> mapList = new ArrayList<>();
        Map<String, String> map;

        map = new HashMap<>();
        map.put("name", "ObservableActivity");
        mapList.add(map);

        map = new HashMap<>();
        map.put("name", "ObservableCollectionActivity");
        mapList.add(map);

        return mapList;
    }

    private List<Map<String, String>> generateViews2List() {

        List<Map<String, String>> mapList = new ArrayList<>();
        Map<String, String> map;

        map = new HashMap<>();
        map.put("name", "GenerateViewActivity");
        mapList.add(map);

        return mapList;
    }

    private List<Map<String, String>> generateViews3List() {

        List<Map<String, String>> mapList = new ArrayList<>();
        Map<String, String> map;

        map = new HashMap<>();
        map.put("name", "ConverterActivity");
        mapList.add(map);

        return mapList;
    }

    private List<Map<String, String>> generateCustomSetters() {

        List<Map<String, String>> mapList = new ArrayList<>();
        Map<String, String> map;

        map = new HashMap<>();
        map.put("name", "AutomaticSettersActivity");
        mapList.add(map);

        map = new HashMap<>();
        map.put("name", "RenamedSettersActivity");
        mapList.add(map);

        map = new HashMap<>();
        map.put("name", "CustomSettersActivity");
        mapList.add(map);

        return mapList;
    }
}
