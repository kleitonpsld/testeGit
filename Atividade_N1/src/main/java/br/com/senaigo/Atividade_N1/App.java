package br.com.senaigo.Atividade_N1;

import java.awt.Color;

import org.joda.time.LocalTime;

import ij.IJ;
import ij.ImagePlus;
import ij.process.ImageProcessor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ImagePlus imp = IJ.openImage("D:\\Faculdade\\Periodos\\4 Periodo\\teste\\Lighthouse.jpg");
    	ImageProcessor ip = imp.getProcessor();
    	ip.setColor(Color.YELLOW);
    	ip.setLineWidth(4);
    	ip.drawRect(10, 10, imp.getWidth() - 20, imp.getHeight() - 20);
    	imp.show();
    }
    public LocalTime getHorario() {
    	LocalTime currentTime = new LocalTime();
    	System.out.println("The current local time is: " + currentTime.toString());
    	return currentTime;
    }
}
