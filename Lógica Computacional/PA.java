import java.util.Scanner;
public class PA
{
    public static void main(String[] args)
{
        Scanner betor = new Scanner(System.in);
            System.out.println ("digite qual variável quer calcular:");
            System.out.println ("1 para An, 2 para A1, 3 para R, 4 para n");
        int resposta = betor.nextInt();
        //1
        if(resposta == 1){ //comparável a 1
            System.out.println ("Digite o valor de a1:");
            int a1 = betor.nextInt();
            System.out.println ("Digite o valor de R:");
            int r = betor.nextInt();
            System.out.println ("Digite o valor de n:");
            int n = betor.nextInt();
            int an = a1 + (n-1) *r;
            System.out.println ("O Resultado de An é:"+an);
        }
        //2
        else if(resposta == 2){//esle if = caso contrário, comparável a 2
            System.out.println ("Digite o valor de An:");
            int an = betor.nextInt();
            System.out.println ("Digite o valor de R:");
            int r = betor.nextInt();
            System.out.println ("Digite o valor de n:");
            int n = betor.nextInt();
            int a1 = an + (n-1) *r;
            System.out.println ("O Resultado de A1 é:"+a1);
        }
        //3
        else if(resposta == 3){//esle if = caso contrário, comparável a 3
            System.out.println ("Digite o valor de an:");
            int an = betor.nextInt();
            System.out.println ("Digite o valor de a1:");
            int a1 = betor.nextInt();
            System.out.println ("Digite o valor de n:");
            int n = betor.nextInt();
            int r = (an-a1)/(n-1)+1;
            System.out.println ("O Resultado de R é:"+r);
        }
        //4
        else if(resposta == 4){//esle if = caso contrário, comparável a 4
            System.out.println ("Digite o valor de an:");
            int an = betor.nextInt();
            System.out.println ("Digite o valor de a1:");
            int a1 = betor.nextInt();
            System.out.println ("Digite o valor de r:");
            int r = betor.nextInt();
            int n = ((an-a1)/r)+1;
            System.out.println ("O Resultado de N é:"+n);
        }
    }
}