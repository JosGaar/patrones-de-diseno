package clases;

/**
 *
 * @author Josue
 */

// ConcreteBuilderA - Construye un informe en formato simple
public class SimpleReportBuilder implements IReportBuilder {

    private Report report;

    public SimpleReportBuilder() {
        this.report = new Report("", "", "");
    }

    @Override
    public void buildHeader() {
        report = new Report("Simple Header", report.getContent(), report.getFooter());
    }

    @Override
    public void buildContent() {
        report = new Report(report.getHeader(), "Simple Content", report.getFooter());
    }

    @Override
    public void buildFooter() {
        report = new Report(report.getHeader(), report.getContent(), "Simple Footer");
    }

    @Override
    public Report getResult() {
        return report;
    }
    
    
}
