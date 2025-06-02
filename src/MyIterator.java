import java.util.Arrays;
import java.util.Iterator;

public class MyIterator implements Iterator<Integer> {
        private final Integer[] array;
        private int index = 0;

        public MyIterator(Integer[] array) {
            this.array = array;
        }

        @Override
        public boolean hasNext() {
            return index < array.length;
        }


        @Override
        public Integer next() {
            return array[index++];
        }
    }

