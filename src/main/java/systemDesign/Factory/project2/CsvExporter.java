package systemDesign.Factory.project2;

public class CsvExporter implements ReportExporter{
    @Override
    public void export(String ReportData) {
        System.out.println("Exporting Report as CSV ....");
        System.out.println("CSV content : " + ReportData);
    }
}
