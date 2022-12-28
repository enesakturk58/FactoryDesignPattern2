public class Main {
    public static void main(String[] args) {

        Factory factory = new Factory();
        IVeriTabaniYonetici veriTabaniYonetici = factory.getVeriTabaniYonetici(1);
        veriTabaniYonetici.oku();
        veriTabaniYonetici.yaz();

        Factory factory1 = new Factory();
        IVeriTabaniYonetici veriTabaniYonetici1 = factory1.getVeriTabaniYonetici(2);
        veriTabaniYonetici1.oku();
        veriTabaniYonetici1.yaz();

        Factory factory3 = new Factory();
        IVeriTabaniYonetici veriTabaniYonetici3 = factory3.getVeriTabaniYonetici(1);
    }
}