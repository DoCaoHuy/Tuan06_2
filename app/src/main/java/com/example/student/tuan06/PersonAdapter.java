package com.example.student.tuan06;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Student on 9/18/2018.
 */

public class PersonAdapter extends ArrayAdapter<Person> {
    private Context context;
    private int resource;
    private List<Person> objects;

    public PersonAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<Person> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.objects=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView= LayoutInflater.from(context).inflate(resource, parent, false);

        TextView tvname=(TextView)convertView.findViewById(R.id.tvname);
        TextView tvage=(TextView)convertView.findViewById(R.id.tvage);
        ImageView imghinh=(ImageView)convertView.findViewById(R.id.imghinh);

        tvname.setText(objects.get(position).getName());
        tvage.setText(objects.get(position).getAge()+"");
        imghinh.setImageResource(objects.get(position).getImage());


        return convertView;
    }
}
