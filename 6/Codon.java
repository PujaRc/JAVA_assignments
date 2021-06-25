package genetics;

import java.util.Scanner;

public class Codon{

    static void AAtoCodon(String aminoacid){

        switch(aminoacid){
            case "alanine":
                System.out.println("The codons are: GCT, GCC, GCA, GCG");
                break;
            case "cysteine":
                System.out.println("The codons are: TGT, TGC");
                break;
            case "aspartic_acid":
                System.out.println("The codons are: GAT,, GAC");
                break;
            case "glutamic_acid":
                System.out.println("The codons are: GAA, GAG");
                break;
            case "phenylalanine":
                System.out.println("The codons are: TTT, TTC");
                break;
            case "glycine":
                System.out.println("The codons are: GGT, GGC, GGA, GGG");
                break;
            case "histidine":
                System.out.println("The codons are: CAT, CAC");
                break;
            case "isoleucine":
                System.out.println("The codons are: ATT, ATC, ATA");
                break;
            case "lysine":
                System.out.println("The codons are: AAA, AAG");
                break;
            case "leucine":
                System.out.println("The codons are: CTT, CTC, CTA, CTG, TTA, TTG");
                break;
            case "methionine":
                System.out.println("The codon is: ATG");
                break;
            case "asparagine":
                System.out.println("The codons are: AAT, AAC");
                break;
            case "glutamine":
                System.out.println("The codons are: CAA, CAG");
                break;
            case "arginine":
                System.out.println("The codons are: CGT, CGC, CGA, CGG, AGA, AGG");
                break;
            case "serine":
                System.out.println("The codons are: TCT, TCC, TCA, TCG, AGT, AGC");
                break;
            case "threonine":
                System.out.println("The codons are: ACT, ACC, ACA, ACG");
                break;
            case "valine":
                System.out.println("The codons are: GTT, GTC, GTA, GTG");
                break;
            case "tryptophan":
                System.out.println("The codon is: TGG");
                break;
            case "tyrosine":
                System.out.println("The codons are: TAT, TAC");
                break;
            case "proline":
                System.out.println("The codons are: CCT, CCC, CCA, CCG");
                break;

            default:
                System.out.println("Choose from here: ");
                System.out.println("Alanine:       GCT, GCC, GCA, GCG");
                System.out.println("Arginine:      CGT, CGC, CGA, CGG, AGA, AGG");
                System.out.println("Asparagine:    AAT, AAC");
                System.out.println("Aspartic acid: GAT, GAC");
                System.out.println("Cystine:       TGT, TGC");
                System.out.println("Glutamic acid: GAA, GAG");
                System.out.println("Glutamine:     CAA, CAG");
                System.out.println("Glycine:       GGT, GGC, GGA, GGG");
                System.out.println("Histidine:     CAT, CAC");
                System.out.println("Iso-leucine:   ATT, ATC, ATA");
                System.out.println("Leucine:       CTT, CTC, CTA, CTG, TTA, TTG");
                System.out.println("Lysine:        AAA, AAG");
                System.out.println("Methionine:    ATG");
                System.out.println("Phenylalanine: TTT, TTC");
                System.out.println("Proline:       CCT, CCC, CCA, CCG");
                System.out.println("Serine:        TCT, TCC, TCA, TCG, AGT, AGC");
                System.out.println("Threonine:     ACT, ACC, ACA, ACG");
                System.out.println("Tryptophan:    TGG");
                System.out.println("Tyrosine:      TAT, TAC");
                System.out.println("Valine:        GTT, GTC, GTA, GTG");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amino acid: ");
        String aa = sc.nextLine();

        AAtoCodon(aa);
    }
}