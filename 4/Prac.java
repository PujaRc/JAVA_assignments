public class Prac
{
    public static void main(String[] args) {

        //names and molecular weights of amino acids

        String[] amino_acid = {"Alanine", "Arginine", "Asparagine", "Aspartate", "Cysteine", "Glutamate", "Glutamine", "Glycine", "Histidine", "Isoleucine", "Leucine", "Lycine", "Methionine", "Phenylalanine", "Proline", "Serine", "Threonine", "Triptophan", "Tyrosine", "Valine"};
        double molW[] = {89.1, 174.2, 132.1, 133.1, 121.2, 147.1, 146.2, 75.1, 155.2, 131.2, 131.2, 146.2, 149.2, 165.2, 115.1, 105.1, 119.1, 204.2, 181.2, 117.1};
        int N = amino_acid.length;
        System.out.println(N);
        for (int i = 0; i < N; i++){
            
            System.out.println(amino_acid[i] +": " + molW[i]);
        }   
    }
}