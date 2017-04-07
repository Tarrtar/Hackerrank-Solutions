package com.tartarjr;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by emuoztu on 3/30/2017.
 */
public class IO {

    private static final String PATH = "C:\\Development\\io.txt";

    public static List<Integer> readFile() {

        List<Integer> inputs = new ArrayList<>();

        BufferedReader br = null;
        FileReader fr = null;

        try {

            fr = new FileReader(PATH);
            br = new BufferedReader(fr);

            String sCurrentLine;

            br = new BufferedReader(new FileReader(PATH));

            while ((sCurrentLine = br.readLine()) != null) {
                String[] positions = sCurrentLine.split(" ");
                inputs.add(Integer.parseInt(positions[0]));
                inputs.add(Integer.parseInt(positions[1]));
            }

        } catch (IOException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }

                if (fr != null) {
                    fr.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return inputs;
    }

    public static List<String> readFile2() {

        List<String> inputs = new ArrayList<>();

        BufferedReader br = null;
        FileReader fr = null;

        try {

            fr = new FileReader(PATH);
            br = new BufferedReader(fr);

            String sCurrentLine;

            br = new BufferedReader(new FileReader(PATH));

            while ((sCurrentLine = br.readLine()) != null) {
                String[] positions = sCurrentLine.split(" ");
                inputs.add(sCurrentLine);
            }

        } catch (IOException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }

                if (fr != null) {
                    fr.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return inputs;
    }

    public static int readFirstLine() {
        String text = null;
        BufferedReader brTest = null;

        try {
            brTest = new BufferedReader(new FileReader(PATH));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            text = brTest.readLine();
        } catch (IOException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Integer.parseInt(text);
    }
}
