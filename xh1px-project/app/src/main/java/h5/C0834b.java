package h5;

import A5.j;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* renamed from: h5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0834b implements Parcelable {
    public static final Parcelable.Creator<C0834b> CREATOR = new j(15);

    /* renamed from: A, reason: collision with root package name */
    public Integer f11383A;

    /* renamed from: B, reason: collision with root package name */
    public Integer f11384B;

    /* renamed from: C, reason: collision with root package name */
    public Integer f11385C;

    /* renamed from: D, reason: collision with root package name */
    public Integer f11386D;

    /* renamed from: E, reason: collision with root package name */
    public Integer f11387E;

    /* renamed from: F, reason: collision with root package name */
    public Integer f11388F;

    /* renamed from: G, reason: collision with root package name */
    public Boolean f11389G;

    /* renamed from: d, reason: collision with root package name */
    public int f11390d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f11391e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f11392f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f11393g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f11394h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f11395i;
    public Integer j;
    public Integer k;

    /* renamed from: m, reason: collision with root package name */
    public String f11397m;

    /* renamed from: q, reason: collision with root package name */
    public Locale f11401q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f11402r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f11403s;

    /* renamed from: t, reason: collision with root package name */
    public int f11404t;

    /* renamed from: u, reason: collision with root package name */
    public int f11405u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f11406v;

    /* renamed from: x, reason: collision with root package name */
    public Integer f11408x;

    /* renamed from: y, reason: collision with root package name */
    public Integer f11409y;

    /* renamed from: z, reason: collision with root package name */
    public Integer f11410z;

    /* renamed from: l, reason: collision with root package name */
    public int f11396l = 255;

    /* renamed from: n, reason: collision with root package name */
    public int f11398n = -2;

    /* renamed from: o, reason: collision with root package name */
    public int f11399o = -2;

    /* renamed from: p, reason: collision with root package name */
    public int f11400p = -2;

    /* renamed from: w, reason: collision with root package name */
    public Boolean f11407w = Boolean.TRUE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        String str;
        parcel.writeInt(this.f11390d);
        parcel.writeSerializable(this.f11391e);
        parcel.writeSerializable(this.f11392f);
        parcel.writeSerializable(this.f11393g);
        parcel.writeSerializable(this.f11394h);
        parcel.writeSerializable(this.f11395i);
        parcel.writeSerializable(this.j);
        parcel.writeSerializable(this.k);
        parcel.writeInt(this.f11396l);
        parcel.writeString(this.f11397m);
        parcel.writeInt(this.f11398n);
        parcel.writeInt(this.f11399o);
        parcel.writeInt(this.f11400p);
        CharSequence charSequence = this.f11402r;
        String str2 = null;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        parcel.writeString(str);
        CharSequence charSequence2 = this.f11403s;
        if (charSequence2 != null) {
            str2 = charSequence2.toString();
        }
        parcel.writeString(str2);
        parcel.writeInt(this.f11404t);
        parcel.writeSerializable(this.f11406v);
        parcel.writeSerializable(this.f11408x);
        parcel.writeSerializable(this.f11409y);
        parcel.writeSerializable(this.f11410z);
        parcel.writeSerializable(this.f11383A);
        parcel.writeSerializable(this.f11384B);
        parcel.writeSerializable(this.f11385C);
        parcel.writeSerializable(this.f11388F);
        parcel.writeSerializable(this.f11386D);
        parcel.writeSerializable(this.f11387E);
        parcel.writeSerializable(this.f11407w);
        parcel.writeSerializable(this.f11401q);
        parcel.writeSerializable(this.f11389G);
    }
}
