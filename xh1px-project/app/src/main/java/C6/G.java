package C6;

import f7.C0723c;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final class G implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f718d;

    /* renamed from: e, reason: collision with root package name */
    public final C0723c f719e;

    public /* synthetic */ G(C0723c c0723c, int i4) {
        this.f718d = i4;
        this.f719e = c0723c;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        boolean z8;
        switch (this.f718d) {
            case 0:
                C0723c c0723c = (C0723c) obj;
                o6.j.e(c0723c, "it");
                if (!c0723c.f10797a.c() && c0723c.b().equals(this.f719e)) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                return Boolean.valueOf(z8);
            default:
                D6.j jVar = (D6.j) obj;
                o6.j.e(jVar, "it");
                return jVar.e(this.f719e);
        }
    }
}
