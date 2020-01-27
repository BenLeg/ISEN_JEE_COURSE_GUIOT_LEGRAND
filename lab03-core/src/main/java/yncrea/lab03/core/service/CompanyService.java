package yncrea.lab03.core.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yncrea.lab03.core.entity.Company;

import java.util.Map;

@Service
@Transactional
public class CompanyService {
    //TODO inject a DAO


    public void deleteAll() {
        //TODO implement
    }


    public void save(final Company company) {
        //TODO implement
    }


    public long countAll() {
        //TODO implement
        return 0;
    }


    public Map<String, Integer> getAllWithProjectCount() {
        //TODO return a map with the name of the company for the key and the count in the value
       return null;
    }
}
