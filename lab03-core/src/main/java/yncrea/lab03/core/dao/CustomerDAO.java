package yncrea.lab03.core.dao;

import yncrea.lab03.core.entity.Company;
import yncrea.lab03.core.entity.Customer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class CustomerDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public Customer read(long id) {
        return entityManager.find(Customer.class, id);
    }

    public void persist(Customer instance) {
        entityManager.persist(instance);
    }

    public void delete(Customer persistentInstance) {
        entityManager.remove(persistentInstance);
    }

    public Customer merge(Customer detachedInstance) {
        return entityManager.merge(detachedInstance);
    }
}
