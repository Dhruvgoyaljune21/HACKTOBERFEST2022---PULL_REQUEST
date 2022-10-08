import java.util.Scanner;
public class addition
{
    public static void main(String agrs[])
    {
        float pi=3.14f;
        float area;
        int r;
        System.out.println("Enter the radius of circle::");
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        area=pi*r*r;
        System.out.println("area of circle is::"+area);
    }
}
