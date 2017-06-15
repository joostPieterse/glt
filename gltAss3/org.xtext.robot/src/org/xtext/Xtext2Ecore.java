package org.xtext;

import com.google.inject.Guice;
import com.google.inject.Injector;

import simplerobot.Robot;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.common.TerminalsStandaloneSetup;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResourceSet;

public class Xtext2Ecore {
	private static void exportXMI(String absuloteTargetFolderPath, String fileBaseName) {
	    new RobotStandaloneSetup().createInjectorAndDoEMFRegistration();
	    new simplerobot.util.SimplerobotAdapterFactory();
	
	    String inputURI = "file:///" + absuloteTargetFolderPath + "/" + fileBaseName + ".robot";
	    String outputURI = "file:///" + absuloteTargetFolderPath + "/" + fileBaseName + ".xmi";
	    
	    ResourceSet rs = new ResourceSetImpl();
	    Resource resource = rs.getResource(URI.createURI(inputURI), true);	    

	    EcoreUtil.resolveAll(resource);

	    Resource xmiResource = rs
	            .createResource(URI.createURI(outputURI));
	    xmiResource.getContents().add(resource.getContents().get(0));
	    try {
	        xmiResource.save(null);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	public static void main(String[] args){
		String folder = "/home/osboxes/Desktop/glt/gltAss3";
		exportXMI(folder, "simple1");
		exportXMI(folder, "simple2");
		exportXMI(folder, "simple3");
		exportXMI(folder, "actual1");
	}
}
