// 25 + 25 = 50
public class Ex_PhoneNumber
{
    final private String codeCountry, city, triplet, quadruple;

    public Ex_PhoneNumber(String number)
    {
        if(number.startsWith("8"))
        {
            codeCountry = "+7";
        }
        else
        {
            codeCountry = number.substring(0, number.length()-10);
        }
        city = number.substring(number.length()-10, number.length()-7);
        triplet = number.substring(number.length()-7, number.length()-4);
        quadruple = number.substring(number.length()-4);

    }

    @Override
    public String toString()
    {
        return codeCountry + city + "-" + triplet + "-" + quadruple;
    }

    public static void main(String [] args)
    {
        System.out.println(new Ex_PhoneNumber("+88005553535"));
        System.out.println(new Ex_PhoneNumber("+79175655655"));
        System.out.println(new Ex_PhoneNumber("89175655655"));
    }
}
