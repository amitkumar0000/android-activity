"# android-activity" 


Activity Life Cycle

onCreate - onStart - onResume - onPause - onStop - onDestroy

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
  
