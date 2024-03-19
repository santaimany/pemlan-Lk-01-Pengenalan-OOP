 class BangunDatar{
    public double Luas(){
        return 0.0;
    }

    public double Keliling(){
        return 0.0;
    }
    void displayBangun(){
        System.out.printf("Luas bangun datar: %.1f cm\n", Luas());
        System.out.printf("Keliling bangun datar: %.1f cm\n\n", Keliling());
    }
}

class Lingkaran extends BangunDatar{
    double jariJari;
    Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double Luas(){
        return Math.PI * Math.pow(this.jariJari, 2) ;
    }

    public double Keliling(){
        return 2 * Math.PI * this.jariJari;
    }

}

class Segiempat extends BangunDatar{
    int sisi1;
    int sisi2;
    Segiempat (int sisi1,int sisi2){
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }
    public double Luas(){
        return sisi1 * sisi2;
    }
    public double Keliling(){
        return 2 * (sisi1 + sisi2);
    }
    public double Diagonal(){
        return  Math.sqrt(Math.pow(sisi1, 2) + Math.pow(sisi2 , 2));
    }
}

public class Pemlantes {
    public static void main(String[] args) {
        Lingkaran lingkaran1 = new Lingkaran(10), lingkaran2 = new Lingkaran(7);
        Segiempat persegi1 = new Segiempat(8, 8);
        Segiempat persegipanjang1 = new Segiempat(3,4);

        System.out.println("Lingkaran1 dengan jari jari 10 cm");
        lingkaran1.displayBangun();


        System.out.println("Persegi1 dengan panjang sisi 8 cm");
        persegi1.displayBangun();


        System.out.println("Pergeipanjang1 dengan panjang 3 cm dan lebar 4 cm");
        persegipanjang1.displayBangun();



    }
}
