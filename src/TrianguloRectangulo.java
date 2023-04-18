public class TrianguloRectangulo {
    int base;
    int altura;
    String msg;
    public void TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    double calcularArea() {
        return base * altura / 2;
    }
    double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }
    double calcularHipotenusa() {
        return Math.pow(Math.pow(base,2)+Math.pow(altura,2), 0.5);
    }
    public String determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())) {
            msg = "Es un triangulo equilatero.";
        }
        else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa())) {
            msg = "Es un triangulo escaleno.";
        }
        else {
            msg = "Es un triangulo isosceles.";
        }
        return msg;
    }
}
