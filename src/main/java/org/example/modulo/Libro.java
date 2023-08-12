package org.example.modulo;

import jakarta.persistence.*;

@Entity
@Table(name = "libro")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "libro_Id")
    private int libroid;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "autor")
    private String autor;

    @Column(name = "categoria")
    private String categoria;

    @Column(name = "precio")
    private double precio;

    @Column(name = "estado")
    private String estado;

    public Libro() {
    }
    public int getLibroid() {
        return libroid;
    }

    public void setLibroid(int libroid) {
        this.libroid = libroid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
