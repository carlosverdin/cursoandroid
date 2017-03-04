package com.example.cursoandroid.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cursoandroid.cursoandroid.R;
import com.example.cursoandroid.models.Carro;

import java.util.ArrayList;

/**
 * Created by alumno on 04/03/2017.
 */

public class CarAdapter extends RecyclerView.Adapter<Carro> {

    private ArrayList<Carro> data;
    private Context context;

    public CarAdapter(Context context,ArrayList<Carro> carros){
        super(context, R.layout.item_list,carros);
        this.context=context;
        this.data=carros;

    }

    /*
    public CarAdapter(Context context, int resource) {
        super(context, resource);
    }*/

    @Override
    public int getCount() {
        return data.size();
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        View viewItem= LayoutInflater.from(context).inflate(R.layout.item_list,null);

        Carro carro=data.get(position);


        TextView title=(TextView)viewItem.findViewById(R.id.titleTextView);
        title.setText(carro.getTitle());

        TextView description=(TextView)viewItem.findViewById(R.id.subtitleTextView);
        description.setText(carro.getDescription());

        ImageView image= (ImageView)viewItem.findViewById(R.id.image);
        image.setImageResource(carro.getId_image());

        return viewItem;
    }

    static class viewHolder extends RecyclerView.ViewHolder{
        private final TextView title;
        private final TextView description;
        private final ImageView image;

        public viewHolder(View view){
            super(view);
            title=(TextView)view.findViewById(R.id.titleTextView);
            description=(TextView)view.findViewById(R.id.subtitleTextView);
            image=(ImageView)view.findViewById(R.id.image);
        }
    }
}
