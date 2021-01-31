package Misc;

class TestCode{
	
	int var = 1;
	int fn() {
		var = 2;
		return var;
	}
	
	public static void main(String[] args) {
		
		child obj = new child();
		System.out.println(obj.fn());
	}
	
}

class child extends TestCode{
	
	int var = 3;
	int fn() {
		var = 4;
		return var;
	}
	
}