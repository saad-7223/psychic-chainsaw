public class t2 {
    public static void main(String []args){
        Student s1 = new Student("rajath","R21EH111");
        Student s2 = new Student("saleem","R21EH001");
        s1.display();
        s2.display();
    }
    
}
class Student{
    String name;
    String srn;
    static String uni = "Reva";
    Student(String n,String s){
        name = n;
        srn = s; 
    }
    public void display(){
        System.out.println("Student name : "+name);
        System.out.println("Student srn : "+srn);
        System.out.println("University : "+uni);
        System.out.println();
    }
}