import java.io.*;
class Example_Throw1 { 
    //declare exception using throws in the method signature
  void testMethod(int num) throws IOException, ArithmeticException{ 
     if(num==1)
        throw new IOException("IOException Occurred");
     else
        throw new ArithmeticException("ArithmeticException");
  } 
}class Example_Throw{ 
  public static void main(String args[]){ 
   try{ 
       //this try block calls the above method so handle the exception
     Example_Throw1 obj=new Example_Throw1(); 
     obj.testMethod(1); 
   }catch(Exception ex){
     System.out.println(ex);
    } 
  }
}