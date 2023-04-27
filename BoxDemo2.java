import java.util.Scanner;
class Box
{
double width;
double hieght;
double depth;

double volume()
{
	return width*hieght*depth;
}
}
class BoxDemo2{
public static void main(String args[]){
Box mybox = new Box();

double vol;
       Scanner obj=new Scanner(System.in);
       mybox.width=obj.nextDouble();
       mybox.hieght=obj.nextDouble();
       mybox.depth=obj.nextDouble();


//vol=mybox.volume();
System.out.println(mybox.volume());
//System.out.println("Volume is " +vol);

}
}