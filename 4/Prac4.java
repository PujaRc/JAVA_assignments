public class Prac4{
    public static void main(String[] args){
        double arr[] = {13.4, 7.9, 8.3, 2.3, 1.5, 0.2, 5.6, 4.7, 9.5, 10.8}, sum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++){
            sum += arr[i];
        }
        //System.out.println(sum);

        System.out.print("The average of the numbers: " + (sum/n));
    }
}