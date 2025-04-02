package main.java;

public class CorpoHumano {
    private float massa;
    private float densidade;
    private float volume;
    private double altura;

    // Construtor
    public CorpoHumano(float massa, float volume,double altura)
    {
        this.massa = massa;
        this.volume = volume;
        densidade = massa / volume;
        this.altura = altura;
        
    }

    // Getters
    public float getMassa() {
        return massa;
    }

    public float getVolume() {
        return volume;
    }

    public float getDensidade() {
        return densidade;
    }

    public double getAltura() {
        return altura;
    }

    // Setters
    public void setMassa(float massa) {
        this.massa = massa;
        this.densidade = massa / volume;  
    }

    public void setVolume(float volume) {
        this.volume = volume;
        this.densidade = massa / volume; 
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double calcularIMC() {
        return massa / (altura *altura);
    }
}
