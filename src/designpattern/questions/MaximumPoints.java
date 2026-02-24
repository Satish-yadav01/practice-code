package designpattern.questions;

//Maximum points tou can obtain from the cards
public class MaximumPoints {
    public static void main(String[] args) {
        int []a = {6,2,3,4,7,2,1,7,1};
        int k=4;

        for(int i=0; i<=k-1; i++){
            int lSum=0,rSum=0,rIndex = a.length-1, maxSum=0;
            for(int x=0; x<=k-1; x++){
                lSum= lSum+a[x];
            }
            maxSum = lSum;

            for(int j = k-1; j>=0; j--){
                lSum= lSum-a[j];
                rSum= rSum+a[rIndex];
                rIndex= rIndex-1;
                maxSum= Math.max(maxSum,rSum);
            }
            System.out.println(maxSum);

        }

    }
}
