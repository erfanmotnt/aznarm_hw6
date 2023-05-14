package builder;

public class FemaleBuilder implements Builder {

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

    public Female getResult() {
        return new Female(name, sex);
    }
}
