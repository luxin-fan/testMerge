package testLombok;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class ToStringExample {

	@EqualsAndHashCode.Exclude
	private String name;

	@ToString.Exclude
	@EqualsAndHashCode.Include
	private String age;

	@ToString.Include
	private String sex;

	public static void main(String[] args) {
		ToStringExample tse = new ToStringExample();
		System.out.println(tse.toString());
	}
}
