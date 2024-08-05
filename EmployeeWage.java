import java.util.*;

public class EmployeeWage {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to EmployeeWage Computation Program : ");
        //Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");

        int n = sc.nextInt();
        boolean present = false;
        if (n == 1) {
            System.out.println("Employee is present ");
            present = true;
        } else if (n == 0) {
            System.out.println("Employee is absent ");
            present = false;
        } else if (n == 2) {
            System.out.println("Employee is present");

        } else {
            System.out.println("Enter valid number ");
        }

        dailyWage(present, n);
        wageupcondition(n);

    }

    static void dailyWage(boolean pr, int n) {
        int fulldayhr = 8;
        int halfdayhr = 4;
        int wageperhr = 20;

        switch (n) {
   
            case 1:
               double dailyEmployeeWage = wageperhr * fulldayhr;
                System.out.println("Daily Employee Wage is : " + dailyEmployeeWage);
                monthalyWage(dailyEmployeeWage);

                break;
            case 2:
                double halfDayWage = wageperhr * halfdayhr;
                System.out.println("Part time day wage is " + halfDayWage);
                break;
            default:
                break;
        }

    }
    static void monthalyWage(double dailyEmployeeWage){
        int monthWorkingDay = 20;
        double monthalyEmployeeWage = dailyEmployeeWage * monthWorkingDay;
        System.out.println("Monthly Employee Wage is : " + monthalyEmployeeWage);

        
    }
    static void wageupcondition(int n){
        
        int hr = 100;
        int day = 20;
        double totalwage = hr * 20;
       
        if(n == 1){
            while (hr <= 100 && day <= 20) {
                System.out.println("Employee wage for 100hr and 20 days is : " + totalwage);
                hr++;
                day++;
            }
        
        }

    }


}
