public class ContaBancaria {
    int numero;

    public ContaBancaria(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Conta numero: " + numero;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContaBancaria outra = (ContaBancaria) obj;
        return this.numero == outra.numero;
    }
}