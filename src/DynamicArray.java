import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class DynamicArray implements Iterable<Integer> {
    private Integer[] array;

    public DynamicArray(Integer[] array) {
        this.array = array;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator(array);
    }

    public void add(Integer number) {
        Integer[] newArray = new Integer[array.length + 1];
        int counter = 0;

        while (iterator().hasNext()){
           Integer temp = iterator().next();
           newArray[counter] = temp;
           counter ++;
        }
        newArray[newArray.length - 1] = number;
        array=newArray;
    }


    public void remove(int number) {
        Integer[] newArray = new Integer[array.length - 1];
        int cont = 0;

        while (iterator().hasNext()){
            Integer temp = iterator().next();
            if(number != temp) {
                newArray[cont] = temp;
                cont++;
            }
        }
        array=newArray;

    }

    public String printList() {
        String temp = " ";
        for (int i = 0; i < array.length; i++) {
            temp += "\n" + array[i];
        }
        return temp;
    }


}

