 import java.lang.Math;
class Suffle{
    public static void Sufflethearray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int index=i+ (int)(Math.random()*(n-i));
            int temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        Sufflethearray(arr);
        System.out.println("The Suffled Array is as Follows");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}