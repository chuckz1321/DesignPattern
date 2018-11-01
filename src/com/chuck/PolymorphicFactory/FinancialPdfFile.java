package com.chuck.PolymorphicFactory;

public class FinancialPdfFile implements ExportFile {
    @Override
    public boolean export(String data) {
        return false;
    }
}
