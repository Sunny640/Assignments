import java.util.*;
class pair{
Map<String,Integer> hm=new HashMap<String,Integer>();
hm.put("ten",10);
hm.put("thirty",30);
hm.put("fifty",50);
hm.put("sixty seven",67);
hm.put("thirty four",34);
hm.put("sixty eight",68);
Set<Entry<String, Integer>> set = hm.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
public int[] find(List list,int i,int j,int x){	
while(i<j)
{
if(list[i].getValue()+list[j].getValue()<x)
find(list,i++,j,x);
else if(list[i].getValue()+list[j].getValue()>x)
find(list,i,j--,x);
else
return {list[i].getValue(),list[j].getValue()};
}
}
public static void main(String[] args)
{
pair p=new pair();	
System.out.println("the pairs in the array with sum as x are"+p.find(p.list,0,p.(list.size()-1),40));
}