package designpattern.questions.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int []a = {4,5,6,1,2};
        System.out.println("Array before sort : " + Arrays.toString(a));
        mergeSort(a,0,a.length-1);
        System.out.println("Array after sort : " + Arrays.toString(a));
    }

    private static void mergeSort(int []a,int low,int high){
        if(low==high){
            return;
        }
        int mid = (low+high)/2;
        mergeSort(a,low,mid);
        mergeSort(a,mid+1,high);

        merge(a,low,mid,high);
    }

    private static void merge(int []a,int low,int mid,int high){
        List<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (a[left] <= a[right]) {
                list.add(a[left]);
                left++;
            }else{
                list.add(a[right]);
                right++;
            }
        }

        while(left<=mid){
            list.add(a[left]);
            left++;
        }

        while(right<=high){
            list.add(a[right]);
            right++;
        }

        for(int i=0;i<list.size();i++){
            a[low + i]=list.get(i);
//            System.out.println("a["+i+"] = "+a[i] + "list["+i+"]" + list.get(i));
        }
    }
}
