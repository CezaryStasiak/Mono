/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mono2backpack;

import chapter2.GeneticAlgorithm;
import chapter2.Individual;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author dasepa
 */
public class KnapsackProblemGA extends GeneticAlgorithm {

    private KnapsackProblem problem;

    public KnapsackProblemGA(int populationSize, double mutationRate, double crossoverRate, int elitismCount, KnapsackProblem problem) {
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
