import java.util.Scanner;

class CaseChange{
    public static void toggle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = sc.nextLine();
        int n = word.length();
        for (int i = 0; i < n; i++ ){
            if (word.charAt(i) <= 90 && word.charAt(i) >= 65)
            System.out.print((char)(word.charAt(i)+32));
        else if (word.charAt(i) <= 122 && word.charAt(i) >= 97)
            System.out.print((char)(word.charAt(i)-32));
        else
            System.out.println(word.charAt(i));

        }
        System.out.println("\n"+word);
    }
    public static void main(String[] args) {
        toggle();
    }
}