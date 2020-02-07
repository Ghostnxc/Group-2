package chapter2project;
import java.util.Scanner;

public class Chapter2Project {
    public static void main(String[] args) {
        System.out.println("Mike Commit");
        String name;
        int age;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please enter your name >> ");
        name = inputDevice.nextLine();
        System.out.println("Please enter your age >> ");
        age = inputDevice.nextInt();
        System.out.println("Your name is " + name + " and your age is " + age + " years old.");
        System.out.println("hey its nate");
    }
}