package com.chuck.PolymorphicFactory;

public class StandardHtmlFile implements ExportFile {
    @Override
    public boolean export(String data) {
        return false;
    }
}
