package com.example.appiva;

import android.content.ClipData;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.MyViewHolder> {
Context context;
private List<list> items;
public adapter(Context context , List<list> items){
    this.context=context;
    this.items=items;
}

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
    View v;
    v = LayoutInflater.from(context).inflate(R.layout.listfragment,viewGroup,false);
    MyViewHolder viewHolder = new MyViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
    myViewHolder.list.setText(items.get(i).getList());
    myViewHolder.no.setText(items.get(i).getItems());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

    private  TextView list ,no;

    public MyViewHolder(View itemView){
        super(itemView);

        list = itemView.findViewById(R.id.listName);
        no = itemView.findViewById(R.id.noOfItems);
    }
 }


        }