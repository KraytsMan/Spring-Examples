package chapter2;

import org.apache.maven.model.Dependency;

public class ContextualizedDependencyLookup implements ManagedComponent{

    private Dependency dependency;


    public void performLookup(Container container) {
        this.dependency = (Dependency)container.getDependency("MyDependency");
    }
}
