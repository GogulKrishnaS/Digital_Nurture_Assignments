package FactoryMethodPatternExample;

public class WordDocFactory extends DocumentFactory{
    public Document createDocument(String s){
        return new WordDocument(s);
    }
}
