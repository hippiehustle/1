package g0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class U implements Parcelable {
    public static final Parcelable.Creator<U> CREATOR = new A5.j(13);

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f10924d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f10925e;

    /* renamed from: f, reason: collision with root package name */
    public C0733b[] f10926f;

    /* renamed from: g, reason: collision with root package name */
    public int f10927g;

    /* renamed from: h, reason: collision with root package name */
    public String f10928h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f10929i;
    public ArrayList j;
    public ArrayList k;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeStringList(this.f10924d);
        parcel.writeStringList(this.f10925e);
        parcel.writeTypedArray(this.f10926f, i4);
        parcel.writeInt(this.f10927g);
        parcel.writeString(this.f10928h);
        parcel.writeStringList(this.f10929i);
        parcel.writeTypedList(this.j);
        parcel.writeTypedList(this.k);
    }
}
