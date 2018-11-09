package pak15303;

public class Tested15303 {

	
	public int returnSum(int[] intarr) 
	{
		int sum = 0;
		for (int i = 0; i< intarr.length; i++)
		sum += intarr[i];
		return sum;
	}
	
	public int returnMax(int [] intarr)
	{
		int max= intarr[0];
		
		for (int i :intarr)
		{
			if(i > max)
		    max = i;
		}
		return max;
	}
	
	
	
	public int returnMin(int[] intarr) 
	{
        int min= intarr[0];
		
		for (int i :intarr)
		{
			if(i < min)
		    min = i;
		}
		
		return min;
	}
	
	public int returnRange(int[] intarr) 
	{
		int range;
		range = returnMax(intarr) - returnMin(intarr) +1;
		
		return range;
	}
	
	
	
}
