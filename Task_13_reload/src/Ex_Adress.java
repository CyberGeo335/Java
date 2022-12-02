import java.util.StringTokenizer;
// 10 + 15 = 25
public class Ex_Adress
{

    final private String country, region, city, street, house, housing, flat;

    public Ex_Adress(String address, boolean isMultiDivider)
    {
        if(address == null)
        {
            throw new NullPointerException();
        }
        String[] s;
        if(isMultiDivider)
        {
            StringTokenizer st = new StringTokenizer(address, ",.;");
            s = new String[st.countTokens()];
            int i = 0;
            while(st.hasMoreTokens())
                s[i++] = st.nextToken();
        }
        else
        {
            s = address.split(",");
        }
        if(s.length < 7)
        {
            throw new IllegalArgumentException("Введен некорректный адресс!");
        }
        country = s[0].trim();
        region = s[1].trim();
        city = s[2].trim();
        street = s[3].trim();
        house = s[4].trim();
        housing = s[5].trim();
        flat = s[6].trim();
    }

    @Override
    public String toString()
    {
        return "Address:\n" +
                "    country = " + country + '\n' +
                "    region = " + region + '\n' +
                "    city = " + city + '\n' +
                "    street = " + street + '\n' +
                "    house = " + house + '\n' +
                "    housing = " + housing + '\n' +
                "    flat = " + flat + '\n';
    }


    public static void main(String [] args)
    {
        Ex_Adress first = new Ex_Adress("Россия, Московская область, Москва, улица 7 Парковая, 13, 1, 56", false);
        Ex_Adress third = new Ex_Adress("Россия, Московская область. Москва; улица 26 Парковая; 25, 1. 56", true);
        System.out.println(first);
        System.out.println(third);
        Ex_Adress second = new Ex_Adress("Россия, Московская область, 57", false);
        System.out.println(second);
    }
}
