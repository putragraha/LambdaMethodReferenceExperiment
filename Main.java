package com.example.pre_test;

import lambda.LambdaExperiment;
import method_reference.ReferenceCombiner;
import method_reference.ReferenceExperiment;
import lambda.AnotherInterface;

public class Main {
    public static void main(String[] args) {
        LambdaExperiment instance = () -> System.out.println("Lambda to implement interface");
        instance.printSomething();

        AnotherInterface anotherInterface = (value1, value2) -> value1 + " " + value2;
        System.out.println(anotherInterface.combineValues("Second", "Lambda implementation"));

        ReferenceExperiment referenceExperiment = new ReferenceExperiment();
        System.out.println(referenceExperiment.execute("Method reference", "implementation",
                ReferenceCombiner::combineValues));
    }
}
