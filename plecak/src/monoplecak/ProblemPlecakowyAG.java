
package monoplecak;

import ag.GeneticAlgorithm;
import ag.Individual;
import java.util.HashSet;
import java.util.List;

public class ProblemPlecakowyAG extends GeneticAlgorithm {

    private ProblemPlecakowy problem;

    public ProblemPlecakowyAG(int populationSize, double mutationRate, double crossoverRate, int elitismCount, ProblemPlecakowy problem) {
        super(populationSize, mutationRate, crossoverRate, elitismCount);
        this.problem = problem;
    }

    @Override
    public double calcFitness(Individual individual) {
        int spaceTaken = problem.calcSpaceTaken(individual.getChromosome());
        int knapsackValue = problem.calcKnapsackValue(individual.getChromosome());
        double fitness = spaceTaken <= problem.knapsackSize ? knapsackValue : 0.0;
        individual.setFitness(fitness);
        return fitness;
    }
}
