//1- 

import java.util.Scanner; 

public class Principal{ 

    public static void main(String[] args){ 

       

      Scanner ler = new Scanner(System.in); 

      int idade; 

       System.out.println("Digite uma idade "); 

       idade = ler.nextInt(); 

       if(idade<18){ 

           System.out.println("Menor de idade"); 

       }else if(idade>=18 && idade<60){ 

           System.out.println("Maior de idade"); 

       }else{ 

           System.out.println("Idosa"); 

       } 

        

       } 

} 

/////////////////////////////////// 

//2-  

Import java.util.Scanner; 

Public class Main 

{ 

  public static void main(String[] args) { 

    Scanner ler = new Scanner(System.in); 

 

  

 

    int soma = 0, a = 1; 

    System.out.println(“Digite um numero: “); 

    int num= ler.nextInt(); 

    for(int c=1; c<num ;c++) 

    { 

        soma += a; 

        a += 2; 

    } 

    System.out.println(“A soma dos impares é: “ + soma); 

  } 

} 

 

////////////////////////// 

//3- 

import java.util.Scanner; 

  

public class Main 
{ 
  public static void main(String[] args) { 
 
    Scanner ler = new Scanner(System.in); 

    String[] nm = new String[5]; 
    String outronm; 
 
    for(int c=1; c<4;c++) 
    { 
        System.out.println("Digite um nome: "); 
        nm[c] = ler.nextLine(); 
    } 
 
        System.out.println("Digite outro nome: "); 
        outronm= ler.nextLine(); 
         
        for(int c=1; c<4; c++){ 
            if(outronm.equals(nm[c])){ 
                System.out.println("Nomes igual encontrado " + outronm); 
            } 
        } 

  

  } 
}