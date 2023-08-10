package org.example.modulo;

import jakarta.persistence.*;

@Entity
@Table(name = "categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "catego_id")
    private int categoId;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "archivo")
    private String archivo;

    public int getCategoId() {
        return categoId;
    }

    public void setCategoId(int categoId) {
        this.categoId = categoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
}
