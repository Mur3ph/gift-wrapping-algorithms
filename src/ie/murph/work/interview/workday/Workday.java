package ie.murph.work.interview.workday;

public class Workday
{
    private int total = 0;
    private int limit = 1000;
    
    public void numberDivableByThreeAndFive()
    {
	System.out.println("Workday Part One");
	for (int x = 0; x < limit; x++)
	{
	    if (x % 3 == 0)
	    {
		total = total + x;
	    } 
	    else if (x % 5 == 0)
	    {
		total = total + x;
	    }
	}
	System.out.println("First: " + total);
    }
    
    public void numberDivableByThreeAndFive2()
    {
	System.out.println("");
	System.out.println("Workday Part Two");
	total = 0;
	for (int x = 0; x < limit; x++)
	{
	    if (x % 3 == 0 || x % 5 == 0)
	    {
		total = total + x;
	    }
	}
	System.out.println("Second: " + total);
    }
}
