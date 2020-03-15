package classes;

public interface CSV {
    String toCSV() throws Exception;
    void fromCSV(String str);
}
