package example.gwtSharedLibrary.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface GwtSharedLibraryServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
