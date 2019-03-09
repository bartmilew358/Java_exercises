package pl.sda.coinpo.Car.ToolsShop;

public class ToolsShop {

    public static void main(String[] args) {

        Tool mlotek1 = new Hammer("mlot_1", 199,30);
        System.out.println(mlotek1);
        Tool pila1 = new Saw("saw_1", 299,24);
        System.out.println(pila1);

        System.out.println("Cena no2: " + pila1.getPrice());

        System.out.println("*******************************************");
        System.out.println("Za pomocą tablicy.");
        
        Tool[] tools = {mlotek1,pila1};
//        Tool[] tools = new Tool[2];

        for (int i = 0; i < tools.length; i++) {
            Tool tool = tools[i];
            System.out.println(tool.getDetails());
        }
    }
}
