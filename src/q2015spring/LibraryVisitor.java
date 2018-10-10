package q2015spring;

interface LibraryVisitor {
    public void visit(Book p_book);         //(1)
    public void visit(Article p_article);   //(2)
    void printSum();
}
