package clases;

/**
 *
 * @author Josue
 */

// Director - Construye un informe utilizando el Builder
public class ReportDirector {

    private IReportBuilder reportBuilder;

    public ReportDirector(IReportBuilder reportBuilder) {
        this.reportBuilder = reportBuilder;
    }

    public Report constructReport() {
        reportBuilder.buildHeader();
        reportBuilder.buildContent();
        reportBuilder.buildFooter();
        return reportBuilder.getResult();
    }
}
