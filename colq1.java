package assignments;
import java.util.*;
public class duplicate{
    public static int repeated;
    public static int cnt;
public static void main(String args[]){
    Set<Names> dup=new HashSet<Names>();
Iterator itr=dup.iterator();

while(itr.hasNext())
{
Names n=(Names)itr.next();
int key=n.hashcode();
while(itr.hasNext()){
if(n.equals(itr.next())){
cnt++;
}}
if(cnt>1)
repeated=repeated+1;
}

dup.add(new Names(1,"raudra"));
dup.add(new Names(2,"ravi"));
dup.add(new Names(3,"java"));
dup.add(new Names(4,"ravula"));
dup.add(new Names(2,"ravi"));
dup.add(new Names(4,"ravula"));
System.out.println(dup);
System.out.println("the number of names repeated are"+repeated);
}
}
 class Names
{
public int key;
public String name;
Names(int key,String name)
{
this.key=key;
this.name=name;
}
public int hashcode(){
return key;
}
public boolean equals(Object o)
{
if(!(o instanceof Names))
return false;
else
return this.key==((Names)o).key;
}
}


