package systemDesign.Factory.project2;

public abstract class ReportExportCreator {
    // factory Method
    protected abstract ReportExporter createExporter();
    public void exportReport(String reportDate){
        System.out.println("Starting report export ....");
        ReportExporter reportExporter = createExporter();
        reportExporter.export(reportDate);
    }

}
