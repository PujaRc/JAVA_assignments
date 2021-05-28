public class Prac3
{
    public static void main(String[] args){

        //printing a fibonacci

        long start = 0, next = 1, follow, n=50;

        System.out.print(start+" "+next);

        for (int i = 0; i < n; ++i){
            
            follow = start + next;

            System.out.print(" "+ follow);

            start = next;
            next = follow;
        }
    }
}