package L0;

import android.os.Parcel;
import android.util.SparseIntArray;
import t.e;
import t.j;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f2750d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f2751e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2752f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2753g;

    /* renamed from: h, reason: collision with root package name */
    public final String f2754h;

    /* renamed from: i, reason: collision with root package name */
    public int f2755i;
    public int j;
    public int k;

    /* JADX WARN: Type inference failed for: r5v0, types: [t.j, t.e] */
    /* JADX WARN: Type inference failed for: r6v0, types: [t.j, t.e] */
    /* JADX WARN: Type inference failed for: r7v0, types: [t.j, t.e] */
    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new j(0), new j(0), new j(0));
    }

    @Override // L0.a
    public final b a() {
        Parcel parcel = this.f2751e;
        int dataPosition = parcel.dataPosition();
        int i4 = this.j;
        if (i4 == this.f2752f) {
            i4 = this.f2753g;
        }
        return new b(parcel, dataPosition, i4, A.j.r(new StringBuilder(), this.f2754h, "  "), this.f2747a, this.f2748b, this.f2749c);
    }

    @Override // L0.a
    public final boolean e(int i4) {
        while (this.j < this.f2753g) {
            int i8 = this.k;
            if (i8 != i4) {
                if (String.valueOf(i8).compareTo(String.valueOf(i4)) <= 0) {
                    int i9 = this.j;
                    Parcel parcel = this.f2751e;
                    parcel.setDataPosition(i9);
                    int readInt = parcel.readInt();
                    this.k = parcel.readInt();
                    this.j += readInt;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        if (this.k == i4) {
            return true;
        }
        return false;
    }

    @Override // L0.a
    public final void h(int i4) {
        int i8 = this.f2755i;
        SparseIntArray sparseIntArray = this.f2750d;
        Parcel parcel = this.f2751e;
        if (i8 >= 0) {
            int i9 = sparseIntArray.get(i8);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i9);
            parcel.writeInt(dataPosition - i9);
            parcel.setDataPosition(dataPosition);
        }
        this.f2755i = i4;
        sparseIntArray.put(i4, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i4);
    }

    public b(Parcel parcel, int i4, int i8, String str, e eVar, e eVar2, e eVar3) {
        super(eVar, eVar2, eVar3);
        this.f2750d = new SparseIntArray();
        this.f2755i = -1;
        this.k = -1;
        this.f2751e = parcel;
        this.f2752f = i4;
        this.f2753g = i8;
        this.j = i4;
        this.f2754h = str;
    }
}
