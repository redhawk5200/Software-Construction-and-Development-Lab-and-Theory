public class Teacher {
    public String Name;
    public String Institute;
    public int age;

    //mutators and accessors
    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return Name;
    }
    public void setage(int age){
        this.age = age;
    }
    public void setInstitute(String Institute){this.Institute = Institute;}
    public String getInstitute(){
        return Institute;
    }
    public int getAge(){return age;}
}
