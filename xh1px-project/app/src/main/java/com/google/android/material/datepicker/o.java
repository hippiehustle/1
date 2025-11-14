package com.google.android.material.datepicker;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.buzbuz.smartautoclicker.R;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class o extends BaseAdapter {

    /* renamed from: g, reason: collision with root package name */
    public static final int f10135g = v.c(null).getMaximum(4);

    /* renamed from: h, reason: collision with root package name */
    public static final int f10136h = (v.c(null).getMaximum(7) + v.c(null).getMaximum(5)) - 1;

    /* renamed from: d, reason: collision with root package name */
    public final n f10137d;

    /* renamed from: e, reason: collision with root package name */
    public c f10138e;

    /* renamed from: f, reason: collision with root package name */
    public final b f10139f;

    public o(n nVar, b bVar) {
        this.f10137d = nVar;
        this.f10139f = bVar;
        throw null;
    }

    public final int a() {
        int i4 = this.f10139f.f10074h;
        n nVar = this.f10137d;
        Calendar calendar = nVar.f10129d;
        int i8 = calendar.get(7);
        if (i4 <= 0) {
            i4 = calendar.getFirstDayOfWeek();
        }
        int i9 = i8 - i4;
        if (i9 < 0) {
            return i9 + nVar.f10132g;
        }
        return i9;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i4) {
        if (i4 >= a() && i4 <= c()) {
            int a3 = (i4 - a()) + 1;
            Calendar a4 = v.a(this.f10137d.f10129d);
            a4.set(5, a3);
            return Long.valueOf(a4.getTimeInMillis());
        }
        return null;
    }

    public final int c() {
        return (a() + this.f10137d.f10133h) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f10136h;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return i4 / this.f10137d.f10132g;
    }

    @Override // android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f10138e == null) {
            this.f10138e = new c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) A.j.h(viewGroup, R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int a3 = i4 - a();
        if (a3 >= 0) {
            n nVar = this.f10137d;
            if (a3 < nVar.f10133h) {
                textView.setTag(nVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(a3 + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                if (getItem(i4) == null || textView == null) {
                    return textView;
                }
                textView.getContext();
                v.b().getTimeInMillis();
                throw null;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        if (getItem(i4) == null) {
            textView.getContext();
            v.b().getTimeInMillis();
            throw null;
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
