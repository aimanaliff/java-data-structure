package exercise3;

import java.util.Scanner;

public class Exercise3Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Day a = new Day();
        a.showDays();
        int num = sc.nextInt();
        System.out.println("The name of the day: " + a.currentDay(num));
        System.out.println("The following day of " + a.currentDay() + " is: " + a.nextDay());
        System.out.println(a.prevDay());
        a.daysToAdd();
        int num2 = sc.nextInt();
        a.newDay(num2);
    }
}

class Day {

    int top;
    String[] arr;
    int N = 7;//size of array

    public Day() {
        arr = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    }

    public void showDays() {
        System.out.println("Specify your day in number: ");
        int test = 1;
        for (int i = 0; i < 7; i++) {
            System.out.println(test + " for " + arr[i]);
            test++;
        }
    }

    public String currentDay(int num) {
        top = --num;
        return arr[top];
    }

    public String currentDay() {
        return arr[top];
    }

    public String nextDay() {
        int temp = (top + 1) % N;
        return arr[temp];
    }

    public String calculateNextDay() {
        int temp = (top + 1) % N;
        top++;
        return arr[temp];
    }

    public String prevDay() {
        int temp3 = (top + N - 1) % N;
        return "The previous day of " + arr[top] + " is: " + arr[temp3];
    }

    public void daysToAdd() {
        System.out.println("How many days to add to the specified/current day(" + arr[top] + ") ?");
    }

    public void newDay(int num) {
        System.out.println("The new day after the addition of " + num + " day(s) is: ");
        for (int i = 0; i < num-1; i++) {
            calculateNextDay();
        }
        System.out.println(calculateNextDay());
    }

}
