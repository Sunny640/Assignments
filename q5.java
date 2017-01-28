//in treeset, in your own class you have to override toString,compareto,equals methods of comparable interface
package assignments;
import java.util.*;
public class sum3{
TreeSet<Integer> ts=new TreeSet<Integer>();
public int sumsk(int[] a,int x)
{
for(int i=0;i<a.length;i++)
ts.add(a[i]);
int k=x;
int sum=0;
while(k>0)
{
sum=sum+ts.pollFirst();
k--;
}
return sum;
}
public static void main(String[] args)
{
int[] a={10, 30, 50, 67, 34, 68};
int k=3;
sum3 s=new sum3();
System.out.println("the sum of first k smallest elements are"+s.sumsk(a,k));
}
}