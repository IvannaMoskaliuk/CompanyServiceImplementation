/**
 * @author Ivanna Moskaliuk KNUTE
 * @version 23.06.2020
 *
 * class ICompanyServiceImpl implements ICompanyService
 *  Final course task
 * The following text is a real  approbation task for Java Juniors in the EPAM company. No more explanation.
 *
 *      2. IMPLEMENT THE FOLLOWING INTERFACE.
 **/

package com.company;

import com.company.COMPANY.Company;

import java.util.ArrayList;
import java.util.List;

public class ICompanyServiceImpl implements ICompanyService {
    /**
     * @param child - company for which we are searching the top level parent
     *              (parent of parent of ...)
     * @return top level paren
     */
    @Override
    public Company getTopLevelParent(Company child) {
        if (child.getParent() == null){
            return child;
        }
        Company company = child;
        while (company.getParent() != null){
            company = company.getParent();
        }
        return company;
    }

    /**
     * @param company   - company for which we are searching the count of employees
     *                  (count of this company employees +
     *                  count employees of all children and their children employees )
     * @param companies - list of all available companies
     * @return count of employees
     */
    @Override
    public long getEmployeeCountForCompanyAndChildren(Company company, List<Company> companies) {
/*
        List<Company> children = company.getChildren();

        long employees = company.getEmployeesCount();
        while (children.size() != 0) {

            employees += children.stream().mapToLong(Company::getEmployeesCount).sum();

        }
        return employees;

*/

        companies.add(company);
        long employees = 0;
        employees += companies.stream().mapToLong(Company::getEmployeesCount).sum();
        return employees;




    }
}
