public class Barco {
    private Tripulante[][] tripulantes;
    private int filas;
    private int columnas;
    private int ocupados;

    public Barco(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.tripulantes = new Tripulante[filas][columnas];
        this.ocupados = 0; 
    }

    public boolean agregarTripulante(Tripulante t) {
        if (ocupados >= filas * columnas) {
            System.out.println(" El barco está lleno.");
            return false;
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (tripulantes[i][j] == null) {
                    tripulantes[i][j] = t;
                    ocupados++;
                    System.out.println(" '" + t.getRol() + "' agregado en [" + i + "][" + j + "]");
                    return true;
                }
            }
        }
        return false;
    }

    public void buscarPorRol(String rol) {
        boolean encontrado = false;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                Tripulante t = tripulantes[i][j];
                if (t != null && t.getRol().equalsIgnoreCase(rol)) {
                    System.out.println(" '" + rol + "' en posición [" + i + "][" + j + "]");
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println(" No se encontró el rol '" + rol + "'");
        }
    }

    public void mostrarEstado() {
        System.out.println("\n Estado del barco:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (tripulantes[i][j] != null) {
                    System.out.print(tripulantes[i][j] + "\t");
                } else {
                    System.out.print("[Vacío]\t");
                }
            }
            System.out.println();
        }
    }
}

