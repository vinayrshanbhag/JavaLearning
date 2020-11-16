package com.learning.decorator;

public abstract class EvaluatorDecorator implements Evaluator
{
    private final Evaluator _next;

    public EvaluatorDecorator(Evaluator next)
    {
        _next = next;
    }

    protected abstract Candidate evaluateCandidate(Candidate candidate);


    @Override
    public final Candidate evaluate(Candidate candidate)
    {
        Candidate evaluatedCandidate = candidate;
       if(_next!=null)
         evaluatedCandidate = _next.evaluate(candidate);

       return evaluateCandidate(evaluatedCandidate);
    }
}
