package com.example.aleja.cardview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private ArrayList<Establecimiento> establecimientos;
    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView descripcion,nombre;
        private ImageView imagen;

        public ViewHolder(View itemView) {
            super(itemView);
            descripcion = itemView.findViewById(R.id.tv_descripcion);
            nombre = itemView.findViewById(R.id.tv_nombre);
            imagen = itemView.findViewById(R.id.img);
        }
    }

    public RecyclerViewAdapter(ArrayList<Establecimiento> establecimientos) {
        this.establecimientos = establecimientos;
    }


    //Encargado de generar un nuevo item en la lista
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_content,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    //Realiza modificaciones para cada item
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nombre.setText(establecimientos.get(position).getNombre());
        holder.descripcion.setText(establecimientos.get(position).getDescripcion());
        holder.imagen.setImageResource(Integer.valueOf(establecimientos.get(position).getImg()));
    }
    //Cantidad de elementos de la lista
    @Override
    public int getItemCount() {
        return establecimientos.size();
    }
}
