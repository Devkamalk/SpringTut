package maven_project.mavenhibernateproj;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static void printSeries(int t, int a, int b, int n,int i){
        int sum = a;
        for(int j=0;j<n;j++){
            sum = sum + (2^i)*b;
            System.out.println(sum);
            
        }
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        printSeries(1,1,1,1,1);
    }
}
