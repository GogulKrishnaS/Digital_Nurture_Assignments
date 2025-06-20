package FactoryMethodPatternExample;

public class PDFDocFactory extends DocumentFactory {
    public Document createDocument(String s){
        return new PDFDocument(s);
    }   
}
