package yncrea.lab05.contract.dto;

public class CompanyDTO {

    private String name;


    public CompanyDTO() {
    }


    public CompanyDTO(final String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public void setName(final String nameValue) {
        name = nameValue;
    }


    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("CompanyDTO{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
