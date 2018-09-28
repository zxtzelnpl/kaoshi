package q2015spring;

public class Book implements LibraryItemInterface {
    private String m_title; //论文名称
    private String m_author; //论文作者
    private int m_pages;  // 页数

    public Book(String p_title, String p_author, int p_pages) {
        this.m_title = p_title;
        this.m_author = p_author;
        this.m_pages = p_pages;
    }

    public int getNumberOfPages(){
        return m_pages;
    }

    public void accept(LibraryVisitor Visitor){
        Visitor.visit(this);// (5)
    }
}
