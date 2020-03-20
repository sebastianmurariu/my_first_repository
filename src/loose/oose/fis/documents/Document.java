package loose.oose.fis.documents;

public abstract class Document {
    protected String[] continut;

    public Document(String[] continut1) {
        this.continut = continut1;
    }

    public abstract String[] analizeaza();

    @Override
    public String toString() {
        String res = "";
        for (String cuvant : continut) {
            res += cuvant + " ";
        }
        return res;
    }
}
