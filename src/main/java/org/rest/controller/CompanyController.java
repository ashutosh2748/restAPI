package org.rest.controller;

import org.rest.model.Company;
import org.rest.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Company> getAllCompanies() {
        List<Company> companies = companyService.getListOfCompany();
        return companies;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void addCompany(@RequestBody Company company) {
        companyService.addCompany(company);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Company getCompanyById(@PathVariable("id") int id) {
        Company company = companyService.getCompanyById(id);
        return company;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteCompanyById(@PathVariable("id") int id) {
        companyService.deleteCompany(id);
    }
}
