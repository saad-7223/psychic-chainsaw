public class test {
    public static void main(String []args){
        car c1 = new car("blue","7/11/2014","KA07QM4248","Scross");
        car c2 = new car("red","7/11/1977","KA01MN1693","Maruti700");
        //System.out.println(c1);
        c1.display();
        c2.display();
    }
}
class car{
    String colour;
    String m_date;
    String v_no;
    String model;
    car (String c,String m,String v,String mo){
        colour = c;
        m_date = m;
        v_no = v;
        model = mo;
    }
    void display(){
        System.out.println("car colour : "+colour);
        System.out.println("Manufacturing date : "+m_date);
        System.out.println("Vehicle number : "+v_no);
        System.out.println("Model : "+model);
        System.out.println();
    }
}
