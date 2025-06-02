import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer [] array = {1,2,3,4,5};

        DynamicArray dc = new DynamicArray(array);

        MyIterator iterator = (MyIterator) dc.iterator();
        dc.remove(2);

    }
}