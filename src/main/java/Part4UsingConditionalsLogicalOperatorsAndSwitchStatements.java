public class Part4UsingConditionalsLogicalOperatorsAndSwitchStatements {
    public static void main(String[] args) {

        int firstTestScore = 66;
        int secondTestScore = 90;
        int thirdTestScore = 37;

        int averageScore = (firstTestScore + secondTestScore + thirdTestScore) / 3;

        System.out.println("The average score is: " + averageScore);

        if (averageScore >= 90 && averageScore <= 100) {
            System.out.println("Excellent ");
        } else if (averageScore >= 70 && averageScore <= 89) {
            System.out.println("Good");
        } else if (averageScore >= 50 && averageScore <= 69) {
            System.out.println("Average ");
        } else {
            System.out.println("Poor ");
        }

        int day = 6;
        switch (day) {
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            case 7: System.out.println("Sunday");
            break;
        }

    }
}
