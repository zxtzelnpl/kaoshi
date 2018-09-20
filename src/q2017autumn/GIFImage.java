package q2017autumn;

public class GIFImage extends Image {
    @Override
    public void parseFile(String fileName) {

        //此处解析BMP文件并获得一个像素矩阵对象m
        Matrix m = new Matrix();
        this.imp.doPaint(m);    //显示像素矩阵m   (2)
    }
}
