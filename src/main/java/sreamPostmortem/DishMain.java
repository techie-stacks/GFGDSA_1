package sreamPostmortem;

import sreamPostmortem.constant.Type;
import sreamPostmortem.model.Dish;
import sreamPostmortem.utility.Utility;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DishMain {

    public static void main(String[] args) {

      List<Dish> menuList = Arrays.asList(new Dish("pork", false, 800, Type.MEAT), new Dish("beef", false, 700, Type.MEAT), new Dish("chicken", false, 400, Type.MEAT), new Dish("french fries", true, 530, Type.OTHER), new Dish("rice", true, 350, Type.OTHER), new Dish("season fruit", true, 120, Type.OTHER), new Dish("pizza", true, 550, Type.OTHER), new Dish("prawns", false, 300, Type.FISH), new Dish("salmon", false, 450, Type.FISH));
      System.out.println("##### Printing dish name who has greater than 400 calories ###### ");
        List<String> dishNames = Utility.getDishNameWhoHasMoreThan400Calories(menuList);
        System.out.println(" Printing dish name who has greater than 400 calories :  " + dishNames);
        System.out.println("##### Got the dish names ###### ");
        // ############################################################################################
        System.out.println("##### Printing dish name who has highest 3 calories ###### ");
        List<String> threeHighCaloricDishName = Utility.getThreeHighCaloricDishName(menuList);
        System.out.println(" Printing  getThreeHighCaloricDishNames :  " + threeHighCaloricDishName);


        System.out.println("##### Debugging Streams : ###### ");
        List<String> menus = Utility.debuggingStreamOperations(menuList);
        System.out.println(menus);
        System.out.println("##### Got the threeHighCaloricDishName  ###### ");

        // ############################################################################################
        Stream<String> list =  threeHighCaloricDishName.stream();
        list.forEach(System.out::println);
        //list.forEach(System.out::println);




        // here we will get Exception in thread "main" java.lang.IllegalStateException:stream has already been operated upon or closed
       // at java.base/java.util.stream.AbstractPipeline.sourceStageSpliterator(AbstractPipeline.java:279)
       // at java.base/java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:762)
       // at sreamPostmortem.DishMain.main(DishMain.java:28)
        /*  We can consume stream only once  */

      List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Type.MEAT), new Dish("beef", false, 700, Type.MEAT), new Dish("chicken", false, 400, Type.MEAT), new Dish("french fries", true, 530, Type.OTHER), new Dish("rice", true, 350, Type.OTHER), new Dish("season fruit", true, 120, Type.OTHER), new Dish("pizza", true, 550, Type.OTHER), new Dish("prawns", false, 300, Type.FISH), new Dish("salmon", false, 450, Type.FISH)
              ,new Dish("pork", false, 800, Type.MEAT), new Dish("beef", false, 700, Type.MEAT), new Dish("chicken", false, 400, Type.MEAT), new Dish("french fries", true, 530, Type.OTHER), new Dish("rice", true, 350, Type.OTHER), new Dish("season fruit", true, 120, Type.OTHER), new Dish("pizza", true, 550, Type.OTHER), new Dish("prawns", false, 300, Type.FISH), new Dish("salmon", false, 450, Type.FISH)
              ,new Dish("pork", false, 800, Type.MEAT), new Dish("beef", false, 700, Type.MEAT), new Dish("chicken", false, 400, Type.MEAT), new Dish("french fries", true, 530, Type.OTHER), new Dish("rice", true, 350, Type.OTHER), new Dish("season fruit", true, 120, Type.OTHER), new Dish("pizza", true, 550, Type.OTHER), new Dish("prawns", false, 300, Type.FISH), new Dish("salmon", false, 450, Type.FISH)
              ,new Dish("pork", false, 800, Type.MEAT), new Dish("beef", false, 700, Type.MEAT), new Dish("chicken", false, 400, Type.MEAT), new Dish("french fries", true, 530, Type.OTHER), new Dish("rice", true, 350, Type.OTHER), new Dish("season fruit", true, 120, Type.OTHER), new Dish("pizza", true, 550, Type.OTHER), new Dish("prawns", false, 300, Type.FISH), new Dish("salmon", false, 450, Type.FISH)
              ,new Dish("pork", false, 800, Type.MEAT), new Dish("beef", false, 700, Type.MEAT), new Dish("chicken", false, 400, Type.MEAT), new Dish("french fries", true, 530, Type.OTHER), new Dish("rice", true, 350, Type.OTHER), new Dish("season fruit", true, 120, Type.OTHER), new Dish("pizza", true, 550, Type.OTHER), new Dish("prawns", false, 300, Type.FISH), new Dish("salmon", false, 450, Type.FISH));

      System.out.println("##### Calculating time for External-Iteration ###### ");
      final long startTime = System.nanoTime();
      List<String> externalIteration = Utility.comparingExternalIterationWithForEach(menu);
      final long duration = System.nanoTime() - startTime;
      System.out.println("Time in nano millisecond " + duration);
      System.out.println("##### Data of External-Iteration ###### " + externalIteration);


      System.out.println("##### Calculating time for Internal-Iteration ###### ");
      final long startTime1 = System.nanoTime();
      List<String> InternalIteration = Utility.comparingInternalIterationWithStream(menu);
      final long duration1 = System.nanoTime() - startTime1;
      System.out.println("Time in nano millisecond " + duration1);
      System.out.println("##### Data of Internal-Iteration ###### " + InternalIteration);


      // ############################################################################################
    }

}
