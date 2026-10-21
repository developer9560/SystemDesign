package systemDesign.Factory.project2;

public class JsonExporter implements ReportExporter{
    @Override
    public void export(String ReportData) {
        System.out.println("EXporting Report as JSON...");
        System.out.println("JSON content : "+ ReportData);
    }
}
