public class Main {
    public static void main(String[] args) {

        // --- 1. Tres abuelos para 2 nietos comunes ---
        System.out.println("--- ESCENARIO 1: 3 Abuelos, 2 Nietos ---");
        Abuelo abueloPat = new Abuelo("Jose", "Gomez", Genero.MASCULINO, "1940", "111", "Dir 1", "111A", "Pepe", Parentesco.PATERNO, 1000);
        Abuelo abuelaPat = new Abuelo("Ana", "Gomez", Genero.FEMENINO, "1942", "222", "Dir 1", "222B", "Anita", Parentesco.PATERNO, 900);
        Abuelo abueloMat = new Abuelo("Luis", "Ruiz", Genero.MASCULINO, "1945", "333", "Dir 2", "333C", "Lucho", Parentesco.MATERNO, 1200);

        Nieto nieto1 = new Nieto("Carlos", "Gomez", Genero.MASCULINO, "2010", "444", "Dir 3", "Ciclismo");
        Nieto nieto2 = new Nieto("Marta", "Gomez", Genero.FEMENINO, "2012", "555", "Dir 3", "Lectura");

        // Asignar los 3 abuelos al nieto 1
        nieto1.añadirAbuelo(abueloPat, 10);
        nieto1.añadirAbuelo(abuelaPat, 15);
        nieto1.añadirAbuelo(abueloMat, 20);

        // Asignar los 3 abuelos al nieto 2
        nieto2.añadirAbuelo(abueloPat, 10);
        nieto2.añadirAbuelo(abuelaPat, 15);
        nieto2.añadirAbuelo(abueloMat, 20);

        // Prueba de seguridad (Regla 3c)
        System.out.println("\n--- PRUEBA REGLA 3C ---");
        Abuelo otroAbueloPat = new Abuelo("Paco", "Gil", Genero.MASCULINO, "1950", "666", "Dir 4", "444D", "Paquito", Parentesco.PATERNO, 800);
        nieto1.añadirAbuelo(otroAbueloPat, 5); // Dará error
        nieto1.borrarAbuelo(Parentesco.PATERNO, Genero.MASCULINO); // Borramos primero
        nieto1.añadirAbuelo(otroAbueloPat, 5); // Ahora funcionará

        // --- 2. Cuatro abuelos para 5 nietos comunes ---
        System.out.println("\n--- ESCENARIO 2: 4 Abuelos, 5 Nietos ---");
        Abuelo aPat2 = new Abuelo("Roberto", "Sanz", Genero.MASCULINO, "1955", "777", "Dir 5", "555E", "Rober", Parentesco.PATERNO, 1100);
        Abuelo aMat2 = new Abuelo("Juan", "Díaz", Genero.MASCULINO, "1956", "888", "Dir 6", "666F", "Juanito", Parentesco.MATERNO, 1050);
        Abuelo abPat2 = new Abuelo("Rosa", "Sanz", Genero.FEMENINO, "1958", "999", "Dir 5", "777G", "Rosita", Parentesco.PATERNO, 950);
        Abuelo abMat2 = new Abuelo("Carmen", "Díaz", Genero.FEMENINO, "1960", "000", "Dir 6", "888H", "Carmela", Parentesco.MATERNO, 900);

        for (int i = 1; i <= 5; i++) {
            Nieto n = new Nieto("Nieto" + i, "Sanz", Genero.MASCULINO, "202" + i, "123", "Dir 7", "Deporte");
            n.añadirAbuelo(aPat2, 10);
            n.añadirAbuelo(aMat2, 10);
            n.añadirAbuelo(abPat2, 10);
            n.añadirAbuelo(abMat2, 10);
        }
    }
}