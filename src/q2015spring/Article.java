package q2015spring;

public class Article implements LibraryItemInterface {
    private String m_title; //论文名称
    private String m_author; //论文作者
    private int m_start_page;
    private int m_end_page;

    public Article(String p_title, String p_author, int p_start_page, int p_end_page) {
        this.m_title = p_title;
        this.m_author = p_author;
        this.m_start_page = p_start_page;
        this.m_end_page = p_end_page;
    }

    public int getNumberOfPages(){
        return m_end_page - m_start_page;
    }

    public void accept(LibraryVisitor Visitor){
        Visitor.visit(this);// (4)
    }
}
