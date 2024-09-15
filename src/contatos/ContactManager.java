package contatos;

import java.util.Scanner;

public class ContactManager {
	 public static void main(String[] args) {
	        ContactList contactList = new ContactList();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\nMenu:");
	            System.out.println("1. Adicionar Contato");
	            System.out.println("2. Buscar Contato");
	            System.out.println("3. Remover Contato");
	            System.out.println("4. Listar Contatos");
	            System.out.println("5. Sair");
	            System.out.print("Escolha uma opção: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (choice) {
	                case 1:
	                    System.out.print("Nome: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Telefone: ");
	                    String phone = scanner.nextLine();
	                    System.out.print("Email: ");
	                    String email = scanner.nextLine();
	                    contactList.addContact(new Contact(name, phone, email));
	                    break;
	                case 2:
	                    System.out.print("Nome ou Telefone para Buscar: ");
	                    String searchTerm = scanner.nextLine();
	                    Contact foundContact = contactList.searchContact(searchTerm);
	                    if (foundContact != null) {
	                        System.out.println("Contato encontrado: " + foundContact);
	                    } else {
	                        System.out.println("Contato não encontrado.");
	                    }
	                    break;
	                case 3:
	                    System.out.print("Nome ou Telefone para Remover: ");
	                    String removeTerm = scanner.nextLine();
	                    contactList.removeContact(removeTerm);
	                    break;
	                case 4:
	                    contactList.listContacts();
	                    break;
	                case 5:
	                    System.out.println("Saindo...");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Opção inválida.");
	            }
	        }
	    }
}
