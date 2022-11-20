import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    private final int min;
    private final int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public Integer Iterable() {
        int diff = max - min;
        Random rn = new Random();
        int randomNum = 0;
        if (diff > 0) {
            randomNum = rn.nextInt((diff + 1) + min);
        } else {
            System.out.println("Incorrect Values");
            return null;
        }
        return randomNum;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return Iterable();
            }
        };
    }
}