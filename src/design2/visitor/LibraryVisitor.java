package design2.visitor;

public interface LibraryVisitor {
    void visit(Book p_book);
    void visit(Article p_article);
    void printSum();
}
