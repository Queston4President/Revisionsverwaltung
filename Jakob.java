
public class Jakob extends Schueler
{
    private String Name;
    private int Alter;    
    public Jakob()
    {
        Name = "Jakob";
        Alter = 17;
    }
    
    public void GibInfo()
    {
        System.out.print("Meine Name ist " + Name +". ");
        System.out.println("Ich bin " + Alter + " Jahre alt.");
    }
}
