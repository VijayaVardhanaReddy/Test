import java.time.LocalDate;
public class sums 
{
    public static String dayOfTheWeek(int day, int month, int year) 
    {
        LocalDate localDate = LocalDate.now();
        LocalDate someDay = LocalDate.of(year, month, day); //y-m-d
        System.out.println(localDate);
        System.out.println(someDay);
        System.out.println(someDay.getDayOfWeek().toString());
        String d="";
        if (someDay.getDayOfWeek().toString()=="SUNDAY")
        {
            d= "Sunday";
        }
        else if (someDay.getDayOfWeek().toString()=="MONDAY")
        {
            d= "Monday";
        }
        else if (someDay.getDayOfWeek().toString()=="TUESDAY")
        {
            d= "Tuesday";
        }
        else if (someDay.getDayOfWeek().toString()=="WEDNESDAY")
        {
            d= "Wednesday";
        }
        else if (someDay.getDayOfWeek().toString()=="THURSDAY")
        {
            d= "Thursday";
        }
        else if (someDay.getDayOfWeek().toString()=="FRIDAY")
        {
            d= "Friday";
        }
        else if (someDay.getDayOfWeek().toString() == "SATURDAY")
        {
            d= "Saturday";
        }
        return d;
    }
    public static void main(String[] args) 
    {
        System.out.println(dayOfTheWeek(23,12,2019));
    }
}