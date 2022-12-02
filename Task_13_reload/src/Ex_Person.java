// 5 + 5 = 10
public class Ex_Person
{
    private String name, surname, patronymic;

    public Ex_Person(String surname)
    {
        this.surname = surname;
    }

    public Ex_Person(String name, String surname, String patronymic)
    {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getSurname()
    {
        StringBuilder sb = new StringBuilder(surname);
        if(name != null && ! name.equals(""))
        {
            sb.append(" ").append(name);
        }
        if(patronymic != null && ! patronymic.equals(""))
        {
            sb.append(" ").append(patronymic);
        }
        return sb.toString();
    }

    public static void main(String[] args)
    {
        Ex_Person Body1 = new Ex_Person("Форд");
        Ex_Person Body2 = new Ex_Person("Харисон", "Форд", "");
        Ex_Person Body3 = new Ex_Person("Харисон", "Форд", "Кристофер");
        System.out.println(Body1.getSurname());
        System.out.println(Body2.getSurname());
        System.out.println(Body3.getSurname());
    }
}
