//package airport;


public class Plane {

    private String status;

    public void land(){
        this.status = "Plane has landed";
    }

    public void takeoff(){
        this.status = "Plane has taken off";
    }

    public String getStatus() {
        return this.status;
//        System.out.println(this.status);
    }
}
