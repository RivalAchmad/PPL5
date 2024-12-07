public class DiscountCalculator {

    public static double calculateDiscount(int age, boolean isMember, double purchaseAmount) {
        double discount = 0.0;

        if (age < 18) { 
            discount = purchaseAmount * 0.1;
        } else if (age >= 60) {
            discount = purchaseAmount * 0.15;
        }

        if (isMember) { 
            discount += purchaseAmount * 0.05; 
        }

        if (purchaseAmount > 100) { 
            discount += 10;
        }

        return Math.min(discount, purchaseAmount); 
    }

    public static void main(String[] args) {
        System.out.println("Test Case 1: " + calculateDiscount(15, false, 50));  
        System.out.println("Test Case 2: " + calculateDiscount(65, true, 120));  
        System.out.println("Test Case 3: " + calculateDiscount(30, true, 80));   
        System.out.println("Test Case 4: " + calculateDiscount(17, true, 150));  
        System.out.println("Test Case 5: " + calculateDiscount(70, false, 90));  
        System.out.println("Test Case 6: " + calculateDiscount(40, false, 110));
        System.out.println("Test Case 7: " + calculateDiscount(20, false, 70));
    }
}
