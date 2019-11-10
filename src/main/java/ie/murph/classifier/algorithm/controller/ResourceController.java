package ie.murph.classifier.algorithm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ie.murph.classifier.algorithm.configuration.ClassifierConfiguration;
import ie.murph.classifier.algorithm.model.Resources;

@RestController
@ContextConfiguration(classes = {ClassifierConfiguration.class})
public class ResourceController {

	public static final Logger LOG = LoggerFactory.getLogger(ResourceController.class);
	
	@Resource(name = "resourceSingleton")
    private Resources resource;

    @RequestMapping("/resource")
    @ResponseBody
    @Autowired(required = false)
    public List<String> getListOfResources(@RequestParam(value="resources", required = false) Resource resources ) {
    	LOG.info("++getListOfResources()");
    	return this.resource.getListOfResources();
    }
}