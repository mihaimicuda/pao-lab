package ro.unibuc.pao.homework2.adapter;

public class DocxReader implements DocumentReader {
    @Override
    public void readDocx(String path) {
        System.out.println("Reading docx at path:" + path);
    }

    @Override
    public void readRTF(String path) {
        System.out.println("Unsuported file format");
    }
}
