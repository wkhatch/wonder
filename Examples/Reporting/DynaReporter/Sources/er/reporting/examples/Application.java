package er.reporting.examples;

import java.util.Date;

import com.webobjects.appserver.WOApplication;
import com.webobjects.appserver.WORequest;
import com.webobjects.appserver.WOResponse;

import er.extensions.appserver.ERXApplication;

// Generated by the WebObjects Wizard
public class Application extends ERXApplication { 

    public static void main(String argv[]) {
        WOApplication.main(argv, Application.class);
    }

    // Generated by the WebObjects Wizard


    public Application() {
        super();
    }

    public WOResponse dispatchRequest(WORequest r){
        Date ts1 = new Date();
        long ts1L = ts1.getTime();
        //System.out.println("ts1L: "+ts1L);
        WOResponse rp = super.dispatchRequest(r);
        Date ts2 = new Date();
        long ts2L = ts2.getTime();
        //System.out.println("ts2L: "+ts1L);
        long delta = ts2L - ts1L;
        System.out.println("time needed: "+(double)delta/(double)1000.0);
        return rp;
    }


}