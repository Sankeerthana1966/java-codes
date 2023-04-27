class Main 
{
  public static void main(String[] args) 
{
    
    int a = 12, b = 5;
    System.out.println("a + b = " + (a + b));

    System.out.println("a - b = " + (a - b));

    System.out.println("a * b = " + (a * b));

    System.out.println("a / b = " + (a / b));

    System.out.println("a % b = " + (a % b));
    
    System.out.println(a == b);  // false

    System.out.println(a != b);  // true

    System.out.println(a > b);  // false

    System.out.println(a < b);  // true

    System.out.println(a >= b);  // false
    
    System.out.println(a <= b);  // true
  
    System.out.println((5 > 3) && (8 > 5));  // true

    System.out.println((5 > 3) && (8 < 5));  // false

    System.out.println((5 < 3) || (8 > 5));  // true

    System.out.println((5 > 3) || (8 < 5));  // true

    System.out.println((5 < 3) || (8 < 5));  // false
  
    System.out.println(!(5 == 3));  // true

    System.out.println(!(5 > 3));  // false
   
     int x=5, y=4, z=7;  
    System.out.println(x>y && x>z || y<z); 
 
    System.out.println((x<z || y>z) && x<y);  
        
    System.out.println("a&b = " + (a & b));
 
    System.out.println("a|b = " + (a | b));
  
    System.out.println("a^b = " + (a ^ b));
}

}
