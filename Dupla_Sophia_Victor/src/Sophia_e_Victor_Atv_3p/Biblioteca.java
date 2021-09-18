package Sophia_e_Victor_Atv_3p;
public class Biblioteca {

    private int quantidade = 0;

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public int getQuantidade(){
        return quantidade;

    }

    public int estoque() {
        int pequenoPrincipe = 3;
        int hpPhoenixorder = 3;
        int swFallenjedi = 3;
        int soma;
        int subtracao = 0;
        int menos = 1;
        do{
            soma = (pequenoPrincipe + hpPhoenixorder + swFallenjedi);
            if(quantidade == 1 ){
                subtracao = pequenoPrincipe - menos;
                pequenoPrincipe = subtracao;
            }else if(quantidade == 2 ){
                subtracao = hpPhoenixorder - menos;
                hpPhoenixorder = subtracao;
            }else if(quantidade == 3 ){
                subtracao = swFallenjedi - menos;
                swFallenjedi = subtracao;
            }
            else{
            }
            return subtracao;
        }while(soma != 0);
    }
}