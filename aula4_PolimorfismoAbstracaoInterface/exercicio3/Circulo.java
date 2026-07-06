public class Circulo extends Forma implements IForma{
    private float raio;

    public Circulo(float raio, String cor) {
        this.raio = raio;

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