package 제네릭프린터;

public class GenericMainEx {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(new Powder());
        Powder powder = powderPrinter.getMaterial();
//        System.out.println(powder.toString());
//        powder.doPrinting();
        powderPrinter.printing();

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial();
//        System.out.println(plastic.toString());
//        plastic.doPrinting();
        plasticPrinter.printing();

        GenericPrinter<Nylon> nylonPrinter = new GenericPrinter<>();
        nylonPrinter.setMaterial(new Nylon());
//        Nylon nylon = nylonPrinter.getMaterial();
//        System.out.println(nylon.toString());
//        nylon.doPrinting();
        nylonPrinter.printing();
    }
}
