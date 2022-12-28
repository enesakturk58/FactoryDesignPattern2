public class Factory {

    public static final int Sql = 1 ;
    public static final int Oracle = 2 ;

    public IVeriTabaniYonetici getVeriTabaniYonetici(int tip) {
        if (tip==1) {
            System.out.println("Veritabani olarak Mysql secildi.");
            return new Mysql();
        }
        else if (tip==2) {
            System.out.println("Veritabani olarak Oracle secildi.");
            return new Oracle();
        }
        else {
            System.out.println("Veri tabanı seçilemedi.");
            return null;
        }
    }
}
