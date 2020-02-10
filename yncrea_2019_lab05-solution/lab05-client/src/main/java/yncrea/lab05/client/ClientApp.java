package yncrea.lab05.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import yncrea.lab05.client.config.AppConfig;
import yncrea.lab05.contract.dto.CompanyDTO;
import yncrea.lab05.contract.facade.CompanyWS;

public class ClientApp {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        final CompanyWS bean = context.getBean(CompanyWS.class);
        bean.getAllCompanies().forEach(System.out::println);
        bean.saveCompany(new CompanyDTO("FooBar"));
    }

}
