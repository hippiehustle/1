package x5;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class h extends SparseArray implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new A5.o(12);

    public h(Parcel parcel, ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i4 = 0; i4 < readInt; i4++) {
            put(iArr[i4], readParcelableArray[i4]);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i8 = 0; i8 < size; i8++) {
            iArr[i8] = keyAt(i8);
            parcelableArr[i8] = (Parcelable) valueAt(i8);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i4);
    }
}
