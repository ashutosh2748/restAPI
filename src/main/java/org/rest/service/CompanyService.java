package org.rest.service;

import org.rest.model.Company;

import java.util.List;

public interface CompanyService {
    Company addCompany(Company company);

    Company getCompanyById(int companyId);

    List<Company> getListOfCompany();

    void deleteCompany(int companyId);
}
