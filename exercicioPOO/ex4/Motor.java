public class Motor {

    private int potencia;
    private double cilindradas;
    private String combustivel;

    public Motor() {
    }

    public Motor(int potencia, double cilindradas, String combustivel) {
        this.potencia = potencia;
        this.cilindradas = cilindradas;
        this.combustivel = combustivel;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(double cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        return cilindradas + "L, " + potencia + " cv, " + combustivel;
    }
}
