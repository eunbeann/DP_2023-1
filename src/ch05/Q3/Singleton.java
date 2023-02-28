package ch05.Q3;

public class Singleton {
	private static Singleton singleton = null;

	private Singleton() {
		System.out.println("인스턴스를 생성했습니다.");
	}

	public static Singleton getInstance() {
		// 객체가 생성되지 않았을 경우에만...
		if (singleton == null) {
			singleton = new Singleton();  // 새로 객체를 만든다.
		}
		return singleton;
	}
}
