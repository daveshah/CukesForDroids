#CukesForDroids#
This is a quick and dirty proof of concept driving Android with Cucumber!

There are 2 key ingredients to this tasty treat:
cucumber-jvm & nativedriver

http://code.google.com/p/nativedriver/
https://github.com/cucumber/cucumber-jvm

More to follow...

#Running Your Cukes#
If you're using Eclipse - import both the cukes-for-android and the HelloAndroid projects into your workspace.
Once your emulator or device is up and running, you'll want to execute the following commands from a terminal:  
    - adb shell am instrument com.leandog/com.google.android.testing.nativedriver.server.ServerInstrumentation  
    - adb forward tcp:54129 tcp:54129a

After executing the first command, you should see  
"I/com.google.android.testing.nativedriver.server.ServerInstrumentation(  380): Jetty started on port 54129" or similar in your logcat output."

You should now be able to run the com.leandog.HelloWorldTest within the cukes-for-android project with a your Eclipse jUnit runner.
