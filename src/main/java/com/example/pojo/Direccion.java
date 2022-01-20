package com.example.pojo;

import javax.persistence.*;

@Entity
@Table(name = "direccion")
public class Direccion {

    public Direccion() {
    }

    public Direccion(String calle, String cp) {
        this.calle = calle;
        this.cp = cp;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "id=" + id +
                ", calle='" + calle + '\'' +
                ", cp='" + cp + '\'' +
                '}';
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "calle")
    private String calle;
    @Column(name = "cp")
    private String cp;
    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;
}
