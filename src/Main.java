import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[]nums = {75,68,-65,98,67,-92,-35,74,9,-19,65,-73,97,38,-67};
        boolean numer = false;
        double money = 0;
        double numbers = 0;
         for (double number : nums){
             if (number < 0){
                 numer = true;
               }else {
                 if (numer){
                     money += number;
                     numbers++;
                 }
             }
             System.out.println(money / numbers);
             System.out.println(Arrays.toString(nums));

        }
    }
}