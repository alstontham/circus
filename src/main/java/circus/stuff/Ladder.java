<<<<<<< HEAD:src/main/java/circus/stuff/Ladder.java
package circus.stuff;
=======
package circus;

import circus.Equipment;
>>>>>>> 29b6e6ca2eae3b16b7573e5ef8d8e0968213b294:src/main/java/circus/Ladder.java

public class Ladder extends Equipment {

    public Ladder(int purchasePrice) {
        super(purchasePrice);
    }

    @Override
    public int getValue() {
        return purchasePrice / 2;
    }
}
