package com.neoteric.java_29102024.intefacepractice;

public class PolymorphismWithInterfaceTest {
    public static void main (String args[] ){

     ExportAccountSummary excelPdfAccountSummary = new PdfAccountSummary();
     excelPdfAccountSummary.export(new AccountSummary());
     ExportAccountSummary pdfAccountSummary =new ExcelAccountSummary();
     pdfAccountSummary.export(new AccountSummary());

    }
}
