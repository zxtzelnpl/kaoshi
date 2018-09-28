package q2015spring;

public interface LibraryVisitor {
    void visit(Book p_book);        //1
    void visit(Article p_article);  //2
    void printSum();
}
