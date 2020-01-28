package yncrea.lab04.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import yncrea.lab04.core.entity.Company;
import yncrea.lab04.core.service.CompanyService;

import java.util.List;

@Controller
public class CompanyController {

    private CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @RequestMapping(path = "/list", method = RequestMethod.GET)
    public String getListOfCompanies(ModelMap modelMap){
        final List<Company> allCompanyWithProjects = companyService.findAllWithProjects();
        modelMap.addAttribute("companies",allCompanyWithProjects);
        return "companiesList";
    }
}
