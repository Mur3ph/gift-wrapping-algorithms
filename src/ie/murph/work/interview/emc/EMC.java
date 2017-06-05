package ie.murph.work.interview.emc;

public class EMC
{

    public void SnapCrackleOrPop()
    {
	System.out.println("EMC");
	for (int x = 1; x < 51; x++)
	{
	    if (x % 3 == 0 && x % 5 == 0)
	    {
		System.out.println("Snap");
	    } else if (x % 3 == 0)
	    {
		System.out.println("Crackle");
	    } else if (x % 5 == 0)
	    {
		System.out.println("Pop");
	    } else
	    {
		System.out.println(x);
	    }
	} // END OF LOOP

    }
    
    public void reverseWord()
    {
	System.out.println("");
	String word = "Navan";
	StringBuilder reverseIt = new StringBuilder(word);
	reverseIt.reverse();
	String jobsDone = reverseIt.toString();
	System.out.println("String reverced innit: " + jobsDone);
	System.out.println("");
    }
    
}
