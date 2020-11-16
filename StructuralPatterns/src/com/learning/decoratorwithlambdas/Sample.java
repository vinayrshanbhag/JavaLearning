package com.learning.decorator;

public class Sample
{
    public static void main(String[] args)
    {
        Candidate candidate = new Candidate("Vinay", "Shanbhag", true, "");
//        ResidenceEvaluator residenceEvaluator = new ResidenceEvaluator();
//        ExperienceEvaluator experienceEvaluator = new ExperienceEvaluator(residenceEvaluator);


       // evaluateCandidate(candidate, new ResidenceEvaluator());
        // evaluateCandidate(candidate, new ExperienceEvaluator(new ResidenceEvaluator()));
        Evaluator evaluator = new ExperienceEvaluator(new CrimeEvaluator(new ResidenceEvaluator()));
        evaluateCandidate(candidate, evaluator);
    }

    private static void evaluateCandidate(Candidate candidate, Evaluator evaluator)
    {
        System.out.println("Evaluating " + candidate.getFirstName() + " " + candidate.getLastName() );

        System.out.println(evaluator.evaluate(candidate));
    }

}
