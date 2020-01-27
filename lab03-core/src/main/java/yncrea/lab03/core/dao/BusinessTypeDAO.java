package yncrea.lab03.core.dao;

import yncrea.lab03.core.entity.BusinessType;
import yncrea.lab03.core.entity.Project;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class BusinessTypeDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public BusinessType read(long id) {
        return entityManager.find(BusinessType.class, id);
    }

    public void persist(BusinessType instance) {
        entityManager.persist(instance);
    }

    public void delete(BusinessType persistentInstance) {
        entityManager.remove(persistentInstance);
    }

    public BusinessType merge(BusinessType detachedInstance) {
        return entityManager.merge(detachedInstance);
    }
}
