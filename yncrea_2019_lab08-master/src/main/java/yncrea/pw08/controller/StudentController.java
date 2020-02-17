package yncrea.pw08.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import yncrea.pw08.entity.Student;
import yncrea.pw08.service.StudentService;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/lissteDeTousLesEtudiantsMeilleursQueJules")
    //  @RequestMapping(value = "/lissteDeTousLesEtudiantsMeilleursQueJules", method = RequestMethod.GET)
    public List<Student> allController() {
        return studentService.findAll();
    }
}
