package java8features.genericpractice;


import java.util.List;

public class GenericExample {

//    1️⃣ Create a Generic Swap Method
    public static <T> void swap(T[] array, int i, int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

//    Write a method that returns the maximum element from a list.
    public static <T extends Comparable<T>> T max(List<T> list){
        if(list == null || list.isEmpty()){
            throw new IllegalArgumentException("List is null or empty");
        }
        T max = list.get(0);

        for(T element : list) if(element.compareTo(max) > 0) max = element;
        return max;
    }

    public static void main(String[] args) {
        String []arr = {"A","B","C"};
        swap(arr,0,1);

        for(String s : arr){
            System.out.print(s+" ");
        }

        Integer[] arr1 = {1,2,3};
        swap(arr1,0,1);
        for(Integer s : arr1){
            System.out.print(s+" ");
        }
    }
}
