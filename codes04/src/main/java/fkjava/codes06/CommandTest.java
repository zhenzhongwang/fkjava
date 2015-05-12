package fkjava.codes06;

interface Eatable{
	void taste();
}

interface Flyable{
	void fly(String weather);
}

interface Addable{
	int add(int a, int b);
}

public class CommandTest {
	
	public void eat(Eatable e){
		System.out.println(e);
		e.taste();
	}
	
	public void driver(Flyable f){
		System.out.println("我正在驾驶：" + f);
		f.fly("[晴天]");
	}
	
	
	public void test(Addable a){
		System.out.println("5+3的和为：" + a.add(5, 3));
	}
	
	public static void main(String args[]){
		CommandTest cmdTest = new CommandTest();
		cmdTest.eat(() -> System.out.println("good"));
		cmdTest.driver(weather -> 
		{
			System.out.println("今天天气是：" + weather);
		}
				);
		cmdTest.test((a , b) -> a + b);
	}
}
