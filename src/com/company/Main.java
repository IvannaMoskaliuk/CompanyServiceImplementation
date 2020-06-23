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

        Company chief = new Company(null,"chief", 20);
        Company lawyer = new Company(chief, "lawer", 5);
        Company developer = new Company(chief, "developer",  15);
        Company backEnd = new Company(developer, "Back-End", 10);
        Company devOps = new Company(backEnd, "DevOps",  5);
        Company frontEnd = new Company(developer, "Front-End", 15);
        Company design = new Company(frontEnd, "Design",  5);
        Company accounting = new Company(null, "accounting", 20);


        // add all companies to ArrayList
        List<Company> companies = new ArrayList<>
                (
                        Arrays.asList(
                                chief,
                                accounting,
                                lawyer,
                                developer,
                                backEnd,
                                frontEnd,
                                devOps,
                                design
                        )
                );

        System.out.println("All existing companies: ");
        for (Company company : companies) {
            System.out.println(company.getName());
        }

        // Designer top level parent
        String designTopLevelParent = service.getTopLevelParent(design).getName();
        System.out.println("Designer top level parent is: " + designTopLevelParent);

        //  Designer top level parent
        String lawyerTopLevelParent = service.getTopLevelParent(lawyer).getName();
        System.out.println("Lawyer top level parent is: " + lawyerTopLevelParent);

        //  Accounting top level parent
        String accountingTopLevelParent = service.getTopLevelParent(accounting).getName();
        System.out.println("Accounting top level parent is: " + accountingTopLevelParent);



        System.out.println(service.getEmployeeCountForCompanyAndChildren(design, companies));

    }
}
