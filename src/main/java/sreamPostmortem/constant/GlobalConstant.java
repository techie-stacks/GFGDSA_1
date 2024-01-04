package sreamPostmortem.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GlobalConstant {
    THREE_HUNDRED(300), FOUR_HUNDRED(400), maxSize(3),
    THREE_HUNDRED_20(320);
    private final Integer numbers;
}
