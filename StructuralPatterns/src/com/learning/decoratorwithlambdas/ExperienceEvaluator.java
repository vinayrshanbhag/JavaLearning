package com.learning.decorator;

public class ExperienceEvaluator extends EvaluatorDecorator
{

    public ExperienceEvaluator(Evaluator next)
    {
        super(next);
    }

    @Override
    public Candidate evaluateCandidate(Candidate candidate)
    {
        boolean passed = true;

        if (Math.random() > 0.5)
        {
            passed = false;
        }
        return new Candidate(candidate.getFirstName(), candidate.getLastName(),
                candidate.isQualified() && passed,
                candidate.getEvaluations() + "\n ExperienceEvalator " + passed);
    }
}