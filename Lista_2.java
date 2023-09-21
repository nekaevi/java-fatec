//1
import java.util.Scanner;
import java.util.Random;
public class Main
{
  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);
    Random rand = new Random();

    int[] aleatorios = new int[10];
    for(int c=0; c<=9 ;c++)
    {
        aleatorios[c] = rand.nextInt(100);
    }

    for(int c=0; c<=9 ;c++){
        if(aleatorios[c]%2 == 0)
        {
            System.out.println(aleatorios[c]);
        }
    }
  }
}

//2
import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(100) + 1;
        
        Scanner scanner = new Scanner(System.in);
        int palpite;

        do {
            System.out.print("Adivinhe um número entre 1 e 100: ");
            palpite = scanner.nextInt();
            
            if (palpite > numeroAleatorio) {
                System.out.println("Muito alto!");
            } else if (palpite < numeroAleatorio) {
                System.out.println("Muito baixo!");
            } else {
                System.out.println("Parabéns! Você acertou!");
            }
        } while (palpite != numeroAleatorio);
        
        scanner.close();
    }
}

//3
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[20];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100); // Gera um número aleatório entre 0 e 100
            sum += array[i];
        }

        
        double average = (double) sum / array.length;

        System.out.println("A média é: " + average);
    }
}

//4
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[15];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

         aleatórios e encontra o maior e o menor número
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100); // Gera um número aleatório entre 0 e 100
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        
        System.out.println("O maior número é: " + max);
        System.out.println("O menor número é: " + min);
    }
}



//5
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[30];
        int countOdds = 0;
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                countOdds++;
            }
        }

        System.out.println("Número de números ímpares no array: " + countOdds);
    }
}

//6
import java.util.Random;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // Gere números aleatórios entre 0 e 99
        }

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        
        System.out.println("Array revertido:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}


//7
import java.util.Random;

public class FrequenciaNumeros {
    public static void main(String[] args) {
        
        int[] numeros = new int[50];
        int[] frequencias = new int[11]; // 11 pois o array vai de 1 a 10

       
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(10) + 1; 
            frequencias[numeros[i]]++; 
        }

        for (int i = 1; i < frequencias.length; i++) {
            System.out.println(i + " ocorreu " + frequencias[i] + " vez(es)");
        }
    }
}

//8


//9
import java.util.Scanner;

public class RandomNumberSearch {
    public static void main(String[] args) {
        int[] randomNumbers = new int[25];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 100 + 1);
        }

        System.out.println("Números gerados:");
        for (int number : randomNumbers) {
            System.out.print(number + " ");
        }

        System.out.println("\nInsira um número para verificar se está no array:");
        int searchNumber = scanner.nextInt();

        boolean found = false;
        for (int number : randomNumbers) {
            if (number == searchNumber) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("O número " + searchNumber + " foi encontrado no array.");
        } else {
            System.out.println("O número " + searchNumber + " não foi encontrado no array.");
        }
    }
}

//10
public class DiceSimulation {
    public static void main(String[] args) {
        int count = 0;
        int totalRolls = 100;

        for (int i = 0; i < totalRolls; i++) {
            int dice1 = (int) (Math.random() * 6 + 1);
            int dice2 = (int) (Math.random() * 6 + 1);
            int sum = dice1 + dice2;

            if (sum == 7) {
                count++;
            }
        }

        System.out.println("A soma de 7 ocorreu " + count + " vezes.");
    }
}