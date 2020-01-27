package yncrea.lab01.model;

public class Drug {

    private String name;

    private String lab;


    public Drug(final String name, final String lab) {
        this.name = name;
        this.lab = lab;
    }


    public String getName() {
        return name;
    }


    public void setName(final String nameValue) {
        name = nameValue;
    }


    public String getLab() {
        return lab;
    }


    public void setLab(final String labValue) {
        lab = labValue;
    }
}
