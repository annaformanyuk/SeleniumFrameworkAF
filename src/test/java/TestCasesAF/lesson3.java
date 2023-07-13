package TestCasesAF;

import org.testng.annotations.Test;

@Test
public class lesson3 {
    public static void main(String[] args) {

        String username = "Anna";
        double price = 29.99;
        String location = "Kyiv";
        int age = 5;
        String productName = "cheese";
        System.out.println("Hello "+ username +"! We have a special offer in new opened store in "+ location +". You can buy "+ productName +" with age older 5 years using price "+ price +"$.");
    }
}
