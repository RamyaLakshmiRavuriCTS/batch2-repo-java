import java.util.Scanner;

class Multicatch
{
    String string ;
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number1");
        int num1=sc.nextInt();
        System.out.println("Enter number2");
        int num2=sc.nextInt();
        Multicatch multicatch=new Multicatch();
        try{

            int output=num1/num2;
            System.out.println ("Result: "+output);

            System.out.println (multicatch.string.length());
        }
        catch(ArithmeticException e){
           System.out.println ("Arithmetic Exception End of main");
        }

        catch(NullPointerException e){
                    System.out.println("Null Pointer Exception End of main");
                }
            }
        }


