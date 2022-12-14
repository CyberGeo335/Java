package Exercise2;

public class StudentNotFoundExeption extends Exception{
    public StudentNotFoundExeption(String errorMessage){
        super(errorMessage);
    }
}
