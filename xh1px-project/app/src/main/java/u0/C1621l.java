package u0;

import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import java.util.concurrent.locks.ReentrantLock;
import n6.InterfaceC1163b;

/* renamed from: u0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1621l implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f15243d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f15244e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f15245f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f15246g;

    public C1621l(InterfaceC0233f interfaceC0233f, u uVar, boolean z8, InterfaceC1163b interfaceC1163b) {
        this.f15244e = interfaceC0233f;
        this.f15245f = uVar;
        this.f15243d = z8;
        this.f15246g = interfaceC1163b;
    }

    @Override // O7.InterfaceC0233f
    public Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        Object x8 = ((InterfaceC0233f) this.f15244e).x(new w0.l(interfaceC0234g, (u) this.f15245f, this.f15243d, (InterfaceC1163b) this.f15246g), interfaceC0617c);
        if (x8 == EnumC0646a.f10656d) {
            return x8;
        }
        return Z5.y.f7506a;
    }

    public C1621l(int i4) {
        this.f15244e = new ReentrantLock();
        this.f15245f = new long[i4];
        this.f15246g = new boolean[i4];
    }
}
