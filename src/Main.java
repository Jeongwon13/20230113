
public class Main {

	public static void main(String[] args) {
		int ival = 100;
		//String strVal = String.valueOf(ival); // int를 String으로 변환
		String strVal = ival + ""; // int를 String으로 변환
		
		double dVal = 200.0;
		String strVal2 = dVal + ""; // int를 String으로 변환하는 또 다른 방법
		
		double sum = Integer.parseInt("+"+strVal) + Double.parseDouble(strVal2); //문자열을 숫자로 바꾸는 방법
		
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		System.out.println(String.join("", strVal,"+",strVal2,"=")+sum);
		System.out.println(strVal+"+"+strVal2+"="+sum2);
		
		
		
		
	}

}
