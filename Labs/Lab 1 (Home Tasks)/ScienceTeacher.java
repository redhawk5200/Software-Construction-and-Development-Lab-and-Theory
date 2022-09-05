public class ScienceTeacher extends  Teacher{
    public String Field;
    public String CourseName;
    public String Designation;

    public void setField(String Field){
        this.Field = Field;
    }
    public String getField(){
        return Field;
    }

    //mutators and accessors
    public void setCourseName(String CourseName){
        this.CourseName = CourseName;
    }
    public String getCourseName(){
        return CourseName;
    }

    //mutators and accessors
    public void setDesignation(String Designation){
        this.Designation = Designation;
    }
    public String getDesignation(){
        return Designation;
    }
}
