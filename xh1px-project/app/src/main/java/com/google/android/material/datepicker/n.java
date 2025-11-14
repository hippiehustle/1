package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class n implements Comparable, Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new A5.j(7);

    /* renamed from: d, reason: collision with root package name */
    public final Calendar f10129d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10130e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10131f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10132g;

    /* renamed from: h, reason: collision with root package name */
    public final int f10133h;

    /* renamed from: i, reason: collision with root package name */
    public final long f10134i;
    public String j;

    public n(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a3 = v.a(calendar);
        this.f10129d = a3;
        this.f10130e = a3.get(2);
        this.f10131f = a3.get(1);
        this.f10132g = a3.getMaximum(7);
        this.f10133h = a3.getActualMaximum(5);
        this.f10134i = a3.getTimeInMillis();
    }

    public static n a(int i4, int i8) {
        Calendar c6 = v.c(null);
        c6.set(1, i4);
        c6.set(2, i8);
        return new n(c6);
    }

    public static n b(long j) {
        Calendar c6 = v.c(null);
        c6.setTimeInMillis(j);
        return new n(c6);
    }

    public final String c() {
        if (this.j == null) {
            long timeInMillis = this.f10129d.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = v.f10149a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.j = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f10129d.compareTo(((n) obj).f10129d);
    }

    public final int d(n nVar) {
        if (this.f10129d instanceof GregorianCalendar) {
            return (nVar.f10130e - this.f10130e) + ((nVar.f10131f - this.f10131f) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f10130e == nVar.f10130e && this.f10131f == nVar.f10131f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10130e), Integer.valueOf(this.f10131f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f10131f);
        parcel.writeInt(this.f10130e);
    }
}
