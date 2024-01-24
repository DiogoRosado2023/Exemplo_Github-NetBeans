package psi_10o.m9_datas;

public class Data {
//----------------------------------------------------------------------------\\

    private int dia;
    private int mes;
    private int ano;
//----------------------------------------------------------------------------\\

    public Data() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1900;

    }

    public Data(int dia, int mes, int ano) {
        if (dia < 1 || dia > 31) {
            System.out.println("Erro, dia invalido. Dia não alterado");
            this.dia = 1;
        } else {
            this.dia = dia;
        }
        if (mes < 1 || mes > 12) {
            this.mes = 1;
            System.out.println("Erro, mes invalido. Mes não alterado");
        } else {
            this.mes = mes;
        }
        if (ano < 1900 || ano > 9999) {
            System.out.println("Erro, mes invalido. Mes não alterado");
            this.ano = 1900;
        } else {
            this.ano = ano;
        }
    }

//----------------------------------------------------------------------------\\
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
    
    public void setData(int dia, int mes, int ano) {
        this.ano = ano;
        this.dia = dia;
        this.mes = mes;
        /*
        if (dia < 1 || dia > 31) {
            System.out.println("Erro, dia invalido. Dia não alterado");
            this.dia = 1;
        } else {
            this.dia = dia;
        }
        if (mes < 1 || mes > 12) {
            this.mes = 1;
            System.out.println("Erro, mes invalido. Mes não alterado");
        } else {
            this.mes = mes;
        }
        if (ano < 1900 || ano > 9999) {
            System.out.println("Erro, mes invalido. Mes não alterado");
            this.ano = 1900;
        } else {
            this.ano = ano;
        }
        */
    }
    public void verDataNumerica(){
        String auxDia = ""; String auxMes = "";
        if(dia <10) auxDia = "0";
        if(mes <10) auxMes = "0";
        System.out.println(auxDia+dia+"/"+auxMes+mes+"/"+ano);
    }
    public void verDataTexto(){
        String meses[] = {"","janeiro","fevereiro","março","abril","maio","junho","julho","agosto","setembro","outubro","novembro","dezembro"};
        System.out.println(dia+"/"+meses[mes]+"/"+ano);
    }
}
