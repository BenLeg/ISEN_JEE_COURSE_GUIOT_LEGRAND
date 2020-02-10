package yncrea.lab05.contract.facade;

import yncrea.lab05.contract.dto.CompanyDTO;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface CompanyWS {

    List<CompanyDTO> getAllCompanies();

    void saveCompany(CompanyDTO company);
}
