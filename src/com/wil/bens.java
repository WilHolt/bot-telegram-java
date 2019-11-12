package com.wil;

public class bens extends Utils {
    categoria Categ;
    localizacao Loc;
    bens(String nome, String desc, localizacao loc, categoria cat){
        setNome(nome);
        setDescricao(desc);
        setLoc(loc);
        setCateg(cat);
    }
    public categoria getCateg() {
        return Categ;
    }

    public void setCateg(categoria categ) {
        Categ = categ;
    }

    public localizacao getLoc() {
        return Loc;
    }

    public void setLoc(localizacao loc) {
        Loc = loc;
    }


}
