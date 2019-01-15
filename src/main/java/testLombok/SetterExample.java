package testLombok;

//import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * 1.在指定的属性上方进行注释则覆盖原本设置内容
 * 2.类上的所有非静态(no-static)字段都会生成相应的getter/setter方法
 * */
@Getter@Setter
public class SetterExample {
	
	//@Getter(value=AccessLevel.PRIVATE) @Setter
	private String name;
	
	private String age;
	
	public static void main(String[] args) {
		SetterExample se = new SetterExample();
		se.setAge("11");
	}
}
