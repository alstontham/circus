<<<<<<< HEAD:src/main/java/circus/stuff/Cannon.java
package circus.stuff;
=======
package circus;
>>>>>>> 29b6e6ca2eae3b16b7573e5ef8d8e0968213b294:src/main/java/circus/Cannon.java

public class Cannon extends Equipment {

    public Cannon(int purchasePrice) {
        super(purchasePrice);
    }

    @Override
    public int getValue() {
        return purchasePrice / 3;
    }
}
