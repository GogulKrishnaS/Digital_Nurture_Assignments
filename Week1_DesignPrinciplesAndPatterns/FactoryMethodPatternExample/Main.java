package FactoryMethodPatternExample;

public class Main {
    public static void main(String[] args) {
        WordDocFactory wf = new WordDocFactory();
        Document word = wf.createDocument("Project_Report");
        word.open();
        wf.createDocument("Dummy").open();
        PDFDocFactory pf = new PDFDocFactory();
        Document pdf = pf.createDocument("Report");
        pdf.open();
        ExcelDocFactory ef = new ExcelDocFactory();
        Document StudentDB = ef.createDocument("Student_DB");
        Document ElectiveList = ef.createDocument("ElectiveList");
        ElectiveList.open();
        StudentDB.open();

    }
}
