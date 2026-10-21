package systemDesign.Factory.project2;

public class Main {

    public static void main(String[] args) {
        ReportExportCreator creator = new CsvExportCreator();
        creator.exportReport("My name is suraj");
        ReportExportCreator creator1 = new PdfExportCreator();
        creator1.exportReport("My name is Rahul");

    }
}
