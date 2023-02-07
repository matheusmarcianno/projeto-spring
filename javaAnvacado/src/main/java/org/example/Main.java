package org.example;

import javax.swing.*;
import java.util.*;

public class Main {
    static List<Pessoa> pessoas = new ArrayList<Pessoa>();

    static {
        pessoas.add(new Pessoa("Maria", 52));
        pessoas.add(new Pessoa("Savio", 65));
        pessoas.add(new Pessoa("Felipe", 22));
        pessoas.add(new Pessoa("Thiago", 26));
    }

    public static Optional<Pessoa> find(int idade){
        for(Pessoa p : pessoas) {
            if(p.idade == idade) {
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
        Optional<Pessoa> pessoa = find(idade);
        if(pessoa.isPresent()) {
            JOptionPane.showMessageDialog(null, pessoa.get().nome);
        }else{
            JOptionPane.showMessageDialog(null, "Pessoa não encontrada");
        }
    }
}

class Pessoa {
    String nome;
    int idade;

    public Pessoa(){}

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
}