package method_reference;

import lambda.AnotherInterface;

public class ReferenceExperiment {
    public String execute(String value1, String value2, AnotherInterface anotherInterface) {
        return anotherInterface.combineValues(value1, value2);
    }
}
