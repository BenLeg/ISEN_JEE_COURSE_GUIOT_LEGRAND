package yncrea.lab01.model;

public class Pharmacist {
    private String pharmacistId;
    private String pharmacistPassword;

    public Pharmacist(String pharmacistId, String pharmacistPassword) {
        this.pharmacistId = pharmacistId;
        this.pharmacistPassword = pharmacistPassword;
    }

    public String getPharmacistId() {
        return pharmacistId;
    }

    public void setPharmacistId(String pharmacistId) {
        this.pharmacistId = pharmacistId;
    }

    public String getPharmacistPassword() {
        return pharmacistPassword;
    }

    public void setPharmacistPassword(String pharmacistPassword) {
        this.pharmacistPassword = pharmacistPassword;
    }
}
