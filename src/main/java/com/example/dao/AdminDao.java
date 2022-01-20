package com.example.dao;


import com.example.pojo.Admin;

import java.util.List;

public interface AdminDao {
    public void save(Admin admin);
    public List<Admin> findAll();
    public Admin findById(int id);
    public List<Admin> findByName(String nombre);
    public void update(Admin admin);
    public void delete(Admin admin);
}
