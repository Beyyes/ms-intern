package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-student");

        	kSession.setGlobal("passedCount", new Integer(0));
        	kSession.setGlobal("globalResult", new Result());
            
            Student jack = new Student(1L, "jack", 90, true);
            kSession.insert(jack);
            
            Student mike = new Student(2L, "mike", 30, false);
            kSession.insert(mike);
            
            
            // start a new process instance
            kSession.startProcess("defaultPackage.studentSample");
            
            kSession.fireAllRules();
            
            System.out.println(((Result) kSession.getGlobal("globalResult")).getPassedCount());

        } catch (Throwable t) {
            t.printStackTrace();
        }
	}

}
