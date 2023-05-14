package builder;

public class MaleBuilder implements Builder {

    private String name;
    private char sex;
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSex(char s) {
        this.sex = s;
    }

    public Male getResult() {
        return new Male(name, sex);
    }
}
