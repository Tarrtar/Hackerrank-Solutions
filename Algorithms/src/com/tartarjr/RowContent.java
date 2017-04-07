package com.tartarjr;

/**
 * Created by musta on 4/7/2017.
 */
public class RowContent {

    private String name;
    private String subDomain;
    private String solution;

    public RowContent() {

    }

    public RowContent(String name, String subDomain, String solution) {
        this.name = name;
        this.subDomain = subDomain;
        this.solution = solution;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubDomain() {
        return subDomain;
    }

    public void setSubDomain(String subDomain) {
        this.subDomain = subDomain;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }
}
