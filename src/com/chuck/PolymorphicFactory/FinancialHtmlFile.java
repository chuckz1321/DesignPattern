package com.chuck.PolymorphicFactory;

public class FinancialHtmlFile implements ExportFile {
    @Override
    public boolean export(String data) {
        return false;
    }
}
