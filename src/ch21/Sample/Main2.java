package ch21.Sample;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 본인
		/*
		Printable p1 = new Printer("p1"); // 5초 정도 걸림
		p1.print("최승훈");
		*/
		
		// 대리인
		Printable p2 = new PrinterProxy("p2"); 
		p2.print2("최승훈1"); // 대리인이 일을 함
		p2.print("최승훈2"); // 본인 생성 => 본인이 일을 함
		p2.print3("a");
		p2.print3("aaaaaa");
	}
	
	public static void method1(Printable p) {
		p.print("abc");
	}

}
