package classes;

public class Tabuada {

    private Integer numeroMaximoTabuada = 10;

    public String calcular(Integer numero) {
        StringBuilder sb = new StringBuilder();
        sb.append("------------------------------------------\n");
        sb.append("Tabuada do " + numero + "\n");
        sb.append("------------------------------------------\n");
        for (int i = 1; i <= this.numeroMaximoTabuada; i++) {
            Integer resultado = i * numero;
            sb.append("    " +  numero + " X " + i + " = " + resultado + "\n");
        }
        return sb.toString();
    }

	public Integer getNumeroMaximoTabuada() {
		return numeroMaximoTabuada;
	}

	public void setNumeroMaximoTabuada(Integer numeroMaximoTabuada) {
		this.numeroMaximoTabuada = numeroMaximoTabuada;
	}
    

}
