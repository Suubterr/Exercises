package GeneticAlgorithm;

import java.util.*;
import java.util.function.ToDoubleFunction;

//https://www.codewars.com/kata/526f35b9c103314662000007/train/java

public class GeneticAlgorithm {

    private String generate(int length) {
        // TODO: Implement the generate method

        StringBuffer sb = new StringBuffer();
        int i = 0;

        while (i < length) {
            sb.append(generateRandom(2, 1));
            i++;
        }

        return sb.toString();
    }

    public static String[] select(List<String> population, List<Double> fitnesses) {
        // TODO: Implement the select method

        String[] result = new String[2];

        int p = 0;
        int i;
        double sum;
        double roulette;

        while (p <= 1) {
            i = 0;
            sum  = fitnesses.get(i);
            roulette = generateRandom(99, 0) / 100;
            System.out.println("Roulette value " + p + ": " + roulette);
            if (roulette == 1) {
                result[p] = population.get(population.size() - 1);
                p++;
            }
            while (sum < roulette) {
                i++;
                sum += fitnesses.get(i);
            }
            System.out.println("suma: " + sum);
            result[p] = population.get(i);
            p++;
        }


        return result;
    }

    private String mutate(String chromosome, double p) {
        // TODO: Implement the mutate method
        // p - propability of mutation
        // swap random genes

        double propabilty = generateRandom(99, 0);

        if (propabilty / 100 <= p) {

            int swapPoint1 = (int)generateRandom(7, 1);
            int swapPoint2 = (int)generateRandom(7, 1);

            while (swapPoint1 == swapPoint2) swapPoint2 = (int)generateRandom(4, 0);

            char[] chromArr = chromosome.toCharArray();
            char tmp = chromArr[swapPoint2];
            chromArr[swapPoint2] = chromArr[swapPoint1];
            chromArr[swapPoint1] = tmp;

            return String.valueOf(chromArr);

        } else {
            return null;
        }

    }

    private String[] crossover(String chromosome1, String chromosome2) {
        // TODO: Implement the crossover method
        // slice and join chromosomes and returns them

        int s = (int)generateRandom(chromosome1.length() - 1, 0);

        System.out.println(s);

        String chromosome1a = chromosome1.substring(0, s);
        String chromosome1b = chromosome1.substring(s);
        String chromosome2a = chromosome2.substring(0, s);
        String chromosome2b = chromosome2.substring(s);

        return new String[]{chromosome1a + chromosome2b, chromosome2a + chromosome1b};
    }

//    The run method will take a fitness function that accepts a chromosome and returns the fitness of that chromosome,
//    the length of the chromosomes to generate (should be the same length as the goal chromosome),
//    the crossover and mutation probabilities, and an optional number of iterations (default to 100).
//    Make the population size whatever you want; 100 is a good number but anywhere between 50 and 1000
//    will work just fine (although the bigger, the slower). After the iterations are finished,
//    the method returns the chromosome it deemed to be fittest.

    public String run(ToDoubleFunction<String> fitness, int length, double p_c, double p_m) {
        // TODO: Implement the run method

        List<Double> originalPopulationFitness = new ArrayList<>();
        List<String> originalPopulation = new ArrayList<>();
        List<String> newPopulation = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            String chromosome = generate(35);
        }

        return null;
    }

    public String run(ToDoubleFunction<String> fitness, int length, double p_c, double p_m, int iterations) {
        // TODO: Implement the run method
        return null;
    }

    public static double generateRandom(int length, int withZero) {

        Random generator = new Random();

        int k;

        if (withZero == 1) {
            k = generator.nextInt(length);
        } else {
            k = generator.nextInt(length) + 1;
        }

        return k;
    }
}