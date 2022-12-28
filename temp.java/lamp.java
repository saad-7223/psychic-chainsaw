public class lamp {
    boolean lampOn = false;
    void toggleLamp(){
        lampOn = !lampOn;
    }
    boolean getstatus(){
        return lampOn;
    }
    void getReport(){
        if(getstatus()){
            System.out.println("The lamp is on");
        }else{
            System.out.println("The lamp is off");
        }
    }
    public static void main(String args[]){
        lamp l = new lamp();
        l.toggleLamp();
        l.getReport();
        l.toggleLamp();
        l.getReport();
    }
}
