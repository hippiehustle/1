package g0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.lifecycle.EnumC0504o;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: g0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0733b implements Parcelable {
    public static final Parcelable.Creator<C0733b> CREATOR = new A5.j(10);

    /* renamed from: d, reason: collision with root package name */
    public final int[] f10975d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f10976e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f10977f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f10978g;

    /* renamed from: h, reason: collision with root package name */
    public final int f10979h;

    /* renamed from: i, reason: collision with root package name */
    public final String f10980i;
    public final int j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final CharSequence f10981l;

    /* renamed from: m, reason: collision with root package name */
    public final int f10982m;

    /* renamed from: n, reason: collision with root package name */
    public final CharSequence f10983n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f10984o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f10985p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f10986q;

    public C0733b(C0732a c0732a) {
        int size = c0732a.f10951a.size();
        this.f10975d = new int[size * 6];
        if (c0732a.f10957g) {
            this.f10976e = new ArrayList(size);
            this.f10977f = new int[size];
            this.f10978g = new int[size];
            int i4 = 0;
            for (int i8 = 0; i8 < size; i8++) {
                c0 c0Var = (c0) c0732a.f10951a.get(i8);
                int i9 = i4 + 1;
                this.f10975d[i4] = c0Var.f10993a;
                ArrayList arrayList = this.f10976e;
                AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = c0Var.f10994b;
                arrayList.add(abstractComponentCallbacksC0755y != null ? abstractComponentCallbacksC0755y.f11114h : null);
                int[] iArr = this.f10975d;
                iArr[i9] = c0Var.f10995c ? 1 : 0;
                iArr[i4 + 2] = c0Var.f10996d;
                iArr[i4 + 3] = c0Var.f10997e;
                int i10 = i4 + 5;
                iArr[i4 + 4] = c0Var.f10998f;
                i4 += 6;
                iArr[i10] = c0Var.f10999g;
                this.f10977f[i8] = c0Var.f11000h.ordinal();
                this.f10978g[i8] = c0Var.f11001i.ordinal();
            }
            this.f10979h = c0732a.f10956f;
            this.f10980i = c0732a.f10959i;
            this.j = c0732a.f10968t;
            this.k = c0732a.j;
            this.f10981l = c0732a.k;
            this.f10982m = c0732a.f10960l;
            this.f10983n = c0732a.f10961m;
            this.f10984o = c0732a.f10962n;
            this.f10985p = c0732a.f10963o;
            this.f10986q = c0732a.f10964p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [g0.c0, java.lang.Object] */
    public final void a(C0732a c0732a) {
        int i4 = 0;
        int i8 = 0;
        while (true) {
            int[] iArr = this.f10975d;
            boolean z8 = true;
            if (i4 < iArr.length) {
                ?? obj = new Object();
                int i9 = i4 + 1;
                obj.f10993a = iArr[i4];
                if (T.K(2)) {
                    Objects.toString(c0732a);
                    int i10 = iArr[i9];
                }
                obj.f11000h = EnumC0504o.values()[this.f10977f[i8]];
                obj.f11001i = EnumC0504o.values()[this.f10978g[i8]];
                int i11 = i4 + 2;
                if (iArr[i9] == 0) {
                    z8 = false;
                }
                obj.f10995c = z8;
                int i12 = iArr[i11];
                obj.f10996d = i12;
                int i13 = iArr[i4 + 3];
                obj.f10997e = i13;
                int i14 = i4 + 5;
                int i15 = iArr[i4 + 4];
                obj.f10998f = i15;
                i4 += 6;
                int i16 = iArr[i14];
                obj.f10999g = i16;
                c0732a.f10952b = i12;
                c0732a.f10953c = i13;
                c0732a.f10954d = i15;
                c0732a.f10955e = i16;
                c0732a.b(obj);
                i8++;
            } else {
                c0732a.f10956f = this.f10979h;
                c0732a.f10959i = this.f10980i;
                c0732a.f10957g = true;
                c0732a.j = this.k;
                c0732a.k = this.f10981l;
                c0732a.f10960l = this.f10982m;
                c0732a.f10961m = this.f10983n;
                c0732a.f10962n = this.f10984o;
                c0732a.f10963o = this.f10985p;
                c0732a.f10964p = this.f10986q;
                return;
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeIntArray(this.f10975d);
        parcel.writeStringList(this.f10976e);
        parcel.writeIntArray(this.f10977f);
        parcel.writeIntArray(this.f10978g);
        parcel.writeInt(this.f10979h);
        parcel.writeString(this.f10980i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        TextUtils.writeToParcel(this.f10981l, parcel, 0);
        parcel.writeInt(this.f10982m);
        TextUtils.writeToParcel(this.f10983n, parcel, 0);
        parcel.writeStringList(this.f10984o);
        parcel.writeStringList(this.f10985p);
        parcel.writeInt(this.f10986q ? 1 : 0);
    }

    public C0733b(Parcel parcel) {
        this.f10975d = parcel.createIntArray();
        this.f10976e = parcel.createStringArrayList();
        this.f10977f = parcel.createIntArray();
        this.f10978g = parcel.createIntArray();
        this.f10979h = parcel.readInt();
        this.f10980i = parcel.readString();
        this.j = parcel.readInt();
        this.k = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f10981l = (CharSequence) creator.createFromParcel(parcel);
        this.f10982m = parcel.readInt();
        this.f10983n = (CharSequence) creator.createFromParcel(parcel);
        this.f10984o = parcel.createStringArrayList();
        this.f10985p = parcel.createStringArrayList();
        this.f10986q = parcel.readInt() != 0;
    }
}
