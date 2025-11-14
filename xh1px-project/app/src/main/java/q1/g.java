package q1;

import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import java.io.File;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class g extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f13928h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ File f13929i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, File file, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f13928h = str;
        this.f13929i = file;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        g gVar = (g) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        gVar.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new g(this.f13928h, this.f13929i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        this.f13929i.delete();
        return y.f7506a;
    }
}
