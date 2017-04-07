package com.tartarjr;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by emuoztu on 4/7/2017.
 */
public class GithubHelper {

    private static final String FILE_PATH = "C:\\Development\\Hackerrank-Solutions\\README.md";
    private static final String RESOURCE_PATH = "C:\\Development\\Hackerrank-Solutions\\Algorithms\\src\\";
    private static final String LINK = "/Algorithms/src/";

    public static final String[] LOWER_CASE_WORDS = new String[]{"The", "At", "In", "On", "A", "An", "And"};

    //generates a github README.md file with title, explanation and table from given parameters
    public static void generateGithubReadMeFile(String title, String[] columnNames) {

        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            fw = new FileWriter(FILE_PATH);
            bw = new BufferedWriter(fw);

            //writing README.md title
            bw.write("# " + title);
            bw.newLine();
            bw.newLine();

            //generating strings for columns
            String columns = "| ";
            String columnIndicator = "| ";

            for (String columnName : columnNames) {
                columnIndicator += "--- |";
                columns += columnName + " |";
            }

            //writing column strings to file
            bw.write(columns);
            bw.newLine();
            bw.write(columnIndicator);
            bw.newLine();

            ////generating string for each row and writing it to file
            for (RowContent rowContent : getFileNames()) {
                bw.write("| " + rowContent.getName() + " | " + rowContent.getSubDomain() + " | " + "[" + rowContent.getSolution() + "]" + "(" + LINK + decapitalizeTheFirstLetter(rowContent.getSubDomain()) + "/" + rowContent.getSolution() + ") |");
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }

                if (fw != null) {
                    fw.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    // retrieve all file names from given path
    public static List<RowContent> getFileNames() {

        File dir = new File(RESOURCE_PATH);
        File[] listOfChildDirs = dir.listFiles();

        List<RowContent> fileNames = new ArrayList<>();

        for (int i = 0; i < listOfChildDirs.length; i++) {
            if (listOfChildDirs[i].isDirectory()) {
                File[] filesOfChild = listOfChildDirs[i].listFiles();

                for (int j = 0; j < filesOfChild.length; j++) {
                    if (filesOfChild[j].isFile()) {
                        fileNames.add(new RowContent(generateProblemName(filesOfChild[j].getName()), capitalizeTheFirstLetter(listOfChildDirs[i].getName()), filesOfChild[j].getName()));
                    }
                }
            }
        }

        return fileNames;
    }

    //generates the problem name from given class name
    public static String generateProblemName(String className) {
        String[] wordsOfJavaClass = className.split("\\.");
        String[] wordsOfProblem = wordsOfJavaClass[0].split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])");

        String problemName = "";

        for (int i = 0; i < wordsOfProblem.length; i++) {
            if (i == 0) {
                problemName += wordsOfProblem[i];
            } else {
                if (!Arrays.asList(LOWER_CASE_WORDS).contains(wordsOfProblem[i])) {
                    problemName += " " + wordsOfProblem[i];
                } else {
                    problemName += " " + decapitalizeTheFirstLetter(wordsOfProblem[i]);
                }
            }
        }

        return problemName;
    }

    private static String decapitalizeTheFirstLetter(String word) {
        return word.substring(0, 1).toLowerCase() + word.substring(1);
    }

    private static String capitalizeTheFirstLetter(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}
