package hexlet.code;

import java.util.Random;

public class Utils {
    private static final int DEFAULT_MAX_RANDOM = 100;
    private static final Random RANDOM = new Random();

    public static int randomNum() {
        return RANDOM.nextInt(DEFAULT_MAX_RANDOM);

    }

    public static int randomNum(int minNum, int maxNum) {
        return RANDOM.nextInt(minNum, maxNum);

    }

}
