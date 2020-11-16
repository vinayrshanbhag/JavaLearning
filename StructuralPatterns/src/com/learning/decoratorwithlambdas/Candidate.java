package com.learning.decorator;

public class Candidate
{
    private String firstName;
    private String lastName;
    private boolean qualified;
    private String evaluations;

    public Candidate(String firstName, String lastName, boolean qualified, String evaluations)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.qualified = qualified;
        this.evaluations = evaluations;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public boolean isQualified()
    {
        return qualified;
    }

    public void setQualified(boolean qualified)
    {
        this.qualified = qualified;
    }

    public String getEvaluations()
    {
        return evaluations;
    }

    public void setEvaluations(String evaluations)
    {
        this.evaluations = evaluations;
    }

    @Override
    public String toString()
    {
        return "Candidate{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", qualified="
                + qualified + ", evaluations='" + evaluations + '\'' + '}';
    }
}
