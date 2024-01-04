package slicingAStream;

import slicingAStream.utility.SlicingUtility;
import sreamPostmortem.constant.GlobalConstant;
import sreamPostmortem.constant.Type;
import sreamPostmortem.model.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SlicingStream {

    public static void main(String[] args) {

        List<Dish> specialMenu = Arrays. asList (
                new Dish("seasonal fruit", true, 120, Type.OTHER),
                new Dish ("prawns", false, 300, Type.FISH),
                new Dish ("rice", true, 350, Type. OTHER),
                new Dish ("chicken", false, 400, Type. MEAT),
                new Dish ("french fries", true, 530, Type.OTHER)) ;

            List<Dish> sliceMenu1 = SlicingUtility.getDishUsingFilter(specialMenu);
                sliceMenu1.forEach(System.out::println);
        System.out.println("#############################");
            List<Dish> sliceMenu2 = SlicingUtility.getDishUsingTakeWhile(specialMenu);
                 sliceMenu2.forEach(System.out::println);
        System.out.println("#############################");
            List<Dish> sliceMenu3 = SlicingUtility.getDishUsingDropWhile(specialMenu);
                sliceMenu3.forEach(System.out::println);
        }
}
