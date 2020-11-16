package com.learning.decorator;

public class ResidenceEvaluator implements Evaluator
{
    public Candidate evaluate(Candidate candidate)
    {
        boolean passed = true;
        if (Math.random() > .5)
        {
            passed = false;
        }
        return new Candidate(candidate.getFirstName(), candidate.getLastName(), candidate.isQualified() && passed,
                candidate.getEvaluations() + " \n ResidenceEvaluator " + passed);
    }
}
