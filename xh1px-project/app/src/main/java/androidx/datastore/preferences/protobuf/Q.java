package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0465a f8633a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8634b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f8635c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8636d;

    public Q(AbstractC0484u abstractC0484u, String str, Object[] objArr) {
        this.f8633a = abstractC0484u;
        this.f8634b = str;
        this.f8635c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f8636d = charAt;
            return;
        }
        int i4 = charAt & 8191;
        int i8 = 13;
        int i9 = 1;
        while (true) {
            int i10 = i9 + 1;
            char charAt2 = str.charAt(i9);
            if (charAt2 >= 55296) {
                i4 |= (charAt2 & 8191) << i8;
                i8 += 13;
                i9 = i10;
            } else {
                this.f8636d = i4 | (charAt2 << i8);
                return;
            }
        }
    }

    public final int a() {
        int i4 = this.f8636d;
        if ((i4 & 1) != 0) {
            return 1;
        }
        if ((i4 & 4) == 4) {
            return 3;
        }
        return 2;
    }
}
