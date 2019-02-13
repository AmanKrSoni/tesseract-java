package com.cvt.tesseract;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;
import java.net.URL;
import java.util.Locale;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

    new App().getTesseractAsString();

    }

    void getTesseractAsString(){
        URL url=getClass().getResource("/data/eurotext.pdf");
        File file=new File(url.getPath());
        System.out.println(">> File Path :"+file.getAbsolutePath());



        Tesseract tesseract=new Tesseract();

        try {
            String s=tesseract.doOCR(file);
            System.out.println("Text >>>>");
            System.out.println(s);
        } catch (TesseractException e) {
            e.printStackTrace();
        }
    }
}
