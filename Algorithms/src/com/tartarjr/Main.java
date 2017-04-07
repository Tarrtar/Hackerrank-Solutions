package com.tartarjr;

public class Main {

    public static void main(String[] args) {

        String packageName = "Implementation";
        String title = "Implementation";
        String[] columnNames = {"Problem", "Solution"};

        GithubHelper.generateGithubReadMeFile(packageName, title, columnNames);
    }
}
