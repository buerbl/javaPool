package 异常;

public class Test {

    public static void main(String[] args) throws MyException, MyPlusException {
        Boolean a = true;
        if (a){
            throw new MyException();

        }else {
            throw new MyPlusException();
        }

    }
}
