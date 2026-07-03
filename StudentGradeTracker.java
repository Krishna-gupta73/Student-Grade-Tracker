import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> grades = new ArrayList<Integer>();

        System.out.print("How many students? ");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter name: ");
            String name = input.nextLine();

            System.out.print("Enter grade: ");
            int grade = input.nextInt();
            input.nextLine();

            names.add(name);
            grades.add(grade);
        }

        int total = 0;
        int highest = grades.get(0);
        int lowest = grades.get(0);

        for (int i = 0; i < grades.size(); i++) {

            total = total + grades.get(i);

            if (grades.get(i) > highest) {
                highest = grades.get(i);
            }

            if (grades.get(i) < lowest) {
                lowest = grades.get(i);
            }
        }

        double average = (double) total / grades.size();

        System.out.println("\n----- Student Report -----");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " - " + grades.get(i));
        }

        System.out.println("--------------------------");
        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);

        input.close();
    }
}