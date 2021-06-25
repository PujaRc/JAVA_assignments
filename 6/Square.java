class Square{
    public int side;
    Square(int s){
        side = s;
    }
}
class Cube extends Square{
    Cube(int s){
        super(s);
    }
    public void volume() {
        System.out.println(side*side*side);   
    }
    
}
class TestCube{
    public static void main(String[] args) {
        Cube obj = new Cube(5);
        obj.volume();
        
    }
}