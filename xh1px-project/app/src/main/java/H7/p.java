package H7;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class p implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2075b;

    public /* synthetic */ p(int i4, Object obj) {
        this.f2074a = i4;
        this.f2075b = obj;
    }

    @Override // H7.k
    public final Iterator iterator() {
        switch (this.f2074a) {
            case 0:
                return (Iterator) this.f2075b;
            case 1:
                return new F7.h(1, this.f2075b);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return new I7.g((CharSequence) this.f2075b);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return o6.j.g((Object[]) this.f2075b);
            default:
                return ((Iterable) this.f2075b).iterator();
        }
    }
}
