package systemDesign.Factory.project2;

public class PdfExporter implements ReportExporter{
    @Override
    public void export(String reportData){
        System.out.println("Exporting report as PDF ... ");
        System.out.println("PDF content " + reportData);
    }
}

