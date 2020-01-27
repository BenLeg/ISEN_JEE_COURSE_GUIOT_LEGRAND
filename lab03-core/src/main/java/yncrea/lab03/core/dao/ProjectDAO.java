package yncrea.lab03.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import yncrea.lab03.core.entity.Project;

public interface ProjectDAO extends JpaRepository<Project,Long> {

}
