/**
 * @author Ivanna Moskaliuk KNUTE
 * @version 23.06.2020
 *
 * Classname Main
 *  Final course task
 * The following text is a real  approbation task for Java Juniors in the EPAM company. No more explanation.
 *
 *      2. IMPLEMENT THE FOLLOWING INTERFACE.
 **/
package com.company;

import com.company.COMPANY.Company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ICompanyServiceImpl service = new ICompanyServiceImpl();

        Company chief = new Company(null, 20);
        Company lawyer = new Company(chief, 5);
        Company developer = new Company(chief,  15);
        Company backEnd = new Company(developer, 10);
        Company devOps = new Company(backEnd,   5);
        Company frontEnd = new Company(developer,  15);
        Company design = new Company(frontEnd,   5);
        Company accounting = new Company(null,  20);


        // add all companies to ArrayList
        List<Company> companies = new ArrayList<>();
        companies.add(chief);
        companies.add(accounting);
        companies.add(developer);
        companies.add(backEnd);
        companies.add(devOps);
        companies.add(frontEnd);
        companies.add(design);

        System.out.println("All existing companies: ");
        for (Company company : companies) {
            System.out.println(company);
        }

        //test 1
        System.out.println(service.getTopLevelParent(chief));
        System.out.println(service.getTopLevelParent(accounting));
        System.out.println(service.getTopLevelParent(developer));
        System.out.println(service.getTopLevelParent(backEnd));
        System.out.println(service.getTopLevelParent(devOps));
        System.out.println(service.getTopLevelParent(frontEnd));
        System.out.println(service.getTopLevelParent(design));


        System.out.println("\n------------------------");
        // test 2
        System.out.println(service.getEmployeeCountForCompanyAndChildren(design, companies));
        System.out.println(service.getEmployeeCountForCompanyAndChildren(chief, companies));
        System.out.println(service.getEmployeeCountForCompanyAndChildren(accounting, companies));
        System.out.println(service.getEmployeeCountForCompanyAndChildren(frontEnd, companies));


    }
}
