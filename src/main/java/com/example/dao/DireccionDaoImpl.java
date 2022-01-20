package com.example.dao;

import com.example.pojo.Admin;
import com.example.pojo.Direccion;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class DireccionDaoImpl implements DireccionDao{

    @Autowired
    private SessionFactory sessionFactory;
    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void save(Direccion direccion) {
        getSession().save(direccion);
    }

    @Override
    public List<Direccion> findAll(Admin admin) {
        Criteria criteria = getSession().createCriteria(Direccion.class)
                .setFetchMode("admin", FetchMode.JOIN)
                .add(Restrictions.eq("admin.id", admin.getId()))
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        return criteria.list();
    }
}
