package com.sample.drool;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

import com.sample.DroolsTest.Message;

@Service
public class DroolServiceImpl implements DroolService {

	public void executeRule() {
		try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            // go !
            Message message = new Message();
            message.setMessage("Hello World");
            message.setStatus(Message.HELLO);
            kSession.insert(message);
            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
	}

	public void test() {
		// TODO Auto-generated method stub
		System.out.println("sample method..");
	}

}
