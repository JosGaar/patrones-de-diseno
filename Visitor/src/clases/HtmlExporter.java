package clases;

/**
 *
 * @author Josue
 */

// ConcreteVisitor
public class HtmlExporter implements DocumentVisitor {

    private StringBuilder htmlContent = new StringBuilder();

    @Override
    public void visitParagraph(Paragraph paragraph) {
        htmlContent.append("<p>").append(paragraph.getContent()).append("</p>\n");
    }

    @Override
    public void visitImage(Image image) {
        htmlContent.append("<img src=\"").append(image.getImageSrc()).append("\"/>\n");
    }

    @Override
    public void visitTable(Table table) {
        htmlContent.append("<table><tr><td>").append(table.getTableData()).append("</td></tr></table>\n");
    }

    public String getHtmlContent() {
        return htmlContent.toString();
    }
}
