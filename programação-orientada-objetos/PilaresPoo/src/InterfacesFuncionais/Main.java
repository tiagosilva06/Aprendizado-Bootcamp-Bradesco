package InterfacesFuncionais;

import java.util.List;
import java.util.function.Function;

public class Main {
	
	public static void main(String[] args) {
		List<User> users = List.of(new User("Tiago", 21), new User("Joao", 18), new User("Diego", 40), new User("Amanda", 35));
		printStringValue(Record ::toString, users);
	}
	
	public static void printStringValue(Function<User, String> callback, List<User> users) {
		users.forEach(u -> System.out.println(callback.apply(u)));
	}
}
