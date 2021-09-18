package Sophia_e_Victor_Atv_3p;

public class Usuario{
    private String user;
    private String senha;
    private String confirmacao;

    public void setUser(String user){
        this.user = user;
    }
    public String getUser(){
        return user;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }
    public String getSenha(){
        return senha;
    }

    public void setConfirmacao(String confirmacao){
        this.confirmacao = confirmacao;

    }
    public String getConfirmacao(){
        return confirmacao;
    }

    public String loginUsuario(){
        String resposta = "";
        confirmacao = "";
            if(user.equals("Sophia") && senha.equals("Sophia2003")){
                    resposta = "Olá Sophia! Pode Continuar " ;
                    confirmacao = "OK";
            }else if(user.equals("Victor") && senha.equals("Victor2001")){
                resposta = "Olá Victor! Pode Continuar " ;
                confirmacao = "OK";
            }else if(user.equals("Grazielle") && senha.equals("Grazielle2004")){

                resposta = "Olá Grazielle! Pode Continuar " ;
                confirmacao = "OK";
            }else{
                resposta = "Usuário e senha não encontrados";
            }
        return resposta;
    }
}

