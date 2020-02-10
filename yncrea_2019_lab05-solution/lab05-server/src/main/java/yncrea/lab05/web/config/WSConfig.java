package yncrea.lab05.web.config;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import yncrea.lab05.contract.facade.CompanyWS;

import javax.xml.ws.Endpoint;

@Configuration
@ComponentScan(basePackages = "yncrea.lab05.web.service")
@ImportResource("classpath:META-INF/cxf/cxf.xml")
public class WSConfig {

    @Bean
    public Endpoint endpoint(Bus bus, CompanyWS companyWS) {
        final EndpointImpl endpoint = new EndpointImpl(bus, companyWS);
        endpoint.setAddress("/company");
        endpoint.publish();
        return endpoint;
    }
}
