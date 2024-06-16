import java.util.Scanner;
public class Lift
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of person in the lift:");
int n=sc.nextInt();

int a[]=new int[n];
for(int i=0;i<a.length;i++)
{
System.out.println("enter the weight of the  person"+" "+(i+1));
a[i]=sc.nextInt();
}
int sum=0;
for(int i=0;i<a.length;i++)
{
sum=sum+a[i];
}
System.out.println("The total weight is:"+" "+sum);

if(sum>800)
{
System.out.println("Overweight Lift can't move");
}
else
{
System.out.println("Correct weight Lift starts");
}
}
}