<<<<<<< HEAD:src/main/java/circus/stuff/Equipment.java
package circus.stuff;
=======
package circus;
>>>>>>> 29b6e6ca2eae3b16b7573e5ef8d8e0968213b294:src/main/java/circus/Equipment.java

import circus.Asset;

public abstract class Equipment implements Asset {
    protected int purchasePrice;

    public Equipment(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getValue() {
        return purchasePrice;
    }
}
