package com.neoteric.java_29102024.intefacepractice;

public class PdfAccountSummary implements  ExportAccountSummary{


    @Override
    public String export(AccountSummary accountSummary) {
        System.out.println("Export to  pdf is done");
        return "Data Export to Pdf is done ";
    }


}
