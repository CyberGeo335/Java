package Exercise1_2_3;

public class Animal {
    private String name, kind;
    Animal(){
        name = "Nick";
        kind = "monkey";
    }

    @Override
    public String toString() {
        return "Это животное является: " + kind + ". Его имя: " + name;
    }
}
