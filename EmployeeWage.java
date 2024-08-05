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



        

    }
}
