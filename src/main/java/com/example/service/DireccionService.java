package com.example.service;

import com.example.dao.AdminDao;
import com.example.dao.DireccionDao;
import com.example.pojo.Admin;
import com.example.pojo.Direccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DireccionService {

    @Autowired
    private AdminDao adminDao;
    @Autowired
    private DireccionDao direccionDao;

    public void save(Direccion direccion, Admin admin) {
        direccion.setAdmin(admin);
        direccionDao.save(direccion);
    }

    public List<Direccion> findAll(int id) {
        Admin admin = adminDao.findById(id);
        return direccionDao.findAll(admin);
    }
}
