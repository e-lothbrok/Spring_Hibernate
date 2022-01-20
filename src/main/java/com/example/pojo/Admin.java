package com.example.pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "admin")
public class Admin {
    public Admin() {
    }

    public Admin(String nombre, String cargo, Timestamp fechaCreacion) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.fechaCreacion = fechaCreacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Set<Direccion> getDireccion() {
        return direccion;
    }

    public void setDireccion(Set<Direccion> direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "cargo")
    private String cargo;
    @Column(name = "fechaCreacion")
    private Timestamp fechaCreacion;
    @OneToMany(mappedBy = "admin")
    private Set<Direccion> direccion;
}
