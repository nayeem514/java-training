class MyArrayList{
private static int CAPACITY;
private Object ob[]=null;
private static int count;
MyArrayList(int cap)
{
CAPACITY=cap;
}
public boolean add(Object o)
{
if(ob==null)
{
if(capacity==0)
ob=new Object[10];
else 
ob=new Object[CAPACITY];
ob[count++]=o;
}
else 
{
if(count<CAPACITY)
{
ob[count++]=o;
}
else
{
Object temp[]=ob.clone();
CAPACITY=(int)(CAPACITY*1.5F);
ob=new Object[CAPACITY];
System.arraycopy(temp,0,ob,0,temp.length);
ob[count++]=o;
}
}
}
public int getCapacity(){
return CAPACITY();
}
