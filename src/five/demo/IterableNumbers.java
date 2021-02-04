package five.demo;

import java.util.Collection;
import java.util.Iterator;

public class IterableNumbers implements Iterable<Number> {
    @Override
    public Iterator<Number> iterator() {
        return new NumberIterator();
    }

    private class NumberIterator implements Iterator<Number>{
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Number next() {
            return null;
        }
    }
}
