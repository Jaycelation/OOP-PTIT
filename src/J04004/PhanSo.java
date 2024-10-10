package J04004;

public class PhanSo {
    private long tuSo, mauSo;

    public PhanSo(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public long getTuSo() {
        return tuSo;
    }

    public void setTuSo(long tuSo) {
        this.tuSo = tuSo;
    }

    public long getMauSo() {
        return mauSo;
    }

    public void setMauSo(long mauSo) {
        this.mauSo = mauSo;
    }

    public static long _gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return _gcd(b, a % b);
    }

    public void rutGon() {
        long Gcd = _gcd(this.tuSo, this.mauSo);
        this.tuSo /= Gcd;
        this.mauSo /= Gcd;
    }

    public void tinhTong(PhanSo a) {
        long newTu = this.tuSo*a.mauSo + this.mauSo*a.tuSo;
        long newMau = this.mauSo*a.mauSo;

        this.tuSo = newTu;
        this.mauSo = newMau;
        rutGon();
    }
}
