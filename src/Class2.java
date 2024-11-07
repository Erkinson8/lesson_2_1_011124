public class Class2 extends Class1 {
    private String name;

    public Class2(int id, ComplexField complexField, SomeEnum type, String name) {
        super(id, complexField, type);
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void displayInfo() {
        System.out.println("Class2: ID = " + getId() + ", Name = " + name);
    }

    public void displayInfo(String additionalInfo) {
        System.out.println("Class2: ID = " + getId() + ", Name = " + name + ", Info = " + additionalInfo);
    }

    public final void finalMethod() {
        System.out.println("This is a final method in Class2.");
    }
}