package sreamPostmortem.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import sreamPostmortem.constant.Type;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Dish {

    private final String name;
    private final Boolean vegetarian;
    private final Integer calories;
    private final Type type;

}
