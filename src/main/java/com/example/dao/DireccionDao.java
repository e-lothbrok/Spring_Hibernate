package com.example.dao;

import com.example.pojo.Admin;
import com.example.pojo.Direccion;

import java.util.List;

public interface DireccionDao {
    public void save(Direccion direccion);
    public List<Direccion> findAll(Admin admin);
}
