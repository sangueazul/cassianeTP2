public class Matricula {
    private String nome;
    private String idade;
    
    public String getnome(){
        return nome;
    }
    public String getidade(){
        return idade;
    }
public class Pessoa extends Matricula {
    private String cep;
    private String cpf;
    
    public String getcep(){
        return cep;
}
    public String getcpf(){
        return cpf;
    }
public class Aluno extends Pessoa {
    private String email;
    private String endereço;
    
    public String getemail(){
        return email;
    }
    public String getendereço(){
        return endereço;
}
}
}
}

