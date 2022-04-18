package ro.unibuc.pao.homework2.adapter;

import java.awt.*;

public class RTFReader implements DocumentReader {
    @Override
    public void readRTF(String path) {
        System.out.println("Reading RTF at path:" + path);
    }

    @Override
    public void readDocx(String path) {
        System.out.println("Unsuported file format");
    }
}
