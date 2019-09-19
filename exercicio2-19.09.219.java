public class Main
{
	public static void main(String[] args) {

            int A, B, C;      
            int H, L;         
            
            A=20; B=22; C=5; //Valores de teste
            H=20; L=10;      //Valores de teste
            
            boolean passaPelaJanela = false;
            if(
                    (A <= H && B <= L) || (B <= H && C <= L) || (C <= H && A <= L) ||
                    (B <= H && A <= L) || (C <= H && B <= L) || (A <= H && C <= L)
               ){
                    passaPelaJanela= true;
                };
            
            if ( passaPelaJanela==true ){    
                                            System.out.println("S");
                                        }else{
                                            System.out.println("N");
                                        };	
		
	}
}
