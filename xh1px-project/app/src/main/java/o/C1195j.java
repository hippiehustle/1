package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1195j implements Parcelable {
    public static final Parcelable.Creator<C1195j> CREATOR = new A5.j(16);

    /* renamed from: d, reason: collision with root package name */
    public int f13266d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f13266d);
    }
}
