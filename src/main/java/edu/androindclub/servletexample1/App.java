package edu.androindclub.servletexample1;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/")
public class App extends Application {

    private Set<Class<?>> classes = new HashSet<>();
    private Set<Object> singletons = new HashSet<>();

    public App() {
        classes.add(TestResourse.class);
        singletons.add(new TestResourse());
    }

    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
