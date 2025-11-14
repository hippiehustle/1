package g0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.EnumC0504o;

/* loaded from: classes.dex */
public final class Z implements Parcelable {
    public static final Parcelable.Creator<Z> CREATOR = new A5.j(14);

    /* renamed from: d, reason: collision with root package name */
    public final String f10938d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10939e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10940f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f10941g;

    /* renamed from: h, reason: collision with root package name */
    public final int f10942h;

    /* renamed from: i, reason: collision with root package name */
    public final int f10943i;
    public final String j;
    public final boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f10944l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f10945m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f10946n;

    /* renamed from: o, reason: collision with root package name */
    public final int f10947o;

    /* renamed from: p, reason: collision with root package name */
    public final String f10948p;

    /* renamed from: q, reason: collision with root package name */
    public final int f10949q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f10950r;

    public Z(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y) {
        this.f10938d = abstractComponentCallbacksC0755y.getClass().getName();
        this.f10939e = abstractComponentCallbacksC0755y.f11114h;
        this.f10940f = abstractComponentCallbacksC0755y.f11122r;
        this.f10941g = abstractComponentCallbacksC0755y.f11124t;
        this.f10942h = abstractComponentCallbacksC0755y.f11086B;
        this.f10943i = abstractComponentCallbacksC0755y.f11087C;
        this.j = abstractComponentCallbacksC0755y.f11088D;
        this.k = abstractComponentCallbacksC0755y.f11091G;
        this.f10944l = abstractComponentCallbacksC0755y.f11119o;
        this.f10945m = abstractComponentCallbacksC0755y.f11090F;
        this.f10946n = abstractComponentCallbacksC0755y.f11089E;
        this.f10947o = abstractComponentCallbacksC0755y.f11102S.ordinal();
        this.f10948p = abstractComponentCallbacksC0755y.k;
        this.f10949q = abstractComponentCallbacksC0755y.f11116l;
        this.f10950r = abstractComponentCallbacksC0755y.f11096M;
    }

    public final AbstractComponentCallbacksC0755y a(J j) {
        AbstractComponentCallbacksC0755y a3 = j.a(this.f10938d);
        a3.f11114h = this.f10939e;
        a3.f11122r = this.f10940f;
        a3.f11124t = this.f10941g;
        a3.f11125u = true;
        a3.f11086B = this.f10942h;
        a3.f11087C = this.f10943i;
        a3.f11088D = this.j;
        a3.f11091G = this.k;
        a3.f11119o = this.f10944l;
        a3.f11090F = this.f10945m;
        a3.f11089E = this.f10946n;
        a3.f11102S = EnumC0504o.values()[this.f10947o];
        a3.k = this.f10948p;
        a3.f11116l = this.f10949q;
        a3.f11096M = this.f10950r;
        return a3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f10938d);
        sb.append(" (");
        sb.append(this.f10939e);
        sb.append(")}:");
        if (this.f10940f) {
            sb.append(" fromLayout");
        }
        if (this.f10941g) {
            sb.append(" dynamicContainer");
        }
        int i4 = this.f10943i;
        if (i4 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i4));
        }
        String str = this.j;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.k) {
            sb.append(" retainInstance");
        }
        if (this.f10944l) {
            sb.append(" removing");
        }
        if (this.f10945m) {
            sb.append(" detached");
        }
        if (this.f10946n) {
            sb.append(" hidden");
        }
        String str2 = this.f10948p;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f10949q);
        }
        if (this.f10950r) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f10938d);
        parcel.writeString(this.f10939e);
        parcel.writeInt(this.f10940f ? 1 : 0);
        parcel.writeInt(this.f10941g ? 1 : 0);
        parcel.writeInt(this.f10942h);
        parcel.writeInt(this.f10943i);
        parcel.writeString(this.j);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.f10944l ? 1 : 0);
        parcel.writeInt(this.f10945m ? 1 : 0);
        parcel.writeInt(this.f10946n ? 1 : 0);
        parcel.writeInt(this.f10947o);
        parcel.writeString(this.f10948p);
        parcel.writeInt(this.f10949q);
        parcel.writeInt(this.f10950r ? 1 : 0);
    }

    public Z(Parcel parcel) {
        this.f10938d = parcel.readString();
        this.f10939e = parcel.readString();
        this.f10940f = parcel.readInt() != 0;
        this.f10941g = parcel.readInt() != 0;
        this.f10942h = parcel.readInt();
        this.f10943i = parcel.readInt();
        this.j = parcel.readString();
        this.k = parcel.readInt() != 0;
        this.f10944l = parcel.readInt() != 0;
        this.f10945m = parcel.readInt() != 0;
        this.f10946n = parcel.readInt() != 0;
        this.f10947o = parcel.readInt();
        this.f10948p = parcel.readString();
        this.f10949q = parcel.readInt();
        this.f10950r = parcel.readInt() != 0;
    }
}
