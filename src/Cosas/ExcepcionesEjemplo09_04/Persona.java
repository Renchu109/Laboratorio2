package Cosas.ExcepcionesEjemplo09_04;

public class Persona extends Exception {
    public class persona {
        private int edad;

        public int getEdad() {
            return this.edad;
        }

        public void setEdad(int edad) throws Exception {
            if (edad <= 0)
                throw new Exception("La edad debe ser positiva.");
            this.edad = edad;
        }

    }
}
