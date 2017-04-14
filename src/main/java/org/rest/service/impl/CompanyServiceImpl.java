package org.rest.service.impl;

import org.rest.dao.CompanyDAO;
import org.rest.model.Company;
import org.rest.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    private CompanyDAO companyDAO;

    public void setCompanyDAO(CompanyDAO companyDAO) {
        this.companyDAO = companyDAO;
    }

    @Transactional
    public Company addCompany(Company company) {
        return companyDAO.addCompany(company);
    }

    @Transactional
    public Company getCompanyById(int companyId) {
        return companyDAO.getCompanyById(companyId);
    }

    @Transactional
    public List<Company> getListOfCompany() {
        return companyDAO.getListOfCompany();
    }

    @Transactional
    public void deleteCompany(int companyId) {
        companyDAO.deleteCompany(companyId);
    }
}
