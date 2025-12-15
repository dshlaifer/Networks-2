
/**
 * Write a description of class InheritanceTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InheritanceTest
{
    public void testPartA()
    {
        Person p1 = new Student();        
        Person p2 = new PhDStudent();     

        
        Student s1 = new PhDStudent();    
    }

    public void testPartB()
    {
        Person p1 = new Person();
        Person p2 = new Person();
        PhDStudent phd1 = new PhDStudent();
        Teacher t1 = new Teacher();
        Student s1 = new Student();

        

        p1 = s1;       

        s1 = phd1;     
    }
}
