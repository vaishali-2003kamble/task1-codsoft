import java.util.*;
class GuessTheNumber
{
public static void main(String[] argus)
{
Scanner sc=new Scanner(System.in);
int number=(int)(Math.random()*100)+1;
int k=5;
int i,guess;
System.out.println("A number is chossen between 1 to 100\n"+"Guess the number within 5 trials");
for(i=0;i<k;i++)
{
System.out.println("Guess the number :- ");
guess=sc.nextInt();
if(guess==number)
{
System.out.println("Congratulation! Your guess number is correct :- "+guess);
}
else if(number>guess && i!=k-1)
{
System.out.println("Number is greater then you are guessing :- "+guess);
}
else if(number<guess && i!=k-1)
{
System.out.println("Number is less then you are guessing :- "+guess);
}
}
if(i==k)
{
System.out.println("the number you are guessing is incorrect after 5 trials :- ");
System.out.println("the number is :- "+number);
}
}
}

