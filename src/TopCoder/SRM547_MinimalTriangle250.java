package TopCoder;

 // SRM 547 250
public class SRM547_MinimalTriangle250 {
	static public double maximalArea (int i){
		return .5 *  Math.sin(Math.toRadians(120))* i * i ;
	}//((Math.sqrt(3))/2)
	public static void main(String[] args) {
		System.out.print(maximalArea(5));

	}

}
