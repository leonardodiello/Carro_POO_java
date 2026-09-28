public class Carro {
    public String dono;
    private String marca;
    private String modelo;
    private int ano;
    public float km;

    public Carro(String dono, String marca, String modelo, int ano, float km){
        this.dono = dono;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.km = km;
    }

    public String getDono(){
        return dono;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAno(){
        return ano;
    }

    public float getKm(){
        return km;
    }

    public void infoGeral(){
        System.out.println("Dono: "+ dono);
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Ano: "+ ano);
        System.out.println("KM rodados: "+ km);
    }
}
