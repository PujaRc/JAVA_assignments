import java.util.Scanner;

class str_reverse{
    public static void reverso(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        str = str.toLowerCase();

        int len = str.length();

        for (int i = (len-1); i >= 0; i--){
            System.out.print(str.charAt(i));
        }


    }

    public static void main(String[] args) {
        reverso();
        
    }
}