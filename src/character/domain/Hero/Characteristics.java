package character.domain.Hero;

import java.util.HashMap;

public class Characteristics {
    HashMap<CharacteristicType, Characteristic> characteristics;

    public Characteristics(HashMap<CharacteristicType, Characteristic> characteristics) {
        this.characteristics = characteristics;
    }

    public int getCharacteristicValue(CharacteristicType characteristicType) {
        return characteristics.get(characteristicType).getModifier();
    }
}
