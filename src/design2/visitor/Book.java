package design2.visitor;

public class Book implements LibraryItemInterface {
    private String m_title;
    private String m_author;
    private int m_pages;

    public Book(String p_author, String p_title, int p_pages){
        m_title = p_title;
        m_author = p_author;
        m_pages= p_pages;
    }

    public int getNumberOfPages(){
        return m_pages;
    }

    public void accept(LibraryVisitor visitor){
        visitor.visit(this);
    }

}
