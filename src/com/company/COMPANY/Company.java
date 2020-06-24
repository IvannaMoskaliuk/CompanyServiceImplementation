/**
 * @author Ivanna Moskaliuk KNUTE
 * @version 23.06.2020
 *
 * Classname Company
 *  Final course task
 * The following text is a real  approbation task for Java Juniors in the EPAM company. No more explanation.
 *
 *      2. IMPLEMENT THE FOLLOWING INTERFACE.
 **/
package com.company.COMPANY;

import java.util.ArrayList;

public class Company {
    // parent for this company nullable, when there is no parent for this company
    private Company parent;
    private long employeesCount;

    private ArrayList<Company> children;


    public Company() {
    }

    public Company(Company parent, long employeesCount) {
        this.parent = parent;
        this.employeesCount = employeesCount;
    }

    public Company getParent() {
        return parent;
    }

    public void setParent(Company parent) {
        this.parent = parent;
    }

    public long getEmployeesCount() {
        return employeesCount;
    }

    public void setEmployeesCount(long employeesCount) {
        this.employeesCount = employeesCount;
    }


    public ArrayList<Company> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Company> children) {
        this.children = children;
    }


    @Override
    public String toString() {
        return "Company{" +
                "parent=" + parent +
                ", employeesCount=" + employeesCount +
                '}';
    }


}
