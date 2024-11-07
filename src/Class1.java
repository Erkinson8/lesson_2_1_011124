// Class1.java
public class Class1 {
    private int id;
    private ComplexField complexField;
    private SomeEnum type;

    public Class1(int id, ComplexField complexField, SomeEnum type) {
        this.id = id;
        this.complexField = complexField;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public ComplexField getComplexField() {
        return complexField;
    }

    public SomeEnum getType() {
        return type;
    }
}