package com.example.finalproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class MyAdapter extends FirebaseRecyclerAdapter<model,MyAdapter.myviewholder> {

    public MyAdapter(@NonNull FirebaseRecyclerOptions<model> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull model model) {
        holder.GroupBaslik.setText(model.getGroupBaslik());
        holder.GroupAcik.setText(model.getGroupAcik());

    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);

        return new myviewholder(view);
    }

    class myviewholder extends RecyclerView.ViewHolder{

    TextView GroupBaslik, GroupAcik;
    public myviewholder(@NonNull View itemView) {
        super(itemView);
        GroupBaslik = itemView.findViewById(R.id.GroupBaslik);
        GroupAcik = itemView.findViewById(R.id.GroupAcik);
    }
}

}
