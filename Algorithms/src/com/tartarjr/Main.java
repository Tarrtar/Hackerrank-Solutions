package com.tartarjr;

public class Main {

    public static void main(String[] args) {

        String title = "Implementation";
        String[] columnNames = {"Problem", "Subdomain", "Solution"};

        GithubHelper.generateGithubReadMeFile(title, columnNames);
    }
}
