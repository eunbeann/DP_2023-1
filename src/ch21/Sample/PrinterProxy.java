package ch21.Sample;

// Printer 클래스의 ‘대리인’을 나타내는 클래스
public class PrinterProxy implements Printable {
	private String name; // 대리인의 이름을 저장함

	private Printer real; // ‘본인’에 대한 참조를 저장함

	public PrinterProxy() {
	}

	public PrinterProxy(String name) { // 생성자
		this.name = name;
	}

	public synchronized void setPrinterName(String name) { // 이름의 설정
		if (real != null) { // "본인"이 이미 생성되어 있다면...
			real.setPrinterName(name); // "본인"에게도 이름을 설정한다.
		}
		this.name = name;
	}

	public String getPrinterName() { // 이름의 취득
		return name;
	}

	public void print2(String string) {
		System.out.println("대리인 - print2( ): " + string);
	}
	
	public void print3(String string) {
		if( string.length() <= 2) {
		     System.out.println("대리인 - print3( ): " + string);
		} else if( real != null){
			real.print3(string);
		}
	}
	
	public void print(String string) { // 표시
		realize(); // 이 때, 본인이 생성된다.
		real.print(string); // 본인’ 객체의 print( ) 메소드를 호출한다 => 위임

	}

	// 실제 일을 하는 ‘본인’ 객체가 생성되지 않았으면 생성한다.
	private synchronized void realize() {
		if (real == null) {
			real = new Printer(name); // 본인
		}
	}
}
