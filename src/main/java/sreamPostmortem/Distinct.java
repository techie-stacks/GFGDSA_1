package sreamPostmortem;

import java.util.Arrays;
import java.util.List;

public class Distinct {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1,2,1,3,3,4,2);
        integers.stream().filter(num -> num % 2 == 0).distinct()
                .forEach(System.out::println);


    }
}
