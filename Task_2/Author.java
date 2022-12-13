import java.lang.*;
public class Author
{
    public String name;
    public String email;
    public char gender;

    public Author(String ame, String mail, char ender)
    {
        name=ame;
        email=mail;
        gender=ender;
    }
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String mail)
    {
        this.email=mail;
    }
    public char getGender()
    {
        return gender;
    }
    public String toString()
    {
        return "name of author is "+this.name+". Email is "+this.email+". Gender is "+this.gender;
    }
}
