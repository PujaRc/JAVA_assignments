class ExceptionHandling{
    public static void main(String[] args) {
        try {
            int data = 20/0;
        } catch (Exception e) {
            System.out.println("Invalid expression");
        }
        System.out.println("Finish");
        
    }

}