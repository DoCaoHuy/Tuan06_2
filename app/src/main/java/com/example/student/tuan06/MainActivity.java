package com.example.student.tuan06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvperson;
    private ArrayList<Person> objects;
    private PersonAdapter adt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvperson=(ListView)findViewById(R.id.lvPerson);

        objects=new ArrayList<>();
        objects.add(new Person("Huy", 25, R.mipmap.ic_launcher));
        objects.add(new Person("Minh", 25, R.mipmap.ic_launcher));

        adt=new PersonAdapter(this, R.layout.personcustom, objects);
        lvperson.setAdapter(adt);
    }
}
