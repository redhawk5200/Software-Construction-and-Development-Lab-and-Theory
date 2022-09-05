import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Student s1 = new Student();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String Name = input.nextLine();
        s1.setName(Name);

        System.out.println("Enter your Department name: ");
        String DepartmentName = input.nextLine();
        s1.setDepartmentNameName(DepartmentName);

        System.out.println("Enter your id: ");
        int id = input.nextInt();
        s1.setid(id);

        System.out.println("Enter the name of all six subjects");
        String [] subjects = new String [6];
        for(int i=0;i<6;i++){
            subjects[i]=input.nextLine();
        }
        s1.setSubjects(subjects);

        System.out.println("Enter Total Marks of Six Subjects: ");
        int tMarks= input.nextInt();
        s1.settMarks(tMarks);

        System.out.println("Enter marks obtained of Six Subjects: ");
        int marksobt= input.nextInt();
        s1.setmarksobt(marksobt);

        float percentage = s1.getmarksobt()/s1.gettMarks()*100;
        System.out.println("The name of the student is: " + s1.getName() + ", department name is: " + s1.getDepartmentName() + " and id is: " + s1.getid()+ ".");
        System.out.println("His percentage is: " + percentage);

        if(percentage>=90 && percentage<=100){
            System.out.println("Grade is A*");
        }
        else if(percentage>=80 && percentage<=90){
            System.out.println("Grade is A");
        }
        else if(percentage>=70 && percentage<=80){
            System.out.println("Grade is B");
        }
        else{
            System.out.println("Grade is C");

        }


    }

}
