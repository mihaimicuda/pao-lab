package ro.unibuc.pao.homework2.adapter;

public class FileAdapter implements FileReader {

    DocumentReader docreader;

    public FileAdapter(String type) {
        if (type.equalsIgnoreCase("docx"))
            docreader = new DocxReader();
        else if (type.equalsIgnoreCase("RTF"))
            docreader = new RTFReader();
    }

    @Override
    public void read(String type, String path) {
        if (type.equalsIgnoreCase("docx"))
            docreader.readDocx(path);
        else if (type.equalsIgnoreCase("RTF"))
            docreader.readRTF(path);
    }
}
