package design2.visitor;

interface LibraryItemInterface {
    void accept(LibraryVisitor visitor);
}
