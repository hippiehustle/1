package n0;

import n6.InterfaceC1162a;

/* renamed from: n0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1133k implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1146x f12766e;

    public /* synthetic */ C1133k(C1146x c1146x, int i4) {
        this.f12765d = i4;
        this.f12766e = c1146x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if (r0.a() > 1) goto L12;
     */
    /* JADX WARN: Type inference failed for: r0v2, types: [o6.i, n6.a] */
    @Override // n6.InterfaceC1162a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        boolean z8;
        switch (this.f12765d) {
            case 0:
                C1146x c1146x = this.f12766e;
                g0.H h8 = c1146x.f12823f;
                if (c1146x.f12824g) {
                    z8 = true;
                    break;
                }
                z8 = false;
                h8.f10861a = z8;
                ?? r02 = h8.f10863c;
                if (r02 != 0) {
                    r02.a();
                }
                return Z5.y.f7506a;
            default:
                C1146x c1146x2 = this.f12766e;
                return new C1147y(c1146x2.f12818a, c1146x2.f12819b.f13898r);
        }
    }
}
