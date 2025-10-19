package package2;
    public class Adres {
        private String adresBasligi; // Örn: "Ev Adresim"
        private String il;
        private String ilce;
        private String acikAdres;

        // Constructor
        public Adres(String adresBasligi, String il, String ilce, String acikAdres) {
            this.adresBasligi = adresBasligi;
            this.il = il;
            this.ilce = ilce;
            this.acikAdres = acikAdres;
        }

        // Metot
        public String adresBilgisiniDondur() {
            return "Başlık: " + adresBasligi +
                    "\nİl: " + il +
                    "\nİlçe: " + ilce +
                    "\nAçık Adres: " + acikAdres;
        }

        // Getter ve Setter metotları (diğer sınıflar için gerekli)
        public String getAdresBasligi() {
            return adresBasligi;
        }
        public String getIl() {
            return il;
        }
        public String getIlce() {
            return ilce;
        }
        public String getAcikAdres() {
            return acikAdres;
        }
        @Override
        public String toString() {
            return adresBasligi + " (" + il + "/" + ilce + ")";
        }
    }
}
