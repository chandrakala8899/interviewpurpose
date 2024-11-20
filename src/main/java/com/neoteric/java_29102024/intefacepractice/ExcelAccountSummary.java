package com.neoteric.java_29102024.intefacepractice;

public class ExcelAccountSummary implements EditExportAccountSummary{
    @Override
    public String export(AccountSummary accountSummary) {
        System.out.println("Export to Excel is done");
        return " Data Export is done";
    }

    @Override
    public void edit(AccountSummary accountSummary) {

    }


}
