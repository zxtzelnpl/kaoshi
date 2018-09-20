package q2017autumn;

abstract class Image {

    public void setImp(Implementor imp){this.imp = imp;}
    public abstract void parseFile(String fileName);

    protected Implementor imp;
}
