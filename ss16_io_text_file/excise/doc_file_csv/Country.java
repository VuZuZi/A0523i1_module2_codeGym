package ss16_io_text_file.excise.doc_file_csv;

public class Country {
    private int id;
    private String code;
    private String nameC;

    public Country() {
    }

    public Country(int id, String code, String nameC) {
        this.id = id;
        this.code = code;
        this.nameC = nameC;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNameC() {
        return nameC;
    }

    public void setNameC(String nameC) {
        this.nameC = nameC;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + nameC + '\'' +
                '}';
    }
}
