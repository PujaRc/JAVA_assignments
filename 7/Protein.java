class Protein {
    public int length;
    public String name;
    public String function;

    Protein(){
        length = 0;
        name = "Protprot";
        function = "undecided";
    }
}

class Prokaryote extends Protein{
    String organism_name;
    //final String organism_type = "Prokaryote";
    Prokaryote(){
        organism_name = "Staphylococcus aureus";
    }

}
class Eukaryote extends Protein{
    String organism_name;
    //final String organism_type = "Eukaryote";
    Eukaryote(){
        organism_name = "Mus musculus";
    }
}

class TestProEu{
    public static void main(String[] args) {
        Protein protein = new Protein();
        Prokaryote pro = new Prokaryote();
        Eukaryote eu = new Eukaryote();

        System.out.println("The default characteristics are: ");
        System.out.println("Name: " +protein.name);
        System.out.println("Length: "  +protein.length);
        System.out.println("Function: " +protein.function);

        System.out.println("The default members of prokaryotes are: ");
        System.out.println("Name: " +pro.name);
        System.out.println("Length: "  +pro.length);
        System.out.println("Function: " +pro.function);

        System.out.println("The default members of eukaryotes are: ");
        System.out.println("Name: " +eu.name);
        System.out.println("Length: "  +eu.length);
        System.out.println("Function: " +eu.function);

    }
}






