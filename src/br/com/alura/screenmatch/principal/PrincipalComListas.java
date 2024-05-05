package br.com.alura.screenmatch.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 2023);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(8);
        Filme filmeDoIgor = new Filme("CatVille", 2020);
        filmeDoIgor.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoIgor);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista){
            System.out.println(item);
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam");
        buscaPorArtista.add("Igor");
        buscaPorArtista.add("João");
        buscaPorArtista.add("Abigail");
        
        System.out.println(buscaPorArtista);
        System.out.println("Ordenação da lista");
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);
        System.out.println("Ordenando lista de titulos");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("Ordenando pelo ano de lançamento:");
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);

    }
}
