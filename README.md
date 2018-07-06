"# android-activity" 
Activity Life Cycle
  onCreate - onStart - onResume - onPause - onStop - onDestroy
Config Change
  onSavedInstance will call after onPause
  onRestoreInstance will call after onStart
  
  Screen Rotation default behaviour is overriden by mentioning
    android:configChanges="keyboardHidden|orientation in activity property manifest file
    onConfigurationChanged() . will get called after this change.
    
  
