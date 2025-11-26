package Parsons.Capitulo6.CourseExample;
import java.lang.reflect.*;
public class CourseReflection {

public static void main(String[] args)
{
Course myCourse = new Course("Agile Methods", 5, 20000.0,30);
Class courseClass = myCourse.getClass();
Method[] methods = courseClass.getDeclaredMethods();
System.out.println(courseClass.getName() + " methods:");
for (int i = 0; i < methods.length; i++)
{
System.out.println(methods[i].getName());
}
} 
}
