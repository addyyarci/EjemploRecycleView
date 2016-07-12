package com.example.naird.ejemplorecycleview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by naird on 09/07/2016.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    //constructor
    private String[] myData;
    public RecyclerAdapter(String[] Data){
        myData = Data;

    }

//encargado de crear los viewHolder
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item,parent,false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    //actualizar los datos de viewHolder
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(myData[position]);
    }

    @Override
    public int getItemCount() {
        return myData.length;
    }

    //define ViewHolder dentro de RecyclerView
    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textView;

        public ViewHolder(View itemView){
            super(itemView);

            textView = (TextView) itemView.findViewById(R.id.title);
        }
    }
}
