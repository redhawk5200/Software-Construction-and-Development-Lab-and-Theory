
class person{


    private String name;
    private String occupation;

    person(String occupation){

        this.occupation=occupation;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }


    //method

    void draw(){

        System.out.println("A person can draw in many ways");
    }

}

class artist extends person{

    artist(String occupation) {
        super(occupation);

    }

    void draw(){

        System.out.println("An artist can draw with a paint brush");
    }
}

class gunman extends person{

    gunman(String occupation) {
        super(occupation);

    }

    void draw(){

        System.out.println("A gunman draws a gun to shoot");
    }

}

public class Task4 {

    public static void main(String[] args) {
        artist a = new artist("artish");
        gunman g = new gunman("gunman");

        a.draw();
        g.draw();

    }

}

