package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as colecoes do Java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
        
        List<Aula> aulasInmutaveis=javaColecoes.getAulas();  
        System.out.println(aulasInmutaveis);
        
        //n�o � possivel fazer pq o getAulas tem o m�todo unmodifiableList, que faz com que a lista aulas seja uma lista inmut�vel
        //Collections.sort(aulasInmutaveis);
        //System.out.println(aulasInmutaveis);
        
        //aulasInmutaveis dentro dos parenteses define que a nova lista(aulasMutaveis) tem as mesmas coisas(aulas) que a outra lista(aulasInmutaveis)
        List<Aula> aulasMutaveis=new ArrayList<>(aulasInmutaveis);
        Collections.sort(aulasMutaveis);
        System.out.println(aulasMutaveis);
        
        System.out.println("O tempo total do curso �: "+javaColecoes.getTempoTotal()+ " minutos");

        System.out.println(javaColecoes);
    }
}