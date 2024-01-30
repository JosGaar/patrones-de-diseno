package clases;

/**
 *
 * @author Josue
 */

// Cliente
public class ReportClient {

    public static void main(String[] args) {
        // Construir e imprimir un informe simple
        IReportBuilder simpleBuilder = new SimpleReportBuilder();
        ReportDirector simpleDirector = new ReportDirector(simpleBuilder);
        Report simpleReport = simpleDirector.constructReport();
        simpleReport.display();

        System.out.println();

        // Construir e imprimir un informe detallado
        IReportBuilder detailedBuilder = new DetailedReportBuilder();
        ReportDirector detailedDirector = new ReportDirector(detailedBuilder);
        Report detailedReport = detailedDirector.constructReport();
        detailedReport.display();
    }
}
