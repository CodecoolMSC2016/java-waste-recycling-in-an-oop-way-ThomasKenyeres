public class Main
{
    public static void main(String[] args)
    {
        Garbage g = new Garbage("kakiee");
        System.out.println("HEY");
        System.out.println(g.getName());

        PaperGarbage pg = new PaperGarbage("szlotty", true);
        System.out.println(pg.getName());
    }
}
