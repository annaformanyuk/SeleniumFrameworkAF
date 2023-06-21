package TestCasesAF;

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

class lesson3_2 {
    public static void main(String[] args) {

        int firstmonth = 13;
        int secondmonth = 20;
        int thirdmonth = 9;
        int total = firstmonth + secondmonth + thirdmonth;
        int fee = 10;
        int quantity = 3;

        System.out.println(firstmonth + secondmonth + thirdmonth);
        System.out.println((firstmonth + secondmonth + thirdmonth)/3);
        System.out.println(total - fee);
        System.out.println((firstmonth + secondmonth + thirdmonth) - (quantity * fee));
    }
}
