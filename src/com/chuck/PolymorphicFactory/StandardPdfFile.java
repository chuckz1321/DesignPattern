package com.chuck.PolymorphicFactory;

public class StandardPdfFile implements ExportFile {
    @Override
    public boolean export(String data) {
        return false;
    }
}
