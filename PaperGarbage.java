public class PaperGarbage extends Garbage
{
    private boolean isSqueezed = false;

    public PaperGarbage(String name, boolean isSqueezed)
    {
        super(name);
        this.isSqueezed = isSqueezed;
    }

    public void Squeeze()
    {
        this.isSqueezed = true;
    }
}
