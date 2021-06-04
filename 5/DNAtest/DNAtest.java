import java.util.Scanner;

class DNAtest{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter first DNA sequence: ");
        String DNAseq1 = obj.nextLine();
        
        System.out.println("Enter second DNA sequence: ");
        String DNAseq2 = obj.nextLine();

        System.out.println("First sequence: " +DNAseq1);
        System.out.println("Second sequence: " +DNAseq2);

        int len1 = DNAseq1.length(), len2 = DNAseq2.length();

        if (DNAseq1 == DNAseq2)
            System.out.println("The sequences are same");
        else 
            System.out.println("The sequences are different");
        

        System.out.println("The length of the first sequence is: " +len1);
        System.out.println("The length of the second sequence is: " +len2);
    }
}

//OUTPUT

/*Enter first DNA sequence: 
 aaattttcccggggg  
 Enter second DNA sequence: 
 aaaaattttttcccggggg        
 
 First sequence: aaattttcccggggg 
 Second sequence: aaaaattttttcccggggg    
 
 The sequences are different    
 
 The length of the first sequence is: 15      
 
 The length of the second sequence is: 19 */