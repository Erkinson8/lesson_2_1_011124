public final class Class3 extends Class2 {
    public Class3(int id, ComplexField complexField, SomeEnum type, String name) {
        super(id, complexField, type, name);
    }

    @Override
    public void displayInfo() {
        System.out.println("Class3: ID = " + getId() + ", Name = " + getName());
    }
}