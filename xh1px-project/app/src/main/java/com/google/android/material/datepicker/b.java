package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new A5.j(5);

    /* renamed from: d, reason: collision with root package name */
    public final n f10070d;

    /* renamed from: e, reason: collision with root package name */
    public final n f10071e;

    /* renamed from: f, reason: collision with root package name */
    public final d f10072f;

    /* renamed from: g, reason: collision with root package name */
    public final n f10073g;

    /* renamed from: h, reason: collision with root package name */
    public final int f10074h;

    /* renamed from: i, reason: collision with root package name */
    public final int f10075i;
    public final int j;

    public b(n nVar, n nVar2, d dVar, n nVar3, int i4) {
        Objects.requireNonNull(nVar, "start cannot be null");
        Objects.requireNonNull(nVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f10070d = nVar;
        this.f10071e = nVar2;
        this.f10073g = nVar3;
        this.f10074h = i4;
        this.f10072f = dVar;
        if (nVar3 != null && nVar.f10129d.compareTo(nVar3.f10129d) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (nVar3 != null && nVar3.f10129d.compareTo(nVar2.f10129d) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i4 >= 0 && i4 <= v.c(null).getMaximum(7)) {
            this.j = nVar.d(nVar2) + 1;
            this.f10075i = (nVar2.f10131f - nVar.f10131f) + 1;
            return;
        }
        throw new IllegalArgumentException("firstDayOfWeek is not valid");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f10070d.equals(bVar.f10070d) && this.f10071e.equals(bVar.f10071e) && Objects.equals(this.f10073g, bVar.f10073g) && this.f10074h == bVar.f10074h && this.f10072f.equals(bVar.f10072f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10070d, this.f10071e, this.f10073g, Integer.valueOf(this.f10074h), this.f10072f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f10070d, 0);
        parcel.writeParcelable(this.f10071e, 0);
        parcel.writeParcelable(this.f10073g, 0);
        parcel.writeParcelable(this.f10072f, 0);
        parcel.writeInt(this.f10074h);
    }
}
