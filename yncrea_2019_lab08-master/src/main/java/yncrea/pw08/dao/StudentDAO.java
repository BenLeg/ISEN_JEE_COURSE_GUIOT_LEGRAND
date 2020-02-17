package yncrea.pw08.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import yncrea.pw08.entity.Student;

public interface StudentDAO extends JpaRepository<Student,Long>{

}
