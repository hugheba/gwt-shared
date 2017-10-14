# gwt-shared
Gradle multi module project

Trying to load MyModel from the shared-lib module in the gwt-app module and run
  
  ./gradle :gwt-app:checkGwt
  
Getting error

Finding entry point classes
   Tracing compile failure path for type 'example.gwtSharedLibrary.client.GwtSharedLibrary'
      [ERROR] Errors in 'file:/Volumes/Home/Users/bryanhug/Desktop/gwt-shared/gwt-app/src/main/java/example/gwtSharedLibrary/client/GwtSharedLibrary.java'
         [ERROR] Line 20: No source code is available for type example.MyModel; did you forget to inherit a required module?
   [ERROR] Hint: Check the inheritance chain from your module; it may not be inheriting a required module or a module may not be adding its source path entries properly
