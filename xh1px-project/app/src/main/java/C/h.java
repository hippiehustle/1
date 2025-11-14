package C;

import A5.o;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class h extends V.b {
    public static final Parcelable.Creator<h> CREATOR = new o(1);

    /* renamed from: f, reason: collision with root package name */
    public SparseArray f548f;

    public h(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f548f = new SparseArray(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            this.f548f.append(iArr[i4], readParcelableArray[i4]);
        }
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int i8;
        super.writeToParcel(parcel, i4);
        SparseArray sparseArray = this.f548f;
        if (sparseArray != null) {
            i8 = sparseArray.size();
        } else {
            i8 = 0;
        }
        parcel.writeInt(i8);
        int[] iArr = new int[i8];
        Parcelable[] parcelableArr = new Parcelable[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            iArr[i9] = this.f548f.keyAt(i9);
            parcelableArr[i9] = (Parcelable) this.f548f.valueAt(i9);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i4);
    }
}
