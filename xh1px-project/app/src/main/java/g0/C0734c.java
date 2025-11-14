package g0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: g0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0734c implements Parcelable {
    public static final Parcelable.Creator<C0734c> CREATOR = new A5.j(11);

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f10991d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f10992e;

    public C0734c(ArrayList arrayList, ArrayList arrayList2) {
        this.f10991d = arrayList;
        this.f10992e = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeStringList(this.f10991d);
        parcel.writeTypedList(this.f10992e);
    }

    public C0734c(Parcel parcel) {
        this.f10991d = parcel.createStringArrayList();
        this.f10992e = parcel.createTypedArrayList(C0733b.CREATOR);
    }
}
