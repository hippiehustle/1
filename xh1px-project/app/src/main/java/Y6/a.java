package Y6;

import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class a implements InterfaceC1164c {

    /* renamed from: e, reason: collision with root package name */
    public static final a f7203e = new a(0);

    /* renamed from: f, reason: collision with root package name */
    public static final a f7204f = new a(1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7205d;

    public /* synthetic */ a(int i4) {
        this.f7205d = i4;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        c cVar = (c) obj;
        p pVar = (p) obj2;
        switch (this.f7205d) {
            case 0:
                o6.j.e(cVar, "$this$loadConstantFromProperty");
                o6.j.e(pVar, "it");
                return cVar.f7212c.get(pVar);
            default:
                o6.j.e(cVar, "$this$loadConstantFromProperty");
                o6.j.e(pVar, "it");
                return cVar.f7211b.get(pVar);
        }
    }
}
