import java.util.Scanner;
public class Student {
    public String Name;
    public String DepartmentName;
    public int id;
    public float marksobt;
    public String [] subjects = new String [6];
    public float tMarks;

    //setter getter methods
    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return Name;
    }
    public void setid(int id){
        this.id = id;
    }
    public void setDepartmentNameName(String DepartmentName){
        this.DepartmentName = DepartmentName;
    }
    public String getDepartmentName(){
        return DepartmentName;
    }
    public int getid(){
        return id;
    }
    public void setmarksobt(float marksobt){
        this.marksobt = marksobt;
    }
    public float getmarksobt(){
        return marksobt;
    }
    public void settMarks(float tMarks){
        this.tMarks = tMarks;
    }
    public float gettMarks(){
        return tMarks;
    }
    public void setSubjects(String [] subjects){
        this.subjects=subjects;
    }
    public String[] getSubjects(){
        return subjects;
    }

}
