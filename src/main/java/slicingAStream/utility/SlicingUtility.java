package slicingAStream.utility;

import sreamPostmortem.constant.GlobalConstant;
import sreamPostmortem.model.Dish;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SlicingUtility {


    /*
    * The downside of filter operation is it will iterate through whole
    * stream and the predicate is applied to each element !!!!
    *
    * Instead of filter we can stop the iteration,
    * if we found calories less than 320 using @takeWhile(),
    * With a small list this may not seems like a huge benefit ,
    *  but it can become useful if you work with potentially large stream of elements
    *
    * @takeWhile here rescue for us , It lets you slice any stream using a predicate !!!
    *
    * */

    public static List<Dish> getDishUsingFilter(List<Dish> specialMenu){
        if(!specialMenu.isEmpty()){
           return specialMenu.stream().filter(dish -> dish.getCalories() < GlobalConstant.THREE_HUNDRED_20.getNumbers())
                   .collect(Collectors.toList());
        }
        return new ArrayList<>();
    }

    public static List<Dish> getDishUsingTakeWhile(List<Dish> dish){
        if(!dish.isEmpty()){
            return dish.stream().takeWhile(dishes -> dishes.getCalories() < GlobalConstant.THREE_HUNDRED_20.getNumbers())
                    .collect(Collectors.toList());
        }
        return new ArrayList<>();
    }

    /*
    * dropWhile is the complement of takeWhile()
    * It throws away the element at the start where the predicate is false
    * Once the predicate evaluates to true it stop and return all the remaining elements ,
    * and it even work if there are infinite number of remaining elements
    * */

    public static List<Dish> getDishUsingDropWhile(List<Dish> dishes){
        if(!dishes.isEmpty()){
            return dishes.stream()
                    .dropWhile(dish -> dish.getCalories() < GlobalConstant.THREE_HUNDRED_20.getNumbers())
                    .collect(Collectors.toList());
        }
        return new ArrayList<>();
    }


}
