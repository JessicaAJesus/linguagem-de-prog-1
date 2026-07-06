public class Circulo extends Forma{
    private float raio;

    public Circulo(float raio, String cor) {
        this.raio = raio;

        if (raio <= 0) {
            throw new IllegalArgumentException("Erro: Dimensões inválidas, raio deve ser maior que zero.");
        }

        setCor(cor);

        setArea(calcularArea());

        System.out.println("---Círculo---");
        System.out.println("Área: " + getArea());
        System.out.println("Cor: " + getCor());
    }

    @Override
    public float calcularArea() {
        return (float) (Math.PI * Math.pow(this.raio, 2));
    }
}