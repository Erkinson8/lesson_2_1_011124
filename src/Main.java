public class Main {
    public static void main(String[] args) {
        ComplexField complexField = new ComplexField("Detailed description");

        Class2 objectA = new Class2(1, complexField, SomeEnum.TYPE1, "Object A");
        Class3 objectB = new Class3(2, complexField, SomeEnum.TYPE2, "Object B");
        Class3 objectC = new Class3(3, complexField, SomeEnum.TYPE3, "Object C");

        objectA.displayInfo();
        objectA.displayInfo("Additional info for Object A");
        objectA.finalMethod();

        objectB.displayInfo();
        objectC.displayInfo();
    }
}