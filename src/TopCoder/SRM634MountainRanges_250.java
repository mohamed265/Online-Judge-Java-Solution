package TopCoder;

public class SRM634MountainRanges_250 {
	
	static public int countPeaks(int[] heights){
		int slon = 0;
		if (heights.length == 1)
			return 1;
		for (int i = 0 ; i < heights.length ;i++)
		{
			if (i == 0 && heights[i] > heights[i+1])
				slon++;
			else if (i == heights.length -1 && heights[i] > heights[i-1] )
				slon++;
			else if (i != 0 && i != heights.length-1 && heights[i] > heights[i+1] && heights[i] > heights[i-1] )
				slon++;
				
		}
		return slon;
		
	}

	public static void main(String[] args) {
		int [] heights = new int [] {1, 1, 1, 1, 1, 1, 1};
		System.out.print(countPeaks(heights));

	}

}
