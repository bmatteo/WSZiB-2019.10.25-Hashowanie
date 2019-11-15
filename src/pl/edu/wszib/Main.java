package pl.edu.wszib;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // baza danych
        String user = "admin";
        String pasword = "127e2df1a55efd71321832c5739e9d47";
        String bean = "Ni6ZhQQsBddkgV8gMA6Y";

        System.out.println("Logowanie !!");
        System.out.println("Podaj login:");

        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();

        System.out.println("Podaj hasło:");
        String haslo = scanner.nextLine();

        String hash = DigestUtils.md5Hex(haslo + bean);

        if(hash.equals(pasword)) {
            System.out.println("Jest ok !!");
        } else {
            System.out.println("Złe hasło !!");
        }
    }
}
