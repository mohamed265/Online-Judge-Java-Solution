package TopCoder;

public class SRM683NamingConvention_250 {

	public static String toCamelCase(String variableName) {
		String camelCase = "";
		boolean flag = false;
		for (int i = 0; i < variableName.length(); i++) {

			if (variableName.charAt(i) == '_') {
				flag = true;
				continue;
			}

			camelCase += (char) (variableName.charAt(i) + (flag ? -32 : 0) );
			flag = false;
		}
		
		return camelCase;
	}

	public static void main(String[] args) {
		System.out.print(toCamelCase("moo_dddP_ddd"));

	}

}
