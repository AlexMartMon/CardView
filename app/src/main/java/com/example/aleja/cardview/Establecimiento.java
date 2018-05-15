package com.example.aleja.cardview;

public class Establecimiento {
    private String descripcion,nombre;
    private int img;

    public Establecimiento() {
    }

    public Establecimiento(int img, String descripcion, String nombre) {
        this.img = img;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
