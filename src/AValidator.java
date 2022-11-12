import java.util.List;
import java.util.Set;

public class AValidator {
    public static boolean isNumber(String input) {
        return input.chars()
            .allMatch(Character::isDigit);
    }

    public static boolean isValidNumber(List<Integer> playerNumber) {
        return isCorrectSize(playerNumber) && isInRange(playerNumber)
            && isNotDuplicated(playerNumber);
    }

    //i. 자릿수 체크
    public static boolean isCorrectSize(List<Integer> playerNumber) {
        return playerNumber.size() == DIGITS;
    }

    //ii. 숫자 범위 체크
    public static boolean isInRange(List<Integer> playerNumber) {
        return playerNumber.stream()
            .allMatch(v ->
                RANDOM_MIN <= v && v <= RANDOM_MAX);
    }

    // iii. 숫자 중복 체크
    public static boolean isNotDuplicated(List<Integer> playerNumber) {
        return Set.copyOf(playerNumber).size() == DIGITS;
    }

    public static boolean isValidCommandNumber(String input) {
        return input.equals(COMMAND_RESTART) || input.trim().equals(COMMAND_END);
    }
}
