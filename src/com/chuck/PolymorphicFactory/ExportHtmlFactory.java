package com.chuck.PolymorphicFactory;

public class ExportHtmlFactory implements ExportFactory {
    @Override
    public ExportFile factory(String type) {
        if("standard".equals(type)){
            return new StandardHtmlFile();
        }else if("Finance".equals(type)){
            return new FinancialHtmlFile();
        }else{
            throw new RuntimeException("No such class");
        }
    }
}
