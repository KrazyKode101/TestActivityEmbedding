# TestActivityEmbedding

https://user-images.githubusercontent.com/5599093/174250232-bf2f3852-2708-417a-a6ec-70ae66393c6d.mp4

Above video shows with Activity Embedding on, explicit intent works fine
but on launching implicit intent "Intent.ACTION_DIAL", app crashes with below exception.

2022-06-17 13:07:32.973 30731-30731/com.example.testactivityembedding E/AndroidRuntime: FATAL EXCEPTION: main
    Process: com.example.testactivityembedding, PID: 30731
    java.lang.SecurityException: Not allowed to start activity Intent { act=android.intent.action.DIAL }
        at android.app.Instrumentation.checkStartActivityResult(Instrumentation.java:2120)
        at android.app.Instrumentation.execStartActivity(Instrumentation.java:1762)
        at android.app.Activity.startActivityForResult(Activity.java:5407)
        at androidx.activity.ComponentActivity.startActivityForResult(ComponentActivity.java:597)
        at android.app.Activity.startActivityForResult(Activity.java:5365)
        at androidx.activity.ComponentActivity.startActivityForResult(ComponentActivity.java:583)
        at android.app.Activity.startActivity(Activity.java:5751)
        at android.app.Activity.startActivity(Activity.java:5704)
        at com.example.testactivityembedding.MainActivity.onCreate$lambda-1(MainActivity.kt:20)
        at com.example.testactivityembedding.MainActivity.$r8$lambda$DF9TM35iGA0Bo2URblwnH5Izk7A(Unknown Source:0)
        at com.example.testactivityembedding.MainActivity$$ExternalSyntheticLambda1.onClick(Unknown Source:2)
        at android.view.View.performClick(View.java:7470)
        at com.google.android.material.button.MaterialButton.performClick(MaterialButton.java:1194)
        at android.view.View.performClickInternal(View.java:7447)
        at android.view.View.access$3700(View.java:844)
        at android.view.View$PerformClick.run(View.java:29003)
        at android.os.Handler.handleCallback(Handler.java:938)
        at android.os.Handler.dispatchMessage(Handler.java:99)
        at android.os.Looper.loopOnce(Looper.java:201)
        at android.os.Looper.loop(Looper.java:288)
        at android.app.ActivityThread.main(ActivityThread.java:7874)
        at java.lang.reflect.Method.invoke(Native Method)
        at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:548)
        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:1003)
