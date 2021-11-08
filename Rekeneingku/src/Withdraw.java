public class Withdraw {
    public double jumlah;
    private double Withd;
    private double With;
    public String noWithd;

    //debit
    public double Withd(double jumlah) {
        Withd += jumlah;
        return Withd;
    }

    public double getWithd() {
        Withd += jumlah;
        return Withd;
    }

    public void setWithd(double jumlah) {
        Withd = jumlah;
    }

    //kredit
    public double With(double jumlah) {
        jumlah -= With;
        return jumlah;
    }

    public double getWith() {
        jumlah -= With;
        return jumlah;
    }

    public void setWith(double jumlah) {
        With = jumlah;
    }

    public String getNoWithd(){
        return this.noWithd;
    }

    public void setNoWithd(String noWithdBaru){
        this.noWithd = noWithdBaru;
    }
}

