package br.edu.iftm.fila.testes;

import br.edu.iftm.fila.classes.Paciente;
import br.edu.iftm.fila.estruturadados.FilaComPrioridade;

public class PrincipalFilaPrioridade {
    
    public static void main(String[] args) {
        
        FilaComPrioridade<Paciente> fila = new FilaComPrioridade<>();

        //(B,1),(D,1),(A,2),(F,2),(C,3),
        //B,D,A,F,C

        fila.enfileirar(new Paciente("A", 2));
        fila.enfileirar(new Paciente("B", 1));
        fila.enfileirar(new Paciente("D", 1));
        fila.enfileirar(new Paciente("C", 3));
        fila.enfileirar(new Paciente("F", 2));
        System.out.println(fila.toString());
    }
}
