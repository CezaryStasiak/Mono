
package monoplecak;

import ag.Population;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;


public class zad2 {

   
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Ścieżka pliku: ");
            String path = s.nextLine().replace("\"", "");
            if(args.length>0)
                path = args[0];
            PlecakLexer lexer = new PlecakLexer(CharStreams.fromFileName(path));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PlecakParser parser = new PlecakParser(tokens);
            parser.parseData();
            System.out.println("Rozmiar: " + parser.backpackSize);
            ProblemPlecakowy problem = new ProblemPlecakowy(parser.items, parser.backpackSize);
            ProblemPlecakowyAG ga = new ProblemPlecakowyAG(1000, 0.1, 0.95, 1, problem);
            Population population = ga.initPopulation(parser.items.size());
            ga.evalPopulation(population);
            int generation = 1;
            
            while (generation <= 200) {
                population = ga.crossoverPopulation(population);
                population = ga.mutatePopulation(population);
                ga.evalPopulation(population);
                generation++;
            }
            if (population.getFittest(0).getFitness() > 0.0) {
                System.out.println("Najlepsze rozwiązanie: "
                        + problem.chosenItemsToString(population.getFittest(0).getChromosome())
                        + "o łącznej wartości " + problem.calcKnapsackValue(population.getFittest(0).getChromosome()));
            } else {
                System.out.println("Brak rozwiązania");
            }

        } catch (IOException | RecognitionException e) {
            e.printStackTrace();
        }
    }

}
