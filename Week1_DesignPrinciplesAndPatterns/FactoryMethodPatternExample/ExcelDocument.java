package FactoryMethodPatternExample;

public class ExcelDocument implements Document {
     String name="";
    ExcelDocument(String n){
        this.name = n;
    }
    public void open(){
        System.out.println("Opening Excel Document : "+this.name);
    }
}
