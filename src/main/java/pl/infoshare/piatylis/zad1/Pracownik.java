package pl.infoshare.piatylis.zad1;

import java.time.LocalDate;

public class Pracownik {
    private LocalDate dateOfBirth;
    private String name;
    private String lastName;
    private String department;

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }
}
