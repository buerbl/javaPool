package 异常;

public class MyPlusException extends RuntimeException {

	public MyPlusException(){
		super();
	}

	public MyPlusException(String msg){
		super(msg);
	}
}
