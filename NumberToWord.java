package number;

public class NumberToWord {

	static String word = "";
	String[] onetoninty = {"zero ","one ","two ","three ","four ",
			"five ","six ","seven ","eight ","nine ","ten ","eleven ","twelve ","thirteen ","fourteen ",
			"fifteen ","sixteen ","seventeen ","eighteen ","nineteen "};
	String[] tens = {"twenty ","thirty ","fourty ","fifty ","sixty ","seventy ","eighty ","ninty "};
	String[] more = {"hundred ","thousand ","lacks ","crores "}; 
	void convert(int n)
	{
		if(n>=0 && n<=19)
		{
			System.out.print(n);
			word = onetoninty[n];
		}
		else if(n>=20 && n<=99)
		{
			//System.out.print("hello");
			twoDigits(n);
		}
		else if(n >= 100 && n <= 999)
		{
			threeDigits(n);			
		}
		else if(n >= 1000 && n <= 99999)
		{
			if(n/1000 >= 0 && n / 1000 <= 19)
				word += onetoninty[n/1000];
			else
				twoDigits(n/1000);
			word += more[1];
			threeDigits(n%1000);
		}
	}
	void threeDigits(int n)
	{
		if(n/100 != 0)
			word += onetoninty[n / 100] + more[0];
		n = n%100;
		//System.out.println(n);
		if(n != 0)
		{
			word += "and ";
			if(n >= 0 && n <= 19)
				word += onetoninty[n];
			else
				twoDigits(n);
		}
	}
	void twoDigits(int n) {
		
		word += tens[(n / 10)-2];
		if(n % 10 != 0)
			word +=  onetoninty[n % 10];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 11110;
		NumberToWord n = new NumberToWord();
		//for(String n1 : onetoninty)
		n.convert(num);
		System.out.println(num+ "\n" +word);
	
	}
	

}
