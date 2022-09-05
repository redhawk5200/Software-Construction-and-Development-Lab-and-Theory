import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HumanitiesTeacher HT = new HumanitiesTeacher();

        System.out.println("Enter the name of the Teacher: ");
        String Name = input.nextLine();
        HT.setName(Name);

        System.out.println("Enter the age of the Teacher: ");
        int age = input.nextInt();
        HT.setage(age);
        input.nextLine();

        System.out.println("Enter the Institute of the Teacher: ");
        String Institute = input.nextLine();
        HT.setInstitute(Institute);

        System.out.println("Enter the Field of the Teacher: ");
        String Field = input.nextLine();
        HT.setField(Field);

        System.out.println("Enter the Course Name of the Teacher: ");
        String CourseName = input.nextLine();
        HT.setCourseName(CourseName);

        System.out.println("Enter the Designation of the Teacher: ");
        String Designation = input.nextLine();
        HT.setDesignation(Designation);

        System.out.println("Name of the teacher is: " + HT.getName() + ", age is: " + HT.getAge() + ", Institute is: " + HT.getInstitute() + ", Field is: "+ HT.getField() + ", Course Name is " + HT.getCourseName() + ", designation is: " + HT.getDesignation());
    }
}
