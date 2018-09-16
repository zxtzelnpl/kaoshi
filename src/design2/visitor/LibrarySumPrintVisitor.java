package design2.visitor;

public class LibrarySumPrintVisitor {
    private int sum = 0;
    public void visit(Book p_book){
        sum = sum + p_book.getNumberOfPages();
    }
    public void visit(Article p_article){
        sum = sum + p_article.getNumberOfPages();
    }
    public void printSum(){
        System.out.println("SUM = " + sum);
    }
}
