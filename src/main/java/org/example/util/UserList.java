package org.example.util;

import org.example.model.User;
import org.example.service.TextReading;

import java.util.ArrayList;
import java.util.Scanner;

public class UserList {

    public void Task(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();

        boolean run = true;

        while (run){
            System.out.println("[1] Cadastrar usuário");
            System.out.println("[2] Listar todos usuários");
            System.out.println("[3] Procurar usuário por e-mail");
            System.out.println("[4] Atualizar dados");
            System.out.println("[5] Remover usuário");
            System.out.println("[6] Criar um arquivo de texto");
            System.out.println("[7] Ler arquivo de texto");
            System.out.println("[8] Sair");
            System.out.print("Digite a opção: ");
            String opcao = scanner.nextLine();

            switch (opcao){
                case "1": {
                    System.out.println("==== CADASTRO DE USUÁRIO ====");
                    System.out.println("Digite um e-mail: ");
                    String email = scanner.nextLine();
                    System.out.println("Digite uma senha: ");
                    String key = scanner.nextLine();
                    User user = new User();
                    user.setEmail(email);
                    user.setKey(key);

                    users.add(user);
                    break;
                }
                case "2": {
                    System.out.println("==== LISTA DE USUÁRIOS ====");
                    for (int i = 0; i < users.size(); i++){

                        User uTemp = users.get(i);
                        System.out.println("Usuário: " + i);
                        System.out.println("\tEmail: " + users.get(i).getEmail());
                    }
                    break;
                }
                case "3": {
                    System.out.println("==== BUSCA POR USUÁRIO ====");
                    System.out.println("Digite o e-mail: ");
                    String email = scanner.nextLine();

                    boolean userView = false;
                    for (int i = 0; i < users.size(); i++){

                        User uTemp = users.get(i);

                        if (email.equals(uTemp.getEmail())){
                            System.out.println("Usuário encontrado");
                            System.out.println("\tE-mail: " + uTemp.getEmail());
                            System.out.println("\tSenha: " + uTemp.getKey());
                            userView = true;
                            break;
                        }
                    }

                    if (!userView){
                        System.out.println("Usuário não encontrado!");
                    }

                    break;
                }
                case "4": {
                    System.out.println("==== ATUALIZAR DADOS ====");

                    for (int i = 0; i < users.size(); i++){
                            User uTemp = users.get(i);

                        System.out.println("[" + i + "]"  + uTemp.getEmail());
                    }

                    System.out.println("Digite o valor de referência: ");
                    int referencia = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite um novo e-mail: ");
                    String newEmail = scanner.nextLine();
                    System.out.println("Digite uma nova senha: ");
                    String newKey = scanner.nextLine();

                    User user = users.get(referencia);
                    user.setEmail(newEmail);
                    user.setKey(newKey);
                    break;
                }
                case "5": {
                    System.out.println("==== REMOVER USUÁRIO ====");

                    for (int i = 0; i < users.size(); i++){
                        User uTemp = users.get(i);

                        System.out.println("[" + i + "]"  + uTemp.getEmail());
                    }

                    System.out.println("Digite o valor de referência: ");
                    int referencia = scanner.nextInt();
                    scanner.nextLine();

                    users.remove(referencia);
                    break;
                }
                case "6": {
                    TextReading textReading = new TextReading();
                    textReading.Create();
                    break;
                }
                case "7": {
                    TextReading textReading = new TextReading();
                    textReading.Reading();
                    break;
                }
                case "8": {
                    run = false;
                    break;
                }
            }
        }
    }
}
