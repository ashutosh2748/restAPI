package org.rest.controller;

import org.rest.model.Company;
import org.rest.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/companies", method = RequestMethod.GET)
    public List<Company> getAllCompanies() {
        List<Company> companies = companyService.getListOfCompany();
        return companies;
    }

    @RequestMapping(value = "/addCompany", method = RequestMethod.POST)
    public void addCompany(@RequestBody Company company) {
        companyService.addCompany(company);
    }
}
