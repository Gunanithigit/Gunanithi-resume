import java.util.*;
import java.lang.*;
import java.io.*;
class ResumeGenerator 
{
    public static void main(String[] args) 
    {
       
        String name = "[Gunanithi V]";
        String email = "[gunanithi888@gmail.com]";
        String phone = "[9626685066]";
        String address = "[5/256,Thirumugan nagar,2nd street, thuraiyur road,Musiri-621211,Trichy]";

        
        String degree = "[B.E computer science engineering]";
        String university = "[Rathinam technical campus,coimbatore]";
        String graduationYear = "[2020]";

        
        String[] skills = 
        {
             C programming
             C++ programming
             Java programming
             Html
             Css
             javascript
        };

        
        
        
        System.out.println("==========================");
        System.out.println("         RESUME           ");
        System.out.println("==========================");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        System.out.println();

        System.out.println("Education:");
        System.out.println(degree + " from " + university + " (Graduated in " + graduationYear + ")");
        System.out.println();

        System.out.println("Skills:");
        for (String skill : skills) 
        {
            System.out.println("- " + skill);
        }
        System.out.println();
        System.out.println("==========================");
    }
}
