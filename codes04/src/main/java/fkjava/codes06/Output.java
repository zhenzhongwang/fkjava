package fkjava.codes06;

public interface Output {
	int MAX_CACHE_LINE = 50;
	void out();
	void getData(String msg);
	
	default void print(String ...msgs){
		System.out.println("默认的print（）方法");
		for(String msg : msgs){
			System.out.println(msg);
		}
		
	}
	
	default void test(){
		this.print("默认的test（）方法");
	}
	
	static String staticTest(){
		return "接口里的类方法";
	}
}
