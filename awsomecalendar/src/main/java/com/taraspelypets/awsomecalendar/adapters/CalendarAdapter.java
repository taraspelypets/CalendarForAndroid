package com.taraspelypets.awsomecalendar.adapters;

import android.view.View;
import android.view.ViewGroup;

import com.taraspelypets.awsomecalendar.CalendarPager;
import com.taraspelypets.awsomecalendar.monthcalendar.MonthPager;

import java.util.Calendar;

/**
 * Created by Taras on 10.08.2017.
 */

public abstract class CalendarAdapter<VH extends CalendarAdapter.ViewHolder> {

    private CalendarPager calendarPager;

    public abstract VH onCreateViewHolder(ViewGroup parent);
    public abstract void onBindViewHolder(VH vh, Calendar calendar);


    public abstract static class ViewHolder{
        private View view;
        public ViewHolder(View view){
            this.view = view;
        }

        public View getView() {
            return view;
        }
    }

    public CalendarPager getCalendarPager() {
        return calendarPager;
    }

    public void setCalendarPager(CalendarPager calendarPager) {
        this.calendarPager = calendarPager;
    }
}
