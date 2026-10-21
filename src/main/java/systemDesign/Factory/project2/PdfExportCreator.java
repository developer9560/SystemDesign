package systemDesign.Factory.project2;

public class PdfExportCreator extends ReportExportCreator{
    @Override
    protected ReportExporter createExporter() {
        return  new PdfExporter();
    }
}
