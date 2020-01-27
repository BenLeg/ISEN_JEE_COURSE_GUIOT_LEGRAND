package yncrea.lab03.core.dao;

import yncrea.lab03.core.entity.Company;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class CompanyDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public Company read(long id) {
        return entityManager.find(Company.class, id);
    }

    public void persist(Company instance) {
        entityManager.persist(instance);
    }

    public void delete(Company persistentInstance) {
        entityManager.remove(persistentInstance);
    }

    public Company merge(Company detachedInstance) {
        return entityManager.merge(detachedInstance);
    }
}
