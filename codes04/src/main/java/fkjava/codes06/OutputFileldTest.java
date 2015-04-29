package fkjava.codes06;

public class OutputFileldTest implements Output {

	@Override
	public void out() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getData(String msg) {
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args){
		System.out.println(Output.staticTest());
		OutputFileldTest test = new OutputFileldTest();
		test.test();
	}
	
	
}
