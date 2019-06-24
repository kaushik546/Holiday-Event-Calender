package com.example.mycalender;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.EventLog;
import android.util.Log;
import android.view.View;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.github.sundeepk.compactcalendarview.CompactCalendarView;
import com.github.sundeepk.compactcalendarview.domain.Event;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    CompactCalendarView calendarView;
    TextView textViewShowDate;
    TextView textViewShowEvent;
    TextView showMonth;
    private SimpleDateFormat dateFormatMonth = new SimpleDateFormat("MMMM yyyy", Locale.getDefault());


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asigning variable
        textViewShowDate= (TextView) findViewById(R.id.showDate);
        calendarView = (CompactCalendarView) findViewById(R.id.compactcalendar_view);
        textViewShowEvent= (TextView) findViewById(R.id.eventtxt);
        showMonth= (TextView) findViewById(R.id.showSrollMonth);

        //First Day of Week
        calendarView.setFirstDayOfWeek(Calendar.SATURDAY);
        calendarView.setUseThreeLetterAbbreviation(true);
        calendarView.shouldSelectFirstDayOfMonthOnScroll(false);

        //ActionBar
        final ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setTitle("Government Holiday");
        //actionBar.setLogo(R.drawable.cocktail);
        //actionBar.setDisplayUseLogoEnabled(true);
        calendarView.displayOtherMonthDays(true);

        //Show Current Date
        Calendar calendar = Calendar.getInstance();
        final String currentDate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        textViewShowDate.setText(currentDate);

        //Menu Button Month, Week, Day View
        //ImageView monthView =(ImageView) findViewById(R.id.mothico);
        //ImageView weekView = (ImageView) findViewById(R.id.weekico);
        //ImageView dayView = (ImageView) findViewById(R.id.dayico);

        //Set Event and convert date by https://www.epochconverter.com/
        Event ev1 = new Event(Color.rgb(2,105,40),1550685600000L,"Language Martyr's Day");
        calendarView.addEvent(ev1);
        Event ev2 = new Event(Color.rgb(2,105,40),1552759200000L,"Sheikh Mujibur Rahman's Birthday");
        calendarView.addEvent(ev2);
        Event ev3 = new Event(Color.rgb(2,105,40),1553536800000L,"Independence Day");
        calendarView.addEvent(ev3);
        Event ev4 = new Event(Color.rgb(2,105,40),1555178400000L,"Bengali New Year");
        calendarView.addEvent(ev4);
        Event ev5 = new Event(Color.rgb(2,105,40),1555783200000L,"Shab e-Barat");
        calendarView.addEvent(ev5);
        Event ev6 = new Event(Color.rgb(2,105,40),1556647200000L,"May Day");
        calendarView.addEvent(ev6);
        Event ev7 = new Event(Color.rgb(2,105,40),1558202400000L,"Buddha Purnima");
        calendarView.addEvent(ev7);
        Event ev8 = new Event(Color.rgb(2,105,40),1559239200000L,"Jumatul Bidah");
        calendarView.addEvent(ev8);
        Event ev9 = new Event(Color.rgb(2,105,40),1559325600000L,"Shab e-Kadar");
        calendarView.addEvent(ev9);
        Event ev10 = new Event(Color.rgb(2,105,40),1559671200000L,"Eid ul-Fitr");
        calendarView.addEvent(ev10);
        Event ev11 = new Event(Color.rgb(2,105,40),1559757600000L,"Eid ul-Fitr");
        calendarView.addEvent(ev11);
        Event ev12 = new Event(Color.rgb(2,105,40),1565546400000L,"Eid ul-Adha");
        calendarView.addEvent(ev12);
        Event ev13 = new Event(Color.rgb(2,105,40),1565632800000L,"Eid ul-Adha");
        calendarView.addEvent(ev13);
        Event ev14 = new Event(Color.rgb(2,105,40),1565719200000L,"Eid ul-Adha");
        calendarView.addEvent(ev14);
        Event ev15 = new Event(Color.rgb(2,105,40),1565805600000L,"National Mourning Day");
        calendarView.addEvent(ev15);
        Event ev16 = new Event(Color.rgb(2,105,40),1566583200000L,"Janmashtami");
        calendarView.addEvent(ev16);
        Event ev17 = new Event(Color.rgb(2,105,40),1568052000000L,"Ashura");
        calendarView.addEvent(ev17);
        Event ev18 = new Event(Color.rgb(2,105,40),1570471200000L,"Durga Puja");
        calendarView.addEvent(ev18);
        Event ev19 = new Event(Color.rgb(2,105,40),1573322400000L,"EId e-Milad-un Nabi");
        calendarView.addEvent(ev19);
        Event ev20 = new Event(Color.rgb(2,105,40),1576432800000L,"Victory Day");
        calendarView.addEvent(ev20);
        Event ev21 = new Event(Color.rgb(2,105,40),1577210400000L,"Christmas Day");
        calendarView.addEvent(ev21);

        calendarView.setListener(new CompactCalendarView.CompactCalendarViewListener() {
            @Override
            public void onDayClick(Date dateClicked) {

                //Log.d(dateClicked.toString(),"hi");

                if (dateClicked.toString().compareTo("Thu Feb 21 00:00:00 GMT+06:00 2019") == 0) {
                    textViewShowEvent.setText("Language Martyr's Day");
                }
                else if (dateClicked.toString().compareTo("Sun Mar 17 00:00:00 GMT+06:00 2019") == 0) {
                    textViewShowEvent.setText("Sheikh Mujibur Rahman's Birthday");
                }
                else if (dateClicked.toString().compareTo("Tue Mar 26 00:00:00 GMT+06:00 2019") == 0) {
                    textViewShowEvent.setText("Independence Day");
                }
                else if (dateClicked.toString().compareTo("Sun Apr 14 00:00:00 GMT+06:00 2019") == 0) {
                    textViewShowEvent.setText("Bengali New Year");
                }
                else if (dateClicked.toString().compareTo("Sun Apr 21 00:00:00 GMT+06:00 2019") == 0) {
                    textViewShowEvent.setText("Shab e-Barat");
                }
                else if (dateClicked.toString().compareTo("Wed May 01 00:00:00 GMT+06:00 2019") == 0) {
                    textViewShowEvent.setText("May day");
                }
                else if (dateClicked.toString().compareTo("Sun May 19 00:00:00 GMT+06:00 2019") == 0) {
                    textViewShowEvent.setText("Buddha Purnima");
                }
                else if (dateClicked.toString().compareTo("Fri May 31 00:00:00 GMT+06:00 2019") == 0) {
                    textViewShowEvent.setText("Jumatul Bidah");
                }
                else if (dateClicked.toString().compareTo("Sat Jun 01 00:00:00 GMT+06:00 2019") == 0) {
                    textViewShowEvent.setText("Shab e-Kadar");
                }
                else if (dateClicked.toString().compareTo("Wed Jun 05 00:00:00 GMT+06:00 2019") == 0) {
                    textViewShowEvent.setText("Eid ul-Fitr");
                }
                else if (dateClicked.toString().compareTo("Thu Jun 06 00:00:00 GMT+06:00 2019") == 0) {
                    textViewShowEvent.setText("Eid ul-Fitr");
                }
                else if (dateClicked.toString().compareTo("Mon Aug 12 00:00:00 GMT+06:00 2019") == 0) {
                    textViewShowEvent.setText("Eid ul-Adha");
                }
                else if (dateClicked.toString().compareTo("Tue Aug 13 00:00:00 GMT+06:00 2019") == 0) {
                    textViewShowEvent.setText("Eid ul-Adha");
                }
                else if (dateClicked.toString().compareTo("Wed Aug 14 00:00:00 GMT+06:00 2019") == 0) {
                    textViewShowEvent.setText("Eid ul-Adha");
                }
                else if (dateClicked.toString().compareTo("Thu Aug 15 00:00:00 GMT+06:00 2019") == 0) {
                    textViewShowEvent.setText("National Mourning Day");
                }
                else if (dateClicked.toString().compareTo("Sat Aug 24 00:00:00 GMT+06:00 2019") == 0) {
                    textViewShowEvent.setText("Janmashtami");
                }
                else if (dateClicked.toString().compareTo("Tue Sep 10 00:00:00 GMT+06:00 2019") == 0) {
                    textViewShowEvent.setText("Ashura");
                }
                else if (dateClicked.toString().compareTo("Tue Oct 08 00:00:00 GMT+06:00 2019") == 0) {
                    textViewShowEvent.setText("Durga Puja");
                }
                else if (dateClicked.toString().compareTo("Sun Nov 10 00:00:00 GMT+06:00 2019") == 0) {
                    textViewShowEvent.setText("EId e-Milad-un Nabi");
                }
                else if (dateClicked.toString().compareTo("Mon Dec 16 00:00:00 GMT+06:00 2019") == 0) {
                    textViewShowEvent.setText("Victory Day");
                }
                else if (dateClicked.toString().compareTo("Wed Dec 25 00:00:00 GMT+06:00 2019") == 0) {
                    textViewShowEvent.setText("Christmas Day");
                }
                else{
                        textViewShowEvent.setText("No Holiday");
                    }
                }

            @Override
            public void onMonthScroll(Date firstDayOfNewMonth) {
                showMonth.setText(dateFormatMonth.format(firstDayOfNewMonth));
            }
        });

    }

}
