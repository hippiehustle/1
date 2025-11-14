package K5;

import A5.o;
import V.b;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import t.j;

/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new o(3);

    /* renamed from: f, reason: collision with root package name */
    public final j f2728f;

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f2728f = new j(0);
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f2728f + "}";
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        j jVar = this.f2728f;
        int i8 = jVar.f14670f;
        parcel.writeInt(i8);
        String[] strArr = new String[i8];
        Bundle[] bundleArr = new Bundle[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            strArr[i9] = (String) jVar.f(i9);
            bundleArr[i9] = (Bundle) jVar.i(i9);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f2728f = new j(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            this.f2728f.put(strArr[i4], bundleArr[i4]);
        }
    }
}
