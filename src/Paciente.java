public class Paciente {
    //Atributos (encapsulados)
    private double peso, altura;

    //Getters y setters
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) throws IllegalArgumentException {
        if (peso <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor a cero.");
        }
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) throws IllegalArgumentException {
        if (altura <= 0) {
            throw new IllegalArgumentException("La altura debe ser mayor a cero.");
        }
        this.altura = altura;
    }

    //Metodo para calcular IMC
    public String calcularIMC(){  //No necesita parametros porque ya tiene acceso a los atributos
        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            return "BAJO PESO";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "PESO NORMAL";
        } else if (imc >= 25 && imc <= 29.9) {
            return "SOBREPESO";
        } else if (imc >= 30 && imc <= 34.9) {
            return "OBESIDAD TIPO 1";
        } else if (imc >= 35 && imc <= 39.9) {
            return "OBESIDAD TIPO 2";
        } else {
            return "OBESIDAD TIPO 3";
        }
    }
}
