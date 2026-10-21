package systemDesign.Factory.project2;

public class CsvExportCreator extends ReportExportCreator{
    @Override
    protected ReportExporter createExporter() {
        return new CsvExporter();
    }
}
