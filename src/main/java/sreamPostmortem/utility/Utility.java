package sreamPostmortem.utility;

import sreamPostmortem.constant.GlobalConstant;
import sreamPostmortem.model.Dish;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Utility {

    /*
    get 3 highCalories dish name
     */
    public static List<String> getThreeHighCaloricDishName(List<Dish> menu) {
        if (!menu.isEmpty()) {
            return menu.stream().filter(dish -> dish.getCalories() > GlobalConstant.THREE_HUNDRED.getNumbers())
                    .map(Dish::getName)
                    .limit(GlobalConstant.maxSize.getNumbers())
                    .collect(Collectors.toList());
        }
        return new ArrayList<>();
    }

    public static List<String> getDishNameWhoHasMoreThan400Calories(List<Dish> menu) {
        if (!menu.isEmpty()) {
            return menu.stream().filter(dish -> dish.getCalories() > GlobalConstant.FOUR_HUNDRED.getNumbers())
                    .sorted(Comparator.comparing(Dish::getName))
                    .map(Dish::getName)
                    .collect(Collectors.toList());
        }
        return new ArrayList<>();
    }

    public static List<String> debuggingStreamOperations(List<Dish> menu) {
        if (!menu.isEmpty()) {
           return menu.stream()
                   .filter( dish -> {
                       System.out.println("Filtering : " + dish.getName());
                       return dish.getCalories() > GlobalConstant.THREE_HUNDRED.getNumbers() ;
                   })
                   .map(dish -> {
                       System.out.println("mapping : " + dish.getName());
                       return dish.getName();
                   }).limit(3)
                   .collect(Collectors.toList());

        }
        return new ArrayList<>();
    }

    public static List<String> comparingInternalIterationWithStream(List<Dish> menuList){
        return menuList.stream().map(Dish::getName).collect(Collectors.toList());
    }

    public static List<String> comparingExternalIterationWithForEach(List<Dish> menuList){
        List<String> list = new ArrayList<>();
        for(Dish dish : menuList){
            list.add(dish.getName());
        }
        return  list;
    }
}
