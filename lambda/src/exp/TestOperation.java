package exp;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
invokeOperation(10,20,(int x1, int y1)->{return (x1+y1);});
invokeOperation(10,20,(int x1, int y1)->{return (x1-y1);});
invokeOperation(10,20,(int x1, int y1)->{return (x1/y1);});
invokeOperation(10,20,(int x1, int y1)->{return (x1*y1);});
}

	private static void invokeOperation(int x, int y, MathOperation op) {
		// TODO Auto-generated method stub
		System.out.println(op.operate(x, y));
	}
	}


