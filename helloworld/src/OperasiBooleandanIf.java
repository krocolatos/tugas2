public class OperasiBooleandanIf {
    public static void main(String[] args) {

        var NilaiAbsen = 75;
        var NilaiAkhir = 60;

        boolean LulusAbsen = NilaiAbsen >= 75;
        boolean LulusAkhir = NilaiAkhir >= 75;

        var Lulus = LulusAbsen && LulusAkhir;

        if (Lulus) {
            System.out.println("anda lulus");
        }
        else {
            System.out.println("anda tidak lulus");
        }
    }
}
