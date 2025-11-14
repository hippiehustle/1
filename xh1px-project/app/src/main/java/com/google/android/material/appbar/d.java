package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d extends V.b {
    public static final Parcelable.Creator<d> CREATOR = new Object();

    /* renamed from: f, reason: collision with root package name */
    public boolean f9917f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9918g;

    /* renamed from: h, reason: collision with root package name */
    public int f9919h;

    /* renamed from: i, reason: collision with root package name */
    public float f9920i;
    public boolean j;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z8;
        boolean z9;
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f9917f = z8;
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f9918g = z9;
        this.f9919h = parcel.readInt();
        this.f9920i = parcel.readFloat();
        this.j = parcel.readByte() != 0;
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeByte(this.f9917f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9918g ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f9919h);
        parcel.writeFloat(this.f9920i);
        parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
    }
}
