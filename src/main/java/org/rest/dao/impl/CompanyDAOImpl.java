package org.rest.dao.impl;

import org.rest.dao.CompanyDAO;
import org.rest.model.Company;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CompanyDAOImpl implements CompanyDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public Company addCompany(Company company) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(company);
        return company;
    }

    public Company getCompanyById(int companyId) {
        Session session = this.sessionFactory.getCurrentSession();
        Company company = (Company) session.get(Company.class, new Integer(companyId));
        return company;
    }

    public List<Company> getListOfCompany() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Company> companies = session.createQuery("FROM Company").list();
        return companies;
    }

    public void deleteCompany(int companyId) {
        Session session = this.sessionFactory.getCurrentSession();
        Company company = (Company) session.get(Company.class, new Integer(companyId));

        if (null != company) {
            session.delete(company);
        }
    }
}
