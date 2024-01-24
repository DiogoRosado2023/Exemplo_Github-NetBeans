package psi_10o.m9_datas;

public class M9_Datas {

    public static void main(String[] args) {
        Data mes1 = new Data(1,12,2032);
        //inicialização do repositorio
        //para exemplo de primeira vez
        mes1.setAno(2023);
        mes1.setDia(07);
        mes1.setMes(02);
        
        mes1.verDataNumerica();
        mes1.verDataTexto();
    }
}
