package q2015spring;

public class Book implements LibraryItemInterface{
    private String m_title;
    private String m_author;
    private int m_pages;

    public Book(String p_title,String p_author,int p_pages){
        m_title = p_title;
        m_author = p_author;
        m_pages = p_pages;
    }

    public int getNumberOfPages(){
        return m_pages;
    }

    public void accept(LibraryVisitor Visitor){
        Visitor.visit(this);            //(5)
    }
}
