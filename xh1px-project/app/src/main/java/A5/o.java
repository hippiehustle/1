package A5;

import L5.A;
import android.os.Parcel;
import android.os.Parcelable;
import l5.C1032b;
import o.V0;
import o.j1;
import t0.l0;
import x5.C1791a;

/* loaded from: classes.dex */
public final class o implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f380a;

    public /* synthetic */ o(int i4) {
        this.f380a = i4;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f380a) {
            case 0:
                return new p(parcel, classLoader);
            case 1:
                return new C.h(parcel, classLoader);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return new H5.f(parcel, classLoader);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return new K5.a(parcel, classLoader);
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return new A(parcel, classLoader);
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                if (parcel.readParcelable(classLoader) == null) {
                    return V.b.f6208e;
                }
                throw new IllegalStateException("superState must be null");
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C1032b(parcel, classLoader);
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return new m5.b(parcel, classLoader);
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                return new V0(parcel, classLoader);
            case 9:
                return new j1(parcel, classLoader);
            case 10:
                return new l0(parcel, classLoader);
            case 11:
                return new C1791a(parcel, classLoader);
            default:
                return new x5.h(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.f380a) {
            case 0:
                return new p[i4];
            case 1:
                return new C.h[i4];
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return new H5.f[i4];
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return new K5.a[i4];
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return new A[i4];
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return new V.b[i4];
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C1032b[i4];
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return new m5.b[i4];
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                return new V0[i4];
            case 9:
                return new j1[i4];
            case 10:
                return new l0[i4];
            case 11:
                return new C1791a[i4];
            default:
                return new x5.h[i4];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f380a) {
            case 0:
                return new p(parcel, null);
            case 1:
                return new C.h(parcel, null);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return new H5.f(parcel, null);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return new K5.a(parcel, null);
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return new A(parcel, null);
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                if (parcel.readParcelable(null) == null) {
                    return V.b.f6208e;
                }
                throw new IllegalStateException("superState must be null");
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C1032b(parcel, null);
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return new m5.b(parcel, null);
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                return new V0(parcel, null);
            case 9:
                return new j1(parcel, null);
            case 10:
                return new l0(parcel, null);
            case 11:
                return new C1791a(parcel, null);
            default:
                return new x5.h(parcel, null);
        }
    }
}
