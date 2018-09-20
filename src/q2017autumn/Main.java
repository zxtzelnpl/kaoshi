package q2017autumn;

public class Main {
    public static void main(String[] args){
        //在Linux操作系统上查看demo.gif图像文件
        Image image = new GIFImage();       // （3）
        Implementor imageImp =  new LinuxImp();    // (4)
        image.setImp(imageImp);       // (5)
        image.parseFile("demo.gif");
    }
}
