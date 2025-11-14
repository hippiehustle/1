package t0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class z0 implements Parcelable {
    public static final Parcelable.Creator<z0> CREATOR = new A5.j(21);

    /* renamed from: d, reason: collision with root package name */
    public int f15031d;

    /* renamed from: e, reason: collision with root package name */
    public int f15032e;

    /* renamed from: f, reason: collision with root package name */
    public int f15033f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f15034g;

    /* renamed from: h, reason: collision with root package name */
    public int f15035h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f15036i;
    public ArrayList j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f15037l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f15038m;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f15031d);
        parcel.writeInt(this.f15032e);
        parcel.writeInt(this.f15033f);
        if (this.f15033f > 0) {
            parcel.writeIntArray(this.f15034g);
        }
        parcel.writeInt(this.f15035h);
        if (this.f15035h > 0) {
            parcel.writeIntArray(this.f15036i);
        }
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.f15037l ? 1 : 0);
        parcel.writeInt(this.f15038m ? 1 : 0);
        parcel.writeList(this.j);
    }
}
