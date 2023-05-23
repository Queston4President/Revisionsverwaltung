

public class Noam extends Schueler
{
    private String Name;
    private int Alter;

    public Noam()
    {
        Name = "Noam";
        Alter = 16;
    }
    
    public void GibInfo()
    {
        System.out.print("Meine Name ist " + Name +". ");
        System.out.println("Ich bin " + Alter + " Jahre alt.");
    }
}
