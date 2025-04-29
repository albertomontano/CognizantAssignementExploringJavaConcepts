import java.util.Scanner;

public class Part3WorkingWithStringsAndUserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        String upperFullName = fullName.toUpperCase();

        System.out.println(upperFullName);

        System.out.println("The first letter appears: "+ numberOfTimesFirstLetter(upperFullName + " times"));


    }

    public static int numberOfTimesFirstLetter(String upperFullName) {
        int count = 0;
        char firstLetter = upperFullName.charAt(0);
        for(int i = 0; i < upperFullName.length(); i++) {
            if(upperFullName.charAt(i) == firstLetter) {
                count++;
            }
        }

        return count;
    }


}
