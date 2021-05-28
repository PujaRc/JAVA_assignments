public class Prac2
{
    public static void main(String[] args){
        int maths = 98, physics = 91, chemistry = 68, C = 83, database = 80;
        double sum = 0.00, percentage;
        sum = maths + physics + chemistry + C + database;
        percentage = sum/5;

        //System.out.println(percentage);

        if (percentage > 50)
            System.out.println("Pass");

    }
}