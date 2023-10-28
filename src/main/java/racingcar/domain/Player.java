package racingcar.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Player {

    private static final String CAR_NAME_SEPARATOR = ",";

    private final String namesOfCars;

    public Player(String namesOfCars) {
        this.namesOfCars = namesOfCars;
    }

    public List<String> splitNamesOfCars() {
        return Arrays.stream(namesOfCars.split(CAR_NAME_SEPARATOR))
                .collect(Collectors.toList());
    }

    public void validateDuplicationName(List<String> namesOfCars) {
        int count = (int) namesOfCars.stream()
                .distinct()
                .count();

        if (count != namesOfCars.size()) {
            throw new IllegalArgumentException("중복");
        }
    }
}
