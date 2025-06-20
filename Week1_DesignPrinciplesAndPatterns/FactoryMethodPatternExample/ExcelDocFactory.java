package FactoryMethodPatternExample;

public class ExcelDocFactory extends DocumentFactory {
    public Document createDocument(String s){
        return new ExcelDocument(s);
    }
}
