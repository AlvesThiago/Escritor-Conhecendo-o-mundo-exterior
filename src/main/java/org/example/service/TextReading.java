package org.example.service;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class TextReading {

    public void Create(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== GERANDO ARQUIVO [ TXT ] ====");
        System.out.print("Digite o texto que deseja: ");
        String text = scanner.nextLine();

        try {
            FileWriter fileWriter;
            fileWriter = new FileWriter("arq.txt", true);
            fileWriter.write(text);
            fileWriter.close();

        }catch (Exception e){
            System.out.println("Erro! " + e.getMessage());
        }


}

    public void Reading(){

            System.out.println("==== GERANDO ARQUIVO [ TXT ] ====");
            System.out.println(".............. Lendo o arquivo: ");
            System.out.println("Conteúdo do arquivo: ");
            System.out.println(" ");

            try {
                FileReader fileReader;
                fileReader = new FileReader("arq.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line = bufferedReader.readLine();
                while (line !=null){
                    System.out.println(line);
                    line = bufferedReader.readLine();
                }

            }catch (Exception e){
                System.out.println("Erro! " + e.getMessage());
            }
        }
    }


