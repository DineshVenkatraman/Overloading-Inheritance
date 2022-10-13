
class A
{
    void display()

        {
            System.out.println("A - is Display");
        }
    }
class B extends A
{
        void display(int no)

            {
                System.out.println("B - is Display"+no);
            }
        }


public class inheritoverLoad1 {
    public static void main(String args[])
    {
        B b=new B();
        b.display();
        b.display(100);
    }
}
