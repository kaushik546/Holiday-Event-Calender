# Holiday-Event-Calender
This is an event calender where we are adding some events on holidays. So we can find out easily our holidays by those event.

![calender](https://user-images.githubusercontent.com/11855976/60059379-2e156080-970e-11e9-9dda-6fa2974b22b7.png)


## How to use this calender:
At First we need to add the dependencies of Compact Calender View on project build.gradle(Module.app):

```android
dependencies {
    implementation fileTree(dir: 'libs', include: ['*.jar'])
    implementation 'com.android.support:appcompat-v7:28.0.0'
    implementation 'com.android.support.constraint:constraint-layout:1.1.3'
    testImplementation 'junit:junit:4.12'
    androidTestImplementation 'com.android.support.test:runner:1.0.2'
    androidTestImplementation 'com.android.support.test.espresso:espresso-core:3.0.2'
    compile 'com.github.sundeepk:compact-calendar-view:3.0.0'
}
```

There are some properties on CompactCalendarView. They are:

```android
<com.github.sundeepk.compactcalendarview.CompactCalendarView xmlns:app="http://schemas.android.com/apk/res-auto"
            android:id="@+id/compactcalendar_view"
            android:layout_width="fill_parent"
            android:layout_height="290dp"
            android:layout_marginLeft="2dp"
            android:layout_marginTop="2dp"
            android:layout_marginRight="2dp"
            android:layout_marginBottom="2dp"
            android:paddingTop="10dp"
            app:compactCalendarBackgroundColor="#ffe95451"
            app:compactCalendarCurrentDayBackgroundColor="#B71C1C"
            app:compactCalendarCurrentDayIndicatorStyle="fill_large_indicator"
            app:compactCalendarCurrentSelectedDayBackgroundColor="#E57373"
            app:compactCalendarEventIndicatorStyle="fill_large_indicator"
            app:compactCalendarMultiEventIndicatorColor="#fff"
            app:compactCalendarTargetHeight="300dp"
            app:compactCalendarTextColor="#fff"
            app:compactCalendarTextSize="20dp" />    
  ```
