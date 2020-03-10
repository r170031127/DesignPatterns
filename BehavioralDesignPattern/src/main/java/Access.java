public class Access {
public Calculator c;
Access(Calculator c)
{
	this.c=c;
	
}
public void accessing(int a,int b)
{
	c.Calculation(a,b);
	
}
}