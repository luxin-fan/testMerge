package testLombok;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor(force = true, staticName = "newInstance1")
public class ArgsConstructorExample {
	// 包含的final字段如果没有初始化，需要加上force=true强制初始化，否则编译错误
	private final String name;
	// 不会进行null检查
	@NonNull
	@Getter
	private String age;
	private String sex;

	public static void main(String[] args) {
		ArgsConstructorExample nace1 = new ArgsConstructorExample();
		System.out.println(nace1.getAge());
		ArgsConstructorExample nace2 = ArgsConstructorExample.newInstance1();
		System.out.println(nace2.getAge());
	}
}
