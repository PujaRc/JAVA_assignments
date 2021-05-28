import java.util.Arrays;  
public class Prac5{
    public static void main(String[] args){
        String[] amino_acid = {"Glutamate", "Proline", "Serine", "Threonine", "Triptophan", "Tyrosine", "Alanine", "Arginine", "Asparagine", "Aspartate", "Cysteine", "Valine", "Glutamine", "Glycine", "Histidine", "Isoleucine", "Leucine", "Lycine", "Methionine", "Phenylalanine"};
        int n = amino_acid.length;
        Arrays.sort(amino_acid);
        for (int i = 0; i < n; i++){
            System.out.print(amino_acid[i] + " ");
        }
        
    }
}