public class Main
{
	public static void main(String[] args) {
	    
    int monica = 52; //Idade da Monica
    int A = 14;  //Idade filho A
    int B = 18;  //Idade filho B
    int C;      //Idade filho C ???
	    
	    C = monica - ( A + B );
	    
	    int MaiorIdadeFilhos=0; String QualMaisVelhos= "";
	    
	    if( A>B && A>C ){ MaiorIdadeFilhos=A; QualMaisVelhos= "A"; };
	    if( B>A && B>C ){ MaiorIdadeFilhos=B; QualMaisVelhos= "B"; };
	    if( C>A && C>B ){ MaiorIdadeFilhos=C; QualMaisVelhos= "C"; };
	    
		System.out.println("Idade do terceiro filho é: " + C + " anos)");
		System.out.println("O filho mais velho é o : " + QualMaisVelhos );
		System.out.println("O filho mais velho tem ( " + MaiorIdadeFilhos + " anos )");
		
	}
}
