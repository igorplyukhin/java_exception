package exception;

public class ExceptionTest {

    public static void main(String[] args) throws MyException{
        try {
            dummy(-5);
        } catch (MyException e) {
            System.out.println("MyException");
        }
        dummy(5);
    }

    public static int dummy(int x) throws MyException{
        if (x < 0){
            throw new MyException();
        }
        return x;
    }
}
