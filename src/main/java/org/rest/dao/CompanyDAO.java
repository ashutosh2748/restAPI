package org.rest.dao;

import org.rest.model.Company;

import java.util.List;

public interface CompanyDAO {

    Company addCompany(Company company);

    Company getCompanyById(int companyId);

    List<Company> getListOfCompany();

    void deleteCompany(int companyId);
}
