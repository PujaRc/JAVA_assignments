import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Locale;
import java.util.Scanner;

public class Amino_acid {
    //method for obtaining length, molecular weight and percentage of aromatic amino acids

    static String pepinfo(String aa){

        aa = aa.toUpperCase(Locale.ROOT);
        int len_aa = aa.length();
        double weight = 0.0;
        char[] amino_acids = {'A', 'R', 'N', 'D', 'C', 'E', 'Q', 'G', 'H', 'I', 'L', 'K', 'M', 'F', 'P', 'S', 'T', 'W', 'Y', 'V'};
        double[] molW = {89.1, 174.2, 132.1, 133.1, 121.2, 147.1, 146.2, 75.1, 155.2, 131.2, 131.2, 146.2, 149.2, 165.2, 115.1, 105.1, 119.1, 204.2, 181.2, 117.1};
        int N = amino_acids.length;

        //obtaining molecular weight

        for (int i = 0; i < len_aa; i++){
            for (int j = 0; j < N; j++){
                if (amino_acids[j] == aa.charAt(i)) {
                    weight += molW[j];
                    //System.out.println(weight);
                    break;

                }
            }
        }
        int aro_count = 0;

        for (int i = 0; i < len_aa; i++) {
            if ((aa.charAt(i) == 'F') || (aa.charAt(i) == 'Y') || (aa.charAt(i) == 'W')) {
                aro_count += 1;
            }
        }
        float total_count = (float)aro_count/(float)len_aa;
        float percent_aro = total_count*100;

        String output_txt = "The percentage of aromatic amino_acids is: " +percent_aro;

        output_txt += "\n" + "The length of the sequence entered is: " +len_aa;

        output_txt += "\n" + "The molecular weight of the given sequence is: " +weight;

        //System.out.println("The percentage of aromatic amino_acids is: " +percent_aro);

        //System.out.println("The length of the sequence entered is: " +len_aa);

        //System.out.println("The molecular weight of the given sequence is: " +weight);

        return output_txt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sequence: ");
        String aa = sc.nextLine();
        String output_txt = pepinfo(aa);

        try{
            FileWriter writer = new FileWriter("C:\\Users\\yjpuj\\Sample\\output.txt");
            BufferedWriter buffer = new BufferedWriter(writer);
            buffer.write(output_txt);
            buffer.close();
        }catch(Exception e){System.out.println(e);}
        System.out.println("Success!");
    }


}

