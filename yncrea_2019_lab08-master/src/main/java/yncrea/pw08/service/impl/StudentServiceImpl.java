package yncrea.pw08.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yncrea.pw08.dao.StudentDAO;
import yncrea.pw08.entity.Student;
import yncrea.pw08.service.StudentService;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;


    @Override
    public List<Student> findAll() {
        return studentDAO.findAll();
    }
}
