package builder;

public class Director {

    public void constructMale(Builder builder) {
        builder.setName("Ali");
        builder.setSex('M');
    }


    public void constructFemale(Builder builder) {
        builder.setName("Maryam");
        builder.setSex('F');
    }
}
