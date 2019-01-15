package testLombok;

public class Main {
	public static void main(String[] args) {
		int j = query();
		System.out.println(j);
	}

	public static int query() {
		int i = 0;
		try {
			System.out.print("try");
			return i += 10;
		} catch (Exception e) {
			System.out.print("catch");
			i += 20;
		} finally {
			System.out.print("finally-i:" + i + "");
			i += 10;
			System.out.print("finally");
			return i;
		}
	}
}
