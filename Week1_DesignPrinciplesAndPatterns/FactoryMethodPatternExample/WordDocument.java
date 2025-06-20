package FactoryMethodPatternExample;

public class WordDocument implements Document {
    String name="";
    WordDocument(String n){
        this.name = n;
    }
    public void open(){
        System.out.println("Opening Word Document : "+this.name);
    }
    
}
