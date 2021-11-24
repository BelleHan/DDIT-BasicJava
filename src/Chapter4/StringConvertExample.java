package Chapter4;

public class StringConvertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = "200";
		int intData1 = Integer.parseInt(data1);
		
		int data2 = 150;
//		String strData2 = data2 + "";
//		String strData2 = Integer.toString(data2);
		String strData2 = String.valueOf(data2);
	}

}
