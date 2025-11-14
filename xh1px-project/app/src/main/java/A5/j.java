package A5;

import N0.C0199g;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.versionedparcelable.ParcelImpl;
import e.C0625a;
import e.C0632h;
import g0.C0733b;
import g0.C0734c;
import g0.M;
import g0.U;
import g0.Z;
import h5.C0834b;
import java.util.ArrayList;
import java.util.Locale;
import o.C1195j;
import o.N;
import t0.I;
import t0.y0;
import t0.z0;

/* loaded from: classes.dex */
public final class j implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f374a;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, A5.k] */
    /* JADX WARN: Type inference failed for: r0v19, types: [g0.M, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View$BaseSavedState, I5.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, g0.U] */
    /* JADX WARN: Type inference failed for: r0v22, types: [h5.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, o.j] */
    /* JADX WARN: Type inference failed for: r0v24, types: [android.view.View$BaseSavedState, java.lang.Object, o.N] */
    /* JADX WARN: Type inference failed for: r0v25, types: [android.view.View$BaseSavedState, java.lang.Object, p5.a] */
    /* JADX WARN: Type inference failed for: r0v26, types: [t0.I, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [t0.y0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [t0.z0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View$BaseSavedState, java.lang.Object, N0.g] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View$BaseSavedState, java.lang.Object, S.h] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z8;
        boolean z9;
        boolean z10;
        switch (this.f374a) {
            case 0:
                ?? obj = new Object();
                obj.f375d = parcel.readInt();
                obj.f376e = (x5.h) parcel.readParcelable(k.class.getClassLoader());
                return obj;
            case 1:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.f2106d = parcel.readFloat();
                baseSavedState.f2107e = parcel.readFloat();
                ArrayList arrayList = new ArrayList();
                baseSavedState.f2108f = arrayList;
                parcel.readList(arrayList, Float.class.getClassLoader());
                baseSavedState.f2109g = parcel.readFloat();
                baseSavedState.f2110h = parcel.createBooleanArray()[0];
                return baseSavedState;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return new ParcelImpl(parcel);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                ?? baseSavedState2 = new View.BaseSavedState(parcel);
                baseSavedState2.f3587d = parcel.readString();
                baseSavedState2.f3589f = parcel.readFloat();
                boolean z11 = true;
                if (parcel.readInt() != 1) {
                    z11 = false;
                }
                baseSavedState2.f3590g = z11;
                baseSavedState2.f3591h = parcel.readString();
                baseSavedState2.f3592i = parcel.readInt();
                baseSavedState2.j = parcel.readInt();
                return baseSavedState2;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                ?? baseSavedState3 = new View.BaseSavedState(parcel);
                baseSavedState3.f5168d = parcel.readInt();
                return baseSavedState3;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return new com.google.android.material.datepicker.b((com.google.android.material.datepicker.n) parcel.readParcelable(com.google.android.material.datepicker.n.class.getClassLoader()), (com.google.android.material.datepicker.n) parcel.readParcelable(com.google.android.material.datepicker.n.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (com.google.android.material.datepicker.n) parcel.readParcelable(com.google.android.material.datepicker.n.class.getClassLoader()), parcel.readInt());
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return com.google.android.material.datepicker.n.a(parcel.readInt(), parcel.readInt());
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                return new C0625a(parcel);
            case 9:
                o6.j.e(parcel, "inParcel");
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                o6.j.b(readParcelable);
                return new C0632h((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 10:
                return new C0733b(parcel);
            case 11:
                return new C0734c(parcel);
            case 12:
                ?? obj2 = new Object();
                obj2.f10872d = parcel.readString();
                obj2.f10873e = parcel.readInt();
                return obj2;
            case 13:
                ?? obj3 = new Object();
                obj3.f10928h = null;
                obj3.f10929i = new ArrayList();
                obj3.j = new ArrayList();
                obj3.f10924d = parcel.createStringArrayList();
                obj3.f10925e = parcel.createStringArrayList();
                obj3.f10926f = (C0733b[]) parcel.createTypedArray(C0733b.CREATOR);
                obj3.f10927g = parcel.readInt();
                obj3.f10928h = parcel.readString();
                obj3.f10929i = parcel.createStringArrayList();
                obj3.j = parcel.createTypedArrayList(C0734c.CREATOR);
                obj3.k = parcel.createTypedArrayList(M.CREATOR);
                return obj3;
            case 14:
                return new Z(parcel);
            case 15:
                ?? obj4 = new Object();
                obj4.f11396l = 255;
                obj4.f11398n = -2;
                obj4.f11399o = -2;
                obj4.f11400p = -2;
                obj4.f11407w = Boolean.TRUE;
                obj4.f11390d = parcel.readInt();
                obj4.f11391e = (Integer) parcel.readSerializable();
                obj4.f11392f = (Integer) parcel.readSerializable();
                obj4.f11393g = (Integer) parcel.readSerializable();
                obj4.f11394h = (Integer) parcel.readSerializable();
                obj4.f11395i = (Integer) parcel.readSerializable();
                obj4.j = (Integer) parcel.readSerializable();
                obj4.k = (Integer) parcel.readSerializable();
                obj4.f11396l = parcel.readInt();
                obj4.f11397m = parcel.readString();
                obj4.f11398n = parcel.readInt();
                obj4.f11399o = parcel.readInt();
                obj4.f11400p = parcel.readInt();
                obj4.f11402r = parcel.readString();
                obj4.f11403s = parcel.readString();
                obj4.f11404t = parcel.readInt();
                obj4.f11406v = (Integer) parcel.readSerializable();
                obj4.f11408x = (Integer) parcel.readSerializable();
                obj4.f11409y = (Integer) parcel.readSerializable();
                obj4.f11410z = (Integer) parcel.readSerializable();
                obj4.f11383A = (Integer) parcel.readSerializable();
                obj4.f11384B = (Integer) parcel.readSerializable();
                obj4.f11385C = (Integer) parcel.readSerializable();
                obj4.f11388F = (Integer) parcel.readSerializable();
                obj4.f11386D = (Integer) parcel.readSerializable();
                obj4.f11387E = (Integer) parcel.readSerializable();
                obj4.f11407w = (Boolean) parcel.readSerializable();
                obj4.f11401q = (Locale) parcel.readSerializable();
                obj4.f11389G = (Boolean) parcel.readSerializable();
                return obj4;
            case 16:
                ?? obj5 = new Object();
                obj5.f13266d = parcel.readInt();
                return obj5;
            case 17:
                ?? baseSavedState4 = new View.BaseSavedState(parcel);
                if (parcel.readByte() != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                baseSavedState4.f13113d = z8;
                return baseSavedState4;
            case 18:
                ?? baseSavedState5 = new View.BaseSavedState(parcel);
                baseSavedState5.f13801d = ((Integer) parcel.readValue(p5.a.class.getClassLoader())).intValue();
                return baseSavedState5;
            case 19:
                ?? obj6 = new Object();
                obj6.f14759d = parcel.readInt();
                obj6.f14760e = parcel.readInt();
                boolean z12 = true;
                if (parcel.readInt() != 1) {
                    z12 = false;
                }
                obj6.f14761f = z12;
                return obj6;
            case 20:
                ?? obj7 = new Object();
                obj7.f15026d = parcel.readInt();
                obj7.f15027e = parcel.readInt();
                boolean z13 = true;
                if (parcel.readInt() != 1) {
                    z13 = false;
                }
                obj7.f15029g = z13;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    obj7.f15028f = iArr;
                    parcel.readIntArray(iArr);
                }
                return obj7;
            default:
                ?? obj8 = new Object();
                obj8.f15031d = parcel.readInt();
                obj8.f15032e = parcel.readInt();
                int readInt2 = parcel.readInt();
                obj8.f15033f = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    obj8.f15034g = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                obj8.f15035h = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    obj8.f15036i = iArr3;
                    parcel.readIntArray(iArr3);
                }
                boolean z14 = false;
                if (parcel.readInt() == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                obj8.k = z9;
                if (parcel.readInt() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                obj8.f15037l = z10;
                if (parcel.readInt() == 1) {
                    z14 = true;
                }
                obj8.f15038m = z14;
                obj8.j = parcel.readArrayList(y0.class.getClassLoader());
                return obj8;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.f374a) {
            case 0:
                return new k[i4];
            case 1:
                return new I5.d[i4];
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return new ParcelImpl[i4];
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0199g[i4];
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return new S.h[i4];
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return new com.google.android.material.datepicker.b[i4];
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return new com.google.android.material.datepicker.d[i4];
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return new com.google.android.material.datepicker.n[i4];
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                return new C0625a[i4];
            case 9:
                return new C0632h[i4];
            case 10:
                return new C0733b[i4];
            case 11:
                return new C0734c[i4];
            case 12:
                return new M[i4];
            case 13:
                return new U[i4];
            case 14:
                return new Z[i4];
            case 15:
                return new C0834b[i4];
            case 16:
                return new C1195j[i4];
            case 17:
                return new N[i4];
            case 18:
                return new p5.a[i4];
            case 19:
                return new I[i4];
            case 20:
                return new y0[i4];
            default:
                return new z0[i4];
        }
    }
}
