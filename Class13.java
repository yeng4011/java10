package Class13.java;

class Caaa
 {
 public int num1;
 public int num2;

 public Caaa()
 {
 num1=1;
 num2=1;
 }
 }

 class Cbbb extends Caaa
 {
 public Cbbb()
 {
 super();
 }
 public void show()
 {
 System.out.println("num1="+num1+", num2="+num2);
 } 

 }

 public class Class13
 {
 public static void main(String args[])
 {
 Cbbb b1=new Cbbb();
 b1.show();
 }
 }
