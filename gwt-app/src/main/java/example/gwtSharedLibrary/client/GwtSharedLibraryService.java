package example.gwtSharedLibrary.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("GwtSharedLibraryService")
public interface GwtSharedLibraryService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use GwtSharedLibraryService.App.getInstance() to access static instance of GwtSharedLibraryServiceAsync
     */
    public static class App {
        private static GwtSharedLibraryServiceAsync ourInstance = GWT.create(GwtSharedLibraryService.class);

        public static synchronized GwtSharedLibraryServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
