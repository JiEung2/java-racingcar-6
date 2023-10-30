package racingcar.domain;

import static racingcar.utils.Constants.MAX_STRENGTH;
import static racingcar.utils.Constants.MIN_STRENGTH;

import camp.nextstep.edu.missionutils.Randoms;

public class Driver {
    public static int pressAccelerator() {
        int pressStrength = Randoms.pickNumberInRange(MIN_STRENGTH, MAX_STRENGTH);
        return pressStrength;
    }
}
