import java.util.Scanner;

class armstrong{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int tmp = n;
        int sum = 0;

        int num = 0;

        while (n!=0){
            num = n%10;
            num = num*num*num;
            sum += num;
            n /= 10;

        }
        //System.out.println(sum);
        
        if (sum == tmp)
            System.out.println("The number is an armstrong number.");
        else
            System.out.println("The number is not an armstrong number");
        
    }
}

