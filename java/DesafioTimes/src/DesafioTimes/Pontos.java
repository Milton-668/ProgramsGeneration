package DesafioTimes;

public class Pontos
{

	public static void main(String[] args)
	{
				//PAULISTINHA
				// 0 - CORITHIANS, 1 - PALMEIRAS, 2 - SANTOS, 3 - SPFC
				// PONTOS - INTEIRO - 4
				// GANHA - 3 PONTOS
				// PERDE - 0 PONTO
				// EMPATA - 1 PONTO
				// FAÇA UM PROGRAMA QUE PEÇA SE O CADA TIME G-GANHOU, P-PERDEU
				// OU EMPATOU  EM 4 RODADAS, AO FINAL MOSTRA O NOME DE CADA TIME
				// E SEUS RESPECTIVOS PONTOS
				//CORINTHIANS - G-ganhou P-perdeu ou E-empatou [G/P/E]:
				// NO FINAL PEÇO AO USUÁRIO PARA ESCOLHER UM TIME PARA QUE SEJA
				// APRESENTAR O PLACAR
		
		Scanner leia = new Scanner(System.in);
		
		String times[] = new String[4];
		int pontos[] = new int[4];
		char resposta;
		//int rodada[] = new int[4];
		
		for(int x=0;x<4;x++)
		{
			System.out.println("RODADA"+(x+1));
			
			for(int y=0;y<4;y++)
			{
				System.out.println(times[y]+"Digite G-ganhou P-perdeu ou E-empatou [G/P/E]:\r\n");
				resposta = leia.next().charAt(0);
				
				
				if(resposta == 'G')
				{
					pontos[y]=pontos[y]+3;
				}
				else if(resposta == 'E')
				{
					pontos[y]=pontos[y]+1;
				}
				else if (resposta =='D')
				{
					pontos[y]=pontos[y]+0;
				}
				System.out.println("");
				
			}
			
			for(int z=0;z<4;z++)
			{
				System.out.println(times[z]+pontos[z]);
			}
			
		}
		
	}

}
