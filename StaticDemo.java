class Student 
{
    int rollNo;                 
    static int count = 0;       
    Student() 
    {
        count++;
        rollNo = count;
    }
    static int getCount() 
    {
        return count;
    }
    void display() 
    {
        System.out.println("Roll Number: " + rollNo);
    }
}
public class StaticDemo 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.display();
        s2.display();
        s3.display();
        System.out.println("Total Students Created: " + Student.getCount());
    }
}
