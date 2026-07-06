public class Retangulo extends Forma{
    private float base;
    private float altura;


    public Retangulo(float base, float altura, String cor) {
        this.base = base;
        this.altura = altura;

        setCor(cor);

        setArea(calcularArea());

        System.out.println("---Retângulo---");
        System.out.println("Área: " + getArea());
        System.out.println("Cor: " + getCor());
    }

    @Override
    public float calcularArea() {
        return this.base * this.altura;
    }
}