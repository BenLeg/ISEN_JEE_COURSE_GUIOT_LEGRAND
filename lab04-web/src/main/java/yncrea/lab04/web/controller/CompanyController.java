package yncrea.lab04.web.controller;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.misc.Request;
import yncrea.lab04.core.entity.Company;
import yncrea.lab04.core.service.CompanyService;

import java.util.List;

@Controller
public class CompanyController {

    private CompanyService companyService;

    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyController.class);

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @RequestMapping(path = "/list", method = RequestMethod.GET)
    public String getListOfCompanies(ModelMap modelMap){
        final List<Company> allCompanyWithProjects = companyService.findAllWithProjects();
        modelMap.addAttribute("companies",allCompanyWithProjects);
        return "companiesList";
    }

    @RequestMapping(path = "{id}/delete",method = RequestMethod.DELETE)
    public String deleteOneCompany(@PathVariable Long id){
        companyService.deleteById(id);
        LOGGER.debug("The company has been deleted from the database");
        return "redirect:/list";
    }
}
