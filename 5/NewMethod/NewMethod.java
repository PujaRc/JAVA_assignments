import java.util.Scanner;

class NewMethod{
    public static void myName() {
        Scanner myObj1 = new Scanner(System.in);
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String getname = myObj1.nextLine();
        System.out.println("Enter the number of times your name prints: ");
        int getn = myObj2.nextInt();
        
        for (int i = 0; i < getn; i++){
            System.out.println(getname);
        }   
    }
    public static void main(String[] args) {
        myName();
    }
}

//OUTPUT

/* Enter your name:                                                                                                        
Puja Roychowdhury
Enter the number of times your name prints:             
5                                                                              
Puja Roychowdhury                                                                  
Puja Roychowdhury                                                                                 
Puja Roychowdhury                                                                
Puja Roychowdhury                                                             
Puja Roychowdhury */     