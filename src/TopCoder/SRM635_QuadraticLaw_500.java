package TopCoder;
public class SRM635_QuadraticLaw_500 {
	static
	public long getTime(long d) {

		long temp;

		temp = (long) Math.sqrt(d);
		//System.out.println(temp +  " " + ((long)d -  (long)temp * temp));
		while ( (long) temp + (long) temp * temp > d)  
			 temp--;
			
		 
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long c = (long) 10E18;
		System.out.print(getTime(Long.parseLong("1")));

	}

}
