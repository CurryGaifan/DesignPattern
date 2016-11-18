package pattern.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {

    private static Map<Character, FlyWeight> characterMap = new HashMap<>();


    public static FlyWeight getFlyWeight(char c) {
        FlyWeight flyWeight = characterMap.get(c);
        if (flyWeight != null)
            return flyWeight;

        flyWeight = new ConcreteFlyWeight(c);
        characterMap.put(c, flyWeight);
        return flyWeight;
    }
}
