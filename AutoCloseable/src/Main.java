public class Main
{
    public static void main(String[] args)
    {
        Person p1 = new Person("Bartek", "Kołakowski", 30);
        try(Person p2 = new Person("Andrzej", "Kowalski", 40))
        {
            System.out.println(p2);
            throw new Exception("Casual exception");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            for (Throwable t : e.getSuppressed())
            {
                System.out.println(t.getMessage());
            }
        }
    }
}