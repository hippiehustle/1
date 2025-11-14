package E4;

import t0.AbstractC1534b;

/* loaded from: classes.dex */
public final class b extends AbstractC1534b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f1197e = new b(0);

    /* renamed from: f, reason: collision with root package name */
    public static final b f1198f = new b(1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1199d;

    public /* synthetic */ b(int i4) {
        this.f1199d = i4;
    }

    @Override // t0.AbstractC1534b
    public final boolean a(Object obj, Object obj2) {
        switch (this.f1199d) {
            case 0:
                return ((c) obj).equals((c) obj2);
            default:
                return ((j) obj).equals((j) obj2);
        }
    }

    @Override // t0.AbstractC1534b
    public final boolean b(Object obj, Object obj2) {
        switch (this.f1199d) {
            case 0:
                if (((c) obj).f1200a == ((c) obj2).f1200a) {
                    return true;
                }
                return false;
            default:
                j jVar = (j) obj;
                j jVar2 = (j) obj2;
                if (jVar.getClass() == jVar2.getClass() && jVar.a() == jVar2.a()) {
                    return true;
                }
                return false;
        }
    }
}
