public class Sample
{
	public static void main(String[] args) {

		//declarations and initializations

		String DNA = "A TCG  CGTA  TGCAATGCTGCTCG  AAAA GCGCGATGC", pat = "TGC", DNA_C;
		char[] dna = {'a', 't', 'c', 'g', 'g', 'a', 't', 'c', 'g', 'g', 'a', 't', 'c', 'g', 'g', 'a', 't', 'c', 'g', 'g'};
		int N = DNA.length(), n = pat.length(), count = 0, count_gap = 0, sum, A = 0, G = 0, C = 0, T = 0, L = 20;
		float fa, fc, ft, fg, percentage;

		//pattern count in a hard-coded DNA string

		for (int i = 0; i <= (N-n); i++)
		{
		    if (DNA.substring(i,i+n).equals(pat))
		        count += 1;
		}
		
		System.out.println(count);

		System.out.println("\n");

	//gap count in a hard-coded DNA string

		for (int i = 0; i < N; i++){
			if (DNA.charAt(i) == ' ')
				count_gap += 1;
		}

		System.out.println(count_gap);

		System.out.println("\n");

		/*bug = if you insert gap between the pattern that you want to count in the previous code, then it won't be able to count the pattern. However, for real,
		 if a gap exists in between a potential patten then that segment of sequence cannot be taken as a pattern*/

		//finding complementary sequence in a hard-coded DNA string

		 DNA_C =  DNA;

		 DNA_C = DNA_C.replace('A', 'a');
		 DNA_C = DNA_C.replace('T', 'A');
		 DNA_C = DNA_C.replace('a', 'T');
		 DNA_C = DNA_C.replace('G', 'g');
		 DNA_C = DNA_C.replace('C', 'G');
		 DNA_C = DNA_C.replace('g', 'C');

		 System.out.println("DNA sequence: " + DNA);
		 System.out.println("COMPLEMENTARY sequence: " + DNA_C);
		 System.out.println("\n");

		 //computing the GC percentage

		for (int i = 0; i < L; i++){
			if (dna[i] == 'a')
				A += 1;
			else if (dna[i] == 'c')
				C += 1;
			else if (dna[i] == 'g')
				G += 1;
			else
				T += 1;
		}

		 fa = ((float)A/L)*100;
		 fc = ((float)C/L)*100;
		 ft = ((float)T/L)*100;
		 fg = ((float)G/L)*100;

		 System.out.println("The percentage of a is: " +fa);
		 System.out.println("The percentage of c is: " +fc);
		 System.out.println("The percentage of t is: " +ft);
		 System.out.println("The percentage of g is: " +fg);
		 System.out.println("\n");

		 //calculating the GC percentage

		G = 0;
		C = 0;
		for (int i = 0; i < L; i++){
			if (dna[i] == 'c')
				C += 1;
			else if (dna[i] == 'g')
				G += 1;
			else 
				System.out.println("");
		}

		//System.out.println("G: " +count_g);
		//System.out.println("C: " +count_c);

		sum = C + G;
		//System.out.println("sum: " +sum);
		percentage = ((float)sum/L)*100;
		System.out.println("The GC percentage is: " +percentage);
		
		//bug = i don't have a better statement for else when the counter encounters a gap, a or t
		//re-initialize count_g, otherwise it will store the value from the previous count and add up
		//facing float value iaccuracy
	}
}	
