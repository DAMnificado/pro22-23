package ev2.parte1.herencia.pez;

    public class Fish {
        private static int fishNumber;
        private String especie;
        private String nombre;

        public Fish(String especie, String nombre) {
            this.especie = especie;
            this.nombre = nombre;
        }

        public static int getFishNumber() {
            return fishNumber;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getEspecie() {
            return especie;
        }

        public void setEspecie(String especie) {
            this.especie = especie;
        }
    }

