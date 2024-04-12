package norgan;

import java.sql.SQLOutput;

public class HackerRankMain {
    public static void main(String[] args) {
        String sistance = "Fifty";
        int speed = 5;
        try {
            int time = Integer.parseInt(sistance)/ speed;
            System.out.println("Time Required: " +time);
        }catch (Exception e){
            System.out.println("An Exception Occured");
        }
        finally {
            System.out.println("Ending the program");
        }
    }
}
