package com.google.android.material.datepicker;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.buzbuz.smartautoclicker.R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
public final class e extends BaseAdapter {

    /* renamed from: g, reason: collision with root package name */
    public static final int f10079g;

    /* renamed from: d, reason: collision with root package name */
    public final Calendar f10080d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10081e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10082f;

    static {
        int i4;
        if (Build.VERSION.SDK_INT >= 26) {
            i4 = 4;
        } else {
            i4 = 1;
        }
        f10079g = i4;
    }

    public e() {
        Calendar c6 = v.c(null);
        this.f10080d = c6;
        this.f10081e = c6.getMaximum(7);
        this.f10082f = c6.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f10081e;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i4) {
        int i8 = this.f10081e;
        if (i4 >= i8) {
            return null;
        }
        int i9 = i4 + this.f10082f;
        if (i9 > i8) {
            i9 -= i8;
        }
        return Integer.valueOf(i9);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) A.j.h(viewGroup, R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i8 = i4 + this.f10082f;
        int i9 = this.f10081e;
        if (i8 > i9) {
            i8 -= i9;
        }
        Calendar calendar = this.f10080d;
        calendar.set(7, i8);
        textView.setText(calendar.getDisplayName(7, f10079g, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public e(int i4) {
        Calendar c6 = v.c(null);
        this.f10080d = c6;
        this.f10081e = c6.getMaximum(7);
        this.f10082f = i4;
    }
}
