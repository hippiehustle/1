package C1;

import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import java.util.Objects;
import n6.InterfaceC1165d;

/* loaded from: classes.dex */
public final class c extends AbstractC0720j implements InterfaceC1165d {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ w1.e f564h;

    /* JADX WARN: Type inference failed for: r2v2, types: [f6.j, C1.c] */
    @Override // n6.InterfaceC1165d
    public final Object j(Object obj, Object obj2, Object obj3) {
        ?? abstractC0720j = new AbstractC0720j(3, (InterfaceC0617c) obj3);
        abstractC0720j.f564h = (w1.e) obj2;
        return abstractC0720j.v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        w1.e eVar = this.f564h;
        Z5.a.d(obj);
        Objects.toString(eVar);
        return eVar;
    }
}
