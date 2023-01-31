import java.util.Scanner;

public class Hw  {
    public static void main(String[] args) throws Exception {
        float grade;
        char letter = 'A';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a grade between 0 and 100");
        grade = scanner.nextFloat();
        while (grade < 0 || grade > 100) {
            System.out.println("Grade must be between 0 and 100. Please input again");
            grade = scanner.nextFloat();

        }
        scanner.close();

        if(grade >=0)
        letter = 'F';
          if(grade >= 60)
          letter -=2;
            if(grade >= 70)
            letter -=1;
             if (grade >= 80)
             letter -=1;
               if(grade >= 90)
               letter -=1;

        System.out.println("Grade = " + grade);
        System.out.println("Letter = " + letter);  
    }
}
