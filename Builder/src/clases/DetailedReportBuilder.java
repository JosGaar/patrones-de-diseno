package clases;

/**
 *
 * @author Josue
 */

// ConcreteBuilderB - Construye un informe en formato detallado
public class DetailedReportBuilder implements IReportBuilder {

    private Report report;

    public DetailedReportBuilder() {
        this.report = new Report("", "", "");
    }

    @Override
    public void buildHeader() {
        report = new Report("Detailed Header", report.getContent(), report.getFooter());
    }

    @Override
    public void buildContent() {
        report = new Report(report.getHeader(), "Detailed Content", report.getFooter());
    }

    @Override
    public void buildFooter() {
        report = new Report(report.getHeader(), report.getContent(), "Detailed Footer");
    }

    @Override
    public Report getResult() {
        return report;
    }
}
