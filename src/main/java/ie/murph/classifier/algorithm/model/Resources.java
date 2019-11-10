package ie.murph.classifier.algorithm.model;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Component;
import java.util.ArrayList;

@Component
public class Resources {

    private final long id;
    private final AtomicLong counter = new AtomicLong();
    private List<String> listOfResources;

    public Resources() {
    	this.id = this.counter.incrementAndGet();
        this.listOfResources = new ArrayList<String>();
    }

    public long getId() {
        return this.id;
    }

    public List<String> getListOfResources()
    {
    	createListOfResources();
    	return this.listOfResources;
    }
    
    private void createListOfResources()
    {
    	this.listOfResources.add("http://localhost:8080/resource");
    	this.listOfResources.add("https://stackoverflow.com/questions/472030/cool-project-to-use-a-genetic-algorithm-for");
    	this.listOfResources.add("https://en.wikipedia.org/wiki/Learning_classifier_system");
    	this.listOfResources.add("https://projects.apache.org/projects.html?category");
    }
    
}
