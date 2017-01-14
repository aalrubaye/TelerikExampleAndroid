package com.example.abdul.listexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.telerik.widget.list.ListViewAdapter;
import com.telerik.widget.list.RadListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadListView listView = (RadListView)findViewById(R.id.listView);
        ListViewAdapter listViewAdapter = new ListViewAdapter(getListOfCities());
        listView.setAdapter(listViewAdapter);
    }


    private List<City> getListOfCities() {
        List<City> cities = new ArrayList<>();
        cities.add(new City("London", "United Kingdom"));
        cities.add(new City("Berlin", "Germany"));
        cities.add(new City("Madrid", "Spain"));
        cities.add(new City("Rome", "Italy"));
        cities.add(new City("Paris", "France"));
        cities.add(new City("Hamburg", "Germany"));
        cities.add(new City("Barcelona", "Spain"));
        cities.add(new City("Munich", "Germany"));
        cities.add(new City("Milan", "Italy"));
        cities.add(new City("Cologne", "Germany"));
        return cities;
    }
}


