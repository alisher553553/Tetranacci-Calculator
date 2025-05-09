import java.io.BufferedWriter;
import java.io.FileWriter;

public class Tetranacci {
	public static long multiplerecursion(long k) {
		long tetranacci;
		if( k == 0 || k == 1 ||k==2)
		{
			tetranacci = 0;
		}
		else if(k==3||k==4) {
			tetranacci=1;
		}
		
		
		
		
		else
		{
			return tetranacci = multiplerecursion(k-1) + multiplerecursion(k-2)+multiplerecursion(k-3)+multiplerecursion(k-4);
		}
		
				
		
		return tetranacci;
	}
		
		
		
	public static long[] tailRecursivetetranacci(long k, long i, long j, long m,long d) {
        if (k == 0) {
            return new long[]{i};
        }
        if (k == 1) {
            return new long[]{j};
        }
        if (k == 2) {
            return new long[]{m};
        }
        if (k == 3) {
            return new long[]{d};
        }
        
        return tailRecursivetetranacci(k - 1, j , m,d,i+j+m+d);

	}
	
	
	
	public static void main(String[] args) {
		try {
			BufferedWriter	write = new BufferedWriter(new FileWriter("C:\\Users\\alish\\eclipse-workspace\\Comp352Assignment1\\src\\tetra.txt",false));

				for (int i=5;i<=35;i+=5) {
					
					long starttime=System.nanoTime();				
					long []	result =tailRecursivetetranacci(i,0,0,0,1)	;	
				long endtime=System.nanoTime()	;
				write.write("tetranacci (" + i + ") is " + result[0] + " \n")	;		
				write.flush();
				
				}
				System.out.println();
				write.write("THIS MULTIPLE RECURSION\n");
				
				 for(long j=5;j<=35;j+=5) {
						long starttime=System.nanoTime();				
						long endtime=System.nanoTime()	;

						long tetranaccivalue = multiplerecursion(j);	
						write.write(" The tetranacci (" + j + ") is: "  +"value "+tetranaccivalue+"\n");
						
						write.flush();
				 }
						
					
				
				write.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}			

			try {
				BufferedWriter	time = new BufferedWriter(new FileWriter("C:\\Users\\alish\\eclipse-workspace\\Comp352Assignment1\\src\\Duration.txt",false));
				time.write("This is linear recursion\n");
					for (int i=5;i<=35;i+=5) {
						
						long starttime=System.nanoTime();				
						long []	result =tailRecursivetetranacci(i,0,0,0,1)	;	
					long endtime=System.nanoTime()	;
					time.write(" Duration of tetranacci  "+i+" is " + (endtime - starttime) + " ns\n");
			time.flush();
				
					}
					System.out.println();
					
					time.write(" This is multiple recursive version\n");
					 for(long j=5;j<=35;j+=5) {
							long starttime=System.nanoTime();				

							long tetranaccivalue = multiplerecursion(j);	
							long endtime=System.nanoTime()	;

							time.write(" Duration of tetranacci  "+j+" is " + (endtime - starttime) + " ns\n");
		                time.flush();
					 }
							
						
		                time.close();

					
				}catch(Exception e) {
					e.printStackTrace();
				}			
		
			
	 }
		
	}
