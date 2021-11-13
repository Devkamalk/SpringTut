package maven_project.mavenhibernateproj;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class SumSeries {


	
/*	public static void printSeries(int a, int b, int n){
        int sum = a;
        for(int j=0;j<n;j++){
            sum = sum + (int)Math.pow(2, j)*b;
            System.out.print(sum+" ");
            
        }
    }*/
	
    public static void main( String[] args )
    {
    	//Scanner sc = new Scanner(System.in);
    	double pmnt = 111.22;
    	Locale locale = new Locale("en");
    	NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
    	NumberFormat frFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
    	NumberFormat cnFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
    	NumberFormat inFormat = NumberFormat.getCurrencyInstance(locale);
        System.out.println( "Hello World!" );
        System.out.println("US :"+usFormat.format(pmnt));
        System.out.println("fr :"+frFormat.format(pmnt));
        System.out.println("CN :"+cnFormat.format(pmnt));
        System.out.println("In :"+inFormat.format(pmnt));
        

        //printSeries(0,2,10);
    }


}
