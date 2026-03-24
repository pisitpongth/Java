package JavaTNI.LabSheet.LabSheet09.src;

public class Author {
    private String name;
    private String nationality;
    private int birthyear;

    public Author(String name, String nationality, int birthyear) {
        this.name = name;
        this.nationality = nationality;
        this.birthyear = birthyear;
    }

    public Author(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
        this.birthyear = 0;
    }

    public Author(String name) {
        this.name = name;
        this.nationality = "Unknown";
        this.birthyear = 0;
    }

    public Author() {
        this.name = "Unknown";
        this.nationality = "Unknown";
        this.birthyear = 0;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public int getBirthYear() {
        return birthyear;
    }

    public String showAuthorInfo() {
        if (nationality.equals("Unknown") && birthyear == 0) {
            return name;
        } else if (birthyear == 0) {
            return name + " (" + nationality + ")";
        } else {
            return name + " (" + nationality + ", " + birthyear + ")";
        }
    }
}