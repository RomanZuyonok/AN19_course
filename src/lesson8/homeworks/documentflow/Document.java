package lesson8.homeworks.documentflow;

import java.util.Date;

public abstract class Document {

    private int numberDoc;

    private Date dateDoc;

    public Document() {
    }

    public Document(int numberDoc, Date dateDoc) {
        this.numberDoc = numberDoc;
        this.dateDoc = dateDoc;
    }

    public int getNumberDoc() {
        return numberDoc;
    }

    public Date getDateDoc() {
        return dateDoc;
    }

    @Override
    public String toString() {
        return "Document{" +
                "numberDoc=" + numberDoc +
                ", dateDoc=" + dateDoc +
                '}';
    }
}
