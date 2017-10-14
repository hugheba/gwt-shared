package example.gwtSharedLibrary.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import example.gwtSharedLibrary.client.GwtSharedLibraryService;

public class GwtSharedLibraryServiceImpl extends RemoteServiceServlet implements GwtSharedLibraryService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}