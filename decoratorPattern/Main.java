package decoratorPattern;

public class Main {

    public static void main(String[] args) {
        Component KenyaAmericano = new BaseComponent("KenyaAmericano");
        System.out.println(KenyaAmericano.add());

        Component MilkKenyaAmericano = new MilkDecorator(new BaseComponent("KenyaAmericano"));
        System.out.println(MilkKenyaAmericano.add());

        Component MoChasyupMilkKenyaAmericano = new MochaSyrupDecorator(new MilkDecorator(new BaseComponent("KenyaAmericano")));
        System.out.println(MoChasyupMilkKenyaAmericano.add());
        
        Component MilkMoChasyupKenyaAmericano = new MilkDecorator(new MochaSyrupDecorator((new BaseComponent("KenyaAmericano"))));
        System.out.println(MilkMoChasyupKenyaAmericano.add());



        Component EriopiaAmericano = new WhippedCreamDecorator(new MochaSyrupDecorator(new MilkDecorator(new BaseComponent("EtiopiaAmericano"))));
        System.out.println(EriopiaAmericano.add());
        
        // Component americano = new WaterDecorator(new BaseComponent());
        // System.out.println("Americano : " + americano.add());
        
        // Component latte = new MilkDecorator(new WaterDecorator(new BaseComponent()));
        // System.out.println("Latte : " + latte.add());
    }
}