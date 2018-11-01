package com.chuck.PolymorphicFactory;

public class ExportPdfFactory implements ExportFactory {
    @Override
    public ExportFile factory(String type) {
        if("standard".equals(type)){
            return new StandardPdfFile();
        }else if("Finance".equals(type)){
            return new FinancialPdfFile();
        }else{
            throw new RuntimeException("No such class");
        }
    }
}
