import java.util.*;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to EmployeeWage Computation Program : ");
        Scanner sc = new Scanner(System.in);

        //Random random = new Random();
        System.out.println("Enter number : ");

        int n = sc.nextInt();
        boolean present = false;
        if(n == 1){
            System.out.println("Employee is present ");
              present = true;
        }else if(n==0){
            System.out.println("Employee is absent ");
             present = false;
        }else{
            System.out.println("Enter valid number ");
        }

        dailyWage(present);

    }
    static void dailyWage(boolean pr){
        int fulldayhr = 8;
        int wageperhr = 20;

        if(pr){
            double dailyEmployeeWage = wageperhr * fulldayhr;
            System.out.println("Daily Employee Wage is : " + dailyEmployeeWage);
        }
    }
}
