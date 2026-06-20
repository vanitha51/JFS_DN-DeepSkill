package com.designprinciples.factory;

public abstract class DocumentFactory {

public abstract Document createDocument();

public void openDocument() {
    Document document = createDocument();
    document.open();
}

}