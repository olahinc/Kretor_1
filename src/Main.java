public class Main {
    public static void main(String[] args) {
        Hero Hero1=new Hero("Galadriela", "druga", 20, 20, true);
        System.out.println(Hero1.convert(Hero1.getPowerpoints(), Hero1.getManapoints()));
    }
}
