package controle;

import java.util.Scanner;

import javax.jws.WebMethod;
import javax.jws.WebService;
@WebService
public class EchoCPF {
	   @WebMethod
		 public void CPF(){ 
		        String cpf;
		   		int posicao1, posicao2,posicao3,posicao4,posicao5,posicao6,posicao7,posicao8,posicao9,posicao10,posicao11;
		        int dig1,dig2,gambi, gambi2,t;
		                
		        Scanner leia = new Scanner(System.in);
		        do
		        {
		            System.out.println("Digite o CPF no formato: xxxxxxxxxxx");
		            cpf = leia.nextLine();
		            
		            if(("00000000000".equals(cpf))|| ("11111111111".equals(cpf)) || ("22222222222".equals(cpf)) || ("33333333333".equals(cpf))|| ("44444444444".equals(cpf))|| ("55555555555".equals(cpf))|| ("66666666666".equals(cpf))|| ("77777777777".equals(cpf))|| ("88888888888".equals(cpf))|| ("99999999999".equals(cpf)))
		            {
		                t=1;
		                System.out.println("CPF invalido");
		                System.out.println("____________________________________");
		            }
		            else
		            {
		                t=0;
		            
		                posicao1 = Integer.parseInt(cpf.substring(0, 1));
		                posicao2 = Integer.parseInt(cpf.substring(1, 2));
		                posicao3 = Integer.parseInt(cpf.substring(2, 3));
		                posicao4 = Integer.parseInt(cpf.substring(3, 4));
		                posicao5 = Integer.parseInt(cpf.substring(4, 5));
		                posicao6 = Integer.parseInt(cpf.substring(5, 6));
		                posicao7 = Integer.parseInt(cpf.substring(6, 7));
		                posicao8 = Integer.parseInt(cpf.substring(7, 8));
		                posicao9 = Integer.parseInt(cpf.substring(8, 9));
		                posicao10 = Integer.parseInt(cpf.substring(9, 10));
		                posicao11 = Integer.parseInt(cpf.substring(10, 11));
		                dig1= ((posicao1*10)+(posicao2*9)+(posicao3*8)+(posicao4*7)+(posicao5*6)+(posicao6*5)+(posicao7*4)+(posicao8*3)+(posicao9*2));
		                gambi =11-(dig1%11);
		            
		                if (gambi > 9)
		                {
		                    gambi = 0;
		                }
		                    dig2= ((posicao1*11)+(posicao2*10)+(posicao3*9)+(posicao4*8)+(posicao5*7)+(posicao6*6)+(posicao7*5)+(posicao8*4)+(posicao9*3)+(gambi*2));
		                    gambi2 = 11 -(dig2%11);
		                if (gambi2 > 9)
		                {
		                    gambi2 = 0;
		                }
		                if (posicao10 + posicao11 != (gambi) + (gambi2))
		                {
		                    t=2;
		                    System.out.println("CPF inválido");
		                    System.out.println("____________________________________");
		                }
		            } 
		        } while (t==1 ||t==2);
		        //} while (posicao10 + posicao11 != (gambi) + (gambi2));
		            System.out.println("CPF Válido");
		            System.out.println("____________________________________");
		    }

}
