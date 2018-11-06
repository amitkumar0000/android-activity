"# android-activity" 


Activity Life Cycle

onCreate - onStart - onResume - onPause - onStop - onDestroy

onCreate :- This is called once on activity Lifecycle to do all initialise that need once.

onStart :- This is place when activity is visible to user, as app prepares for activity to enter foregroung and start
           interacting. This method is place where user initialize the code that maintain UI.

onResume :-  This is where user start interacting with UI.

onPause :- App move in backgroud parital invisible ...e.g a dilog box comes in screen,activity is paritally visible

onStop :- This is the place where user can stop any functionality that does not required if app is invisible.

onDestroy :- final cleanup of acivity and activity object is completely removed from memory.

onRestart :- is called after onStop  if activity move from background to foreground and onDestroy is not called.
            Any intialized happen in onCreate that is deallocated in onStop can reinitalize on onRestart.
            For activities that are using raw Cursor objects (instead of creating them through managedQuery(android.net.Uri,                   String[], String, String[], String), this is usually the place where the cursor should be requeried (because                    you had deactivated it in onStop().

Config Change
 
 onSavedInstance will call after onPause
  onRestoreInstance will call after onStart
  
  Screen Rotation default behaviour is overriden by mentioning
    android:configChanges="keyboardHidden|orientation in activity property manifest file
    onConfigurationChanged() . will get called after this change.
    
    
  LaunchMode
  
  Standard :  Create new Activity and put on stack
  
  SingleTop : Create new Activity and put on stack if activity is not on top. else call same Activity via onNewIntent
  
  SingleTask:  Without taskAffinity . Create only one instance of activity
                                   allow the task to shared by all activity
                                   If acitity is not on foreground. All other activity will destroy and 
                                   singleTask activity will be called via onNewIntent
               
               With taskAffinitity. Create one instance of activity on new task.
                                    if this activity call other activiy . the same task will be shared by other activity.
                                    if activity from other task call this activity, activity will move to new task and all     
                                    activity on top of that task will be destroyed.
 SingleInstance:  Same as SingleTask. This activity will be only activity on Task. 
                  Once activity is created. next time it will be call via onNewIntent
  
