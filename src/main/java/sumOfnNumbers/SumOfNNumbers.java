package sumOfnNumbers;

public class SumOfNNumbers {


    /*
        * Approach -- 1
        * @parameter number n
        * In constant time : it will calculate the sum of numbers.
        *  cz it will execute only once whenever the method will got invoked
        * @return sum
     */
    public int function1(int n){
        int sum = n * (n + 1)/2;
        return sum;
    }

    public int function2(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++)
            sum = sum + i;
        return sum;
    }
}