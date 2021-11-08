public class Main {

    public static void main(String[] args) {
        Orang objek;
        objek = new Orang();
        objek.setNama("Jayadi");
        objek.setNoKTP("123456789");
        objek.setAlamat("Bandung");
        Pelajar nim = new Pelajar();
        nim.setNIM("12345666");

        System.out.println("Nama = " + objek.getNama());
        System.out.println("No KTP = " + objek.getNoKTP());
        System.out.println("Alamat " + objek.getAlamat());
        System.out.println("NIM = " + nim.getNIM());


        int nom = 10_000;

        Withdraw saldo = new Withdraw();

        saldo.setWith(10_000);
        saldo.setWithd(10_000);
        saldo.jumlah = 500_000;




        Withdraw juma = new Withdraw();
        juma.setNoWithd("11111000111");

        System.out.println("Jumlah Saldo = " + saldo.getWith());
        //System.out.println("NO REK = " + juma.getNoWithd());
    }
}
