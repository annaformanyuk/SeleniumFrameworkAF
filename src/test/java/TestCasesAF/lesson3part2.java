package TestCasesAF;

import org.testng.annotations.Test;

@Test
public class lesson3part2 {
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

