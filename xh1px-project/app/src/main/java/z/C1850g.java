package z;

import java.util.Iterator;

/* renamed from: z.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1850g extends C1849f {

    /* renamed from: m, reason: collision with root package name */
    public int f16601m;

    public C1850g(m mVar) {
        super(mVar);
        if (mVar instanceof j) {
            this.f16595e = 2;
        } else {
            this.f16595e = 3;
        }
    }

    @Override // z.C1849f
    public final void d(int i4) {
        if (!this.j) {
            this.j = true;
            this.f16597g = i4;
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                InterfaceC1847d interfaceC1847d = (InterfaceC1847d) it.next();
                interfaceC1847d.a(interfaceC1847d);
            }
        }
    }
}
