package yncrea.lab05.client.config;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import yncrea.lab05.contract.facade.CompanyWS;

@Configuration
public class AppConfig {

    @Bean
    public CompanyWS companyWS() {
        final JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setServiceClass(CompanyWS.class);
        jaxWsProxyFactoryBean.setAddress("http://localhost:8080/lab05/services/company?wsdl");
        return (CompanyWS) jaxWsProxyFactoryBean.create();
    }
}
