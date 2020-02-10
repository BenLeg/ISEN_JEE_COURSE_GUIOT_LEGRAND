package yncrea.lab05.web.service.impl;

import yncrea.lab05.contract.dto.CompanyDTO;
import yncrea.lab05.contract.facade.CompanyWS;
import yncrea.lab05.core.entity.Company;
import yncrea.lab05.core.service.CompanyService;

import javax.inject.Named;
import javax.jws.WebService;
import java.util.List;
import java.util.stream.Collectors;

@Named("companyWS")
@WebService(endpointInterface = "yncrea.lab05.contract.facade.CompanyWS")
public class CompanyWSImpl implements CompanyWS {

    private CompanyService companyService;


    public CompanyWSImpl(final CompanyService companyService) {
        this.companyService = companyService;
    }


    @Override
    public List<CompanyDTO> getAllCompanies() {
        return companyService.findAllWithProjects()
                .stream()
                .map(c -> new CompanyDTO(c.getName()))
                .collect(Collectors.toList());
    }


    @Override
    public void saveCompany(final CompanyDTO company) {
        companyService.save(new Company(company.getName()));
    }
}
