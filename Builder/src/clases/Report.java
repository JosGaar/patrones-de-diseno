package clases;

/**
 *
 * @author Josue
 */

// Product
public class Report {

    private String header;
    private String content;
    private String footer;

    public Report(String header, String content, String footer) {
        this.header = header;
        this.content = content;
        this.footer = footer;
    }

    public void display() {
        System.out.println("Header: " + header);
        System.out.println("Content: " + content);
        System.out.println("Footer: " + footer);
    }

    public String getHeader() {
        return header;
    }

    public String getContent() {
        return content;
    }

    public String getFooter() {
        return footer;
    }
}
