package yncrea.lab03.core.dao;

import yncrea.lab03.core.entity.Customer;
import yncrea.lab03.core.entity.Project;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ProjectDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public Project read(long id) {
        return entityManager.find(Project.class, id);
    }

    public void persist(Project instance) {
        entityManager.persist(instance);
    }

    public void delete(Project persistentInstance) {
        entityManager.remove(persistentInstance);
    }

    public Project merge(Project detachedInstance) {
        return entityManager.merge(detachedInstance);
    }
}
