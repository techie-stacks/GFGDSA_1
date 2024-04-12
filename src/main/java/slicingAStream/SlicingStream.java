package slicingAStream;

import slicingAStream.utility.SlicingUtility;
import sreamPostmortem.constant.Type;
import sreamPostmortem.model.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SlicingStream {

    public static void main(String[] args) {

        List<Dish> specialMenu = Arrays. asList (
                new Dish("seasonal fruit", true, 120, Type.OTHER),
                new Dish ("prawns", false, 300, Type.FISH),
                new Dish ("rice", true, 350, Type. OTHER),
                new Dish ("chicken", false, 400, Type. MEAT),
                new Dish ("french fries", true, 530, Type.OTHER)) ;
           specialMenu.forEach(System.out::println);
           System.out.println("############ FILTER #################");
            List<Dish> sliceMenu1 = SlicingUtility.getDishUsingFilter(specialMenu);
                sliceMenu1.forEach(System.out::println);
        System.out.println("############ TAKE WHILE #################");
            List<Dish> sliceMenu2 = SlicingUtility.getDishUsingTakeWhile(specialMenu);
                 sliceMenu2.forEach(System.out::println);
        System.out.println("############# DROP-WHILE ################");
        List<Dish> sliceMenu3 = SlicingUtility.getDishUsingDropWhile(specialMenu);
        sliceMenu3.forEach(System.out::println);
        System.out.println("#############  LIMIT ################");
        List<Dish> sliceMenu4 = SlicingUtility.getDishUsingTruncatingLimit(specialMenu);
        sliceMenu4.forEach(System.out::println);
        System.out.println("#############  SKIP ################");
        List<Dish> sliceMenu5 = SlicingUtility.getDishUsingSkippingElementSkip(specialMenu);
        sliceMenu5.forEach(System.out::println);
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)// skip will discard first 2 numbers / elements
                .skip(2)
                .forEach(i -> System.out.print(i + " "));
        }
}
