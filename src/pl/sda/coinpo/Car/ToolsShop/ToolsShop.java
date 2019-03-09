package pl.sda.coinpo.Car.ToolsShop;

public class ToolsShop {

    public static void main(String[] args) {

        Tool no1 = new Hammer("mlot_1", 199,30);
        System.out.println(no1);
        Tool no2 = new Saw("saw_1", 299,24);
        System.out.println(no2);

        System.out.println("Cena no2: " + no2.getPrice());

        System.out.println("*******************************************");
        System.out.println("Za pomocą tablicy.");
        
        Tool[] tools = {no1,no2};
//        Tool[] tools = new Tool[2];

        for (int i = 0; i < tools.length; i++) {
            Tool tool = tools[i];
            System.out.println(tool);

            
        }
        
    }


}
