package Java_learning;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class TaxCalc {
    public static void main(String args[]) {
        double income = 0;
        int province = 0;
        double fedTax = 0;
        double provTax = 0;
        double totalTax = 0;
        String provTaxStr, fedTaxStr, totalTaxStr;
        Scanner userIn = new Scanner(System.in);
        DecimalFormat formator = new DecimalFormat("###,###,###.00");
        
        //prompt
        System.out.println("What is your taxable income? ");
        income = userIn.nextDouble();
        System.out.println("In which province do you live? (1 for BC, 2 for Alberta, and 3 for Ontario)");
        province = userIn.nextInt();
        
        //calculate the federal tax
        fedTax = Federal(income);
        fedTaxStr = formator.format(fedTax);
        System.out.println("Your federal tax is $" + fedTaxStr);//check the province
        switch(province){
            case 1: 
                provTax = BritishColumbia(income);
                provTaxStr = formator.format(provTax);
                System.out.println("Your British Columbia provincial tax is $" + provTaxStr);
                break;
            case 2:
                provTax = Alberta(income);
                provTaxStr = formator.format(provTax);
                System.out.println("Your Alberta provincial tax is $" + provTaxStr);
                break;
            case 3:
                provTax = Ontario(income);
                provTaxStr = formator.format(provTax);
                System.out.println("Your Ontario provincial tax is $" + provTaxStr);
                break;
        }
        
        //output the total tax
        totalTax = fedTax + provTax;
        totalTaxStr = formator.format(totalTax);
        System.out.println("Your total tax for the year 2019/2020 is $" + totalTaxStr);
        
        
    }
    
    public static double Federal(double income){
        double tax = 0;
        if(income > 214368){
            tax = 48535 * 0.15 + (97069 - 48535) * 0.205 + (150473 - 97069) * 0.26 + (214368 - 150473) * 0.29 + (income - 214368) * 0.33;
        }else if(150473 < income && income <= 214368){
            tax = 48535 * 0.15 + (97069 - 48535) * 0.205 + (150473 - 97069) * 0.26 + (income - 150473) * 0.29;
        }else if(97069 < income && income <= 150473){
            tax = 48535 * 0.15 + (97069 - 48535) * 0.205 + (income - 97069) * 0.26;
        }else if(48535 < income && income <= 97069){
            tax = 48535 * 0.15 + (income - 48535) * 0.205;
        }else if(income <= 48535){
            tax = income * 0.15;
        }
        return tax;
    }public static double BritishColumbia(double income){
        double tax = 0;
        if(income > 153900){
            tax = 40707 * 0.0506 + (81416 - 40707) * 0.077 + (93476 - 81416) * 0.105 + (113503 - 93476) * 0.1229 + (153900 - 113503) * 0.147 + (income - 153900) * 0.168;
        }else if(113503 < income && income <= 153900){
            tax = 40707 * 0.0506 + (81416 - 40707) * 0.077 + (93476 - 81416) * 0.105 + (113503 - 93476) * 0.1229 + (income - 113503) * 0.147;
        }else if(93476 < income && income <= 113503){
            tax = 40707 * 0.0506 + (81416 - 40707) * 0.077 + (93476 - 81416) * 0.105 + (income - 93476) * 0.1229;
        }else if(81416 < income && income <= 93476){
            tax = 40707 * 0.0506 + (81416 - 40707) * 0.077 + (income - 81416) * 0.105;
        }else if(40707 < income && income <= 81416){
            tax = 40707 * 0.0506 + (income - 40707) * 0.077;
        }else if(income <= 40707){
            tax = income * 0.0506;
        }
        return tax;
        
    }
    
    public static double Alberta(double income){
        double tax = 0;
        if(income > 314928){
            tax = 131200 * 0.1 + (157464 - 131200) * 0.12 + (209252 - 157464) * 0.13 + (314928 - 209252) * 0.14 + (income - 314928) * 0.15;
        }else if(209252 < income && income <= 314928){
            tax = 131200 * 0.1 + (157464 - 131200) * 0.12 + (209252 - 157464) * 0.13 + (income - 209252) * 0.14;
        }else if(157464 < income && income <= 209252){
            tax = 131200 * 0.1 + (157464 - 131200) * 0.12 + (income - 157464) * 0.13;
        }else if(131200 < income && income <= 157464){
            tax = 131200 * 0.1 + (income - 131200) * 0.12;
        }else if(income <= 131200){
            tax = income * 0.1;
        }
        return tax;
    }
    
    public static double Ontario(double income){
        double tax = 0;
        if(income > 220000){
            tax = 43906 * 0.0505 + (87813 - 43906) * 0.0915 + (150000 - 87813) * 0.1116 + (220000 - 150000) * 0.1216 + (income - 220000) * 0.1316;
        }else if(150000 < income && income <= 220000){
            tax = 43906 * 0.0505 + (87813 - 43906) * 0.0915 + (150000 - 87813) * 0.1116 + (income - 150000) * 0.1216;
        }else if(87813 < income && income <= 150000){
            tax = 43906 * 0.0505 + (87813 - 43906) * 0.0915 + (income - 87813) * 0.1116;
        }else if(43906 < income && income <= 87813){
            tax = 43906 * 0.0505 + (income - 43906) * 0.0915;
        }else if(income <= 43906){
            tax = income * 0.0505;
        }
        return tax;
    }
}