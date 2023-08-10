package org.example.modulo;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "autor_id")
    private int autorId;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @Column(name = "pais")
    private String pais;

    public int getAutorId() {
        return autorId;
    }

    public Autor() {
    }

    public Autor(int autorId, String nombre, Date fechaNacimiento, String pais) {
        this.autorId = autorId;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.pais = pais;
    }

    public void setAutorId(int autorId) {
        this.autorId = autorId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
