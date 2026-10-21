package systemDesign.Factory.project2;

public class JsonExportCreator extends ReportExportCreator{
    @Override
    protected ReportExporter createExporter() {
        return new JsonExporter();
    }
}
