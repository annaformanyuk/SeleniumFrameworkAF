package TestCasesAF;

import org.testng.annotations.Test;

import java.util.Arrays;

public class lesson3part3 {

    @Test
    public void Task1(){
        int taxableincome = 480000;
        if (taxableincome >= 0 && taxableincome <= 10275){
            System.out.println("your tax will be 10%");
        } else if (taxableincome >= 10276 && taxableincome <= 41775) {
            System.out.println("your tax will be 12%");
        } else if (taxableincome >= 41776 && taxableincome <= 89075) {
            System.out.println("your tax will be 22%");
        } else {
            System.out.println("please call your CPA");
        }
    }

@Test
    public void Task2(){
        String department = "buying";
        switch (department){
            case "sales":
                System.out.println("Sales department works from 8am to 12pm.");
                break;
            case "operations":
                System.out.println("Operations department works from 9am to 7pm.");
                break;
            case "financial":
                System.out.println("Financial department works from 10am to 8pm.");
                break;
            case "IT":
                System.out.println("IT department works from 8am to 9pm.");
                break;
            case "marketing":
                System.out.println("Marketing department works from 8am to 10pm.");
                break;
            case "buying":
                System.out.println("Buying department works from 9am to 6pm.");
                break;
        }
    }

@Test
    public void Task3() {
    for (int hour = 0; hour < 24; hour++) {
        System.out.println(hour);
        hour++;

    }
}}

