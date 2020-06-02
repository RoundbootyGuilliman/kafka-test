package app.config;

public class AbstractDto {

    private String value;

    public AbstractDto() {
    }

    public AbstractDto(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
