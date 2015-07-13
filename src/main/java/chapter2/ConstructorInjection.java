package chapter2;

import org.apache.maven.model.Dependency;

public class ConstructorInjection  {

    private Dependency dependency;

    public ConstructorInjection(Dependency dependency) {
        this.dependency = dependency;
    }
}
