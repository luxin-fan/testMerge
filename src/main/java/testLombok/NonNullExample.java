package testLombok;

import lombok.Getter;
import lombok.NonNull;

public class NonNullExample {

	@Getter
	private String name;

	public NonNullExample(@NonNull String name) {
		System.out.println("测试一下");
		this.name = name;
		System.out.println(name.length());
	}

	public String NonNullExample_1(@NonNull String name, @NonNull String age) {
		System.out.println("测试一下方法参数");
		String result = null;
		System.out.println(name.length());
		return result;
	}

	public static void main(String[] args) {
		String name = null;
		NonNullExample nne = new NonNullExample(name);
		nne.NonNullExample_1(null, null);
		System.out.println(nne.getName());
	}
}
