package q2015spring;

public class Article implements LibraryItemInterface{
    private String m_title;
    private String m_author;
    private int m_start_page;
    private int m_end_page;

    public Article(String p_title,String p_author,int p_start_page,int p_end_page){
        m_title = p_title;
        m_author = p_author;
        m_start_page = p_start_page;
        m_end_page = p_start_page;
    }

    public int getNumberOfPages(){
        return m_end_page - m_start_page;
    }

    public void accept(LibraryVisitor Visitor){
        Visitor.visit(this);            //(4)
    }
}
