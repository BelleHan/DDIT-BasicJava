package chapter3;

public class Question38 {
	
	public static void main(String[] args) {
		System.out.println(Myadd.add(1000));

		Myadd myAdd = new Myadd();
		System.out.println(myAdd.add(100, 200));
		
		System.out.println(myAdd.add(2000, 300000L));
		
		System.out.println(myAdd.add('1', 100f));
		
		

	}

}
