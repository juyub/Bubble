package bubble.test.ex00;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Dog{
	private String name; // 10�� ->�޼��� 20��
}

public class LombokTest {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.setName("����");
		System.out.println(d.getName());
	}
}
