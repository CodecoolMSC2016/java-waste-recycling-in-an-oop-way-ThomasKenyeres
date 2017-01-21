public class PlasticGarbage extends Garbage
{
    private boolean isClean = false;

    public PaperGarbage(String name, boolean isClean)
    {
        super(name);
        this.isClean = isClean;
    }

    public void Squeeze()
    {
        this.isClean = true;
    }
}
