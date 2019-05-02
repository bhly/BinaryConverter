public class BinaryConverter{

	private int input;
	private int temp;
	private String result = "";
	
	public BinaryConverter(int input){
		this.input = input;
	}

	public void convert(int input){
		while(input !=0){
		temp = input % 2;
		input = input/2;
		result += Integer.toString(temp);
		}
	}
	
	public void printResult(String result){
		for(int i = result.length()-1; i >= 0; i--){
			System.out.print(result.charAt(i));
		}
	}
	
	public static void main(String args[]){
		BinaryConverter c = new BinaryConverter(23);
		c.convert(446545);
		c.printResult(c.result);
	}
}

