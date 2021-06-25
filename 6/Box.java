import java.util.Scanner;

class Box{

    int width = 10;
    int height = 10;
    int depth = 10;

    int volume(){
        return (width*height*depth);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        Box mybox = new Box();

        System.out.println("Would you like to choose default values? Yes/No");
        String answer = sc1.nextLine();

        System.out.println(answer.length());


        if (answer.equals("No"))
        {
            System.out.println("Enter new values:");
            System.out.print("width = ");
            mybox.width = sc.nextInt();
            System.out.print("height = ");
            mybox.height = sc.nextInt();
            System.out.print("depth = ");
            mybox.depth = sc.nextInt();

            System.out.println("The required volume is: " + mybox.volume());
        }
        else {
            System.out.println("The volume of the box is " + mybox.volume());
            System.out.println("The default values are: ");
            System.out.println("width = " + mybox.width);
            System.out.println("height = " + mybox.height);
            System.out.println("depth = " + mybox.depth);
            System.out.println("The default volume is: " + mybox.volume());
        }   
    }
}