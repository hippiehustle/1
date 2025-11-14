package h4;

import L7.InterfaceC0163v;
import Z5.y;
import android.content.Intent;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: h4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0830d extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0831e f11365h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11366i;
    public final /* synthetic */ Intent j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0830d(C0831e c0831e, int i4, Intent intent, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f11365h = c0831e;
        this.f11366i = i4;
        this.j = intent;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C0830d c0830d = (C0830d) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        c0830d.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0830d(this.f11365h, this.f11366i, this.j, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        this.f11365h.f11368c.d(this.f11366i, this.j);
        return y.f7506a;
    }
}
