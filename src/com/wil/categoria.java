package com.wil;

public class categoria extends Utils {
    int codigo;
    categoria(String nome, String desc, int codigo){
        setNome(nome);
        setDescricao(desc);
        setCodigo(codigo);
    }

    private void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
