package clases;

/**
 *
 * @author Josue
 */

// Builder
public interface IReportBuilder {

    void buildHeader();

    void buildContent();

    void buildFooter();

    Report getResult();
}
