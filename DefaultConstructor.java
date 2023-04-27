//default constructor is used to assign intial values to variables or it used to provide default values to variables
class DefaultConstructor
{  
int Roll_no;
String Name;
//creating a default constructor  
DefaultConstructor()
{
    System.out.println("Welcome to Java");
    System.out.println("Student Roll_no:"+Roll_no);
    System.out.println("Student Name:"+Name);
}  
//main method  
public static void main(String args[])
{  
//calling a default constructor  
DefaultConstructor b=new DefaultConstructor();  
}  
}