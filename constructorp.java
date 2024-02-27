class student{
  int id;
  String name;
  student(int i,String n){
    id=i;
    name=n;
  }
  void display(){
    System.out.println("id= "+" "+id+"name ="+" "+name);
  }
  public static void main(String[] args) {
    student s= new student(2,"aarushi");
    //student s1=new student();
    s.display();
  }
}