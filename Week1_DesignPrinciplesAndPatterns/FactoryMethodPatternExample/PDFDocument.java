package FactoryMethodPatternExample;

public class PDFDocument implements Document {
     String name="";
    PDFDocument(String n){
        this.name = n;
    }
    public void open(){
        System.out.println("Opening PDF Document : "+this.name);
    }
}
