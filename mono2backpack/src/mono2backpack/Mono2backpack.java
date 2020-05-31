/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mono2backpack;

import chapter2.Population;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

/**
 *
 * @author dasepa
 */
public class Mono2backpack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Podaj ścieżkę do pliku wejsciowego: ");
            String path = s.nextLine().replace("\"", "");
            if(args.length>0)
                path = args[0];
            PlecakLexer lexer = new PlecakLexer(CharStreams.fromFileName(path));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PlecakParser parser = new PlecakParser(tokens);
            parser.parseData();
            System.out.println("Rozmiar plecaka: " + parser.backpackSize);
            KnapsackProblem problem = new KnapsackProblem(parser.items, parser.backpackSize);
            KnapsackProblemGA ga = new KnapsackProblemGA(1000, 0.01, 0.95, 1, problem);
            Population population = ga.initPopulation(parser.items.size());
            ga.evalPopulation(population);
            int generation = 1;
            System.out.println("Wykonuję algorytm genetyczny...");
            while (generation <= 200) {
                population = ga.crossoverPopulation(population);
                population = ga.mutatePopulation(population);
                ga.evalPopulation(population);
                generation++;
            }
            if (population.getFittest(0).getFitness() > 0.0) {
                System.out.println("Najlepsze rozwiązanie: "
                        + /*population.getFittest(0).toString() + " " +*/ problem.chosenItemsToString(population.getFittest(0).getChromosome())
                        + "o łącznej wartości " + problem.calcKnapsackValue(population.getFittest(0).getChromosome()));
            } else {
                System.out.println("Istnieje szansa, że nic nie zmieści się w tym plecaku.");
            }

        } catch (IOException | RecognitionException e) {
            e.printStackTrace();
        }
    }

}
