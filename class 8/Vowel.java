import java.util.*;
class Vowels{
public static void main(String args[])
{
System.out.print("Enter the sentence");
Scanner s=new
Scanner(System.in);
String word=s.next Line();
Char[]c=word.to Char Array();
Char cc[]=new Char[80];
int j=0;
for(int i=0;i<c.length;i++)
{
if(c[i]=="a"||c[i]=="e"||c[i]=="i"||c[i]=="o"c[i]=="u")
{
continue;
}
else
{
cc[j]==c[i];
j++;
}
}
System.out.print("After Removing Vowels from a sentence");
System.out.print(cc);
}
}
