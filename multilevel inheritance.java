class a{
void show(){
    System.out.println("this is first class");
}
}
class b extends a{
    void display(){
        System.out.println("this is seonds class");
    }
}
class c extends b{
    void Print(){
        System.out.println("this is third class");
    } 
}
class Main{
    public static void main(String[] args) {
        c obj= new c();
        obj.show();
        obj.display();
        obj.Print();
    }

}