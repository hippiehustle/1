package androidx.lifecycle;

import L7.C0150h;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class L extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public o6.u f8794h;

    /* renamed from: i, reason: collision with root package name */
    public o6.u f8795i;
    public int j;
    public final /* synthetic */ C0512x k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EnumC0504o f8796l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0163v f8797m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC0720j f8798n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public L(C0512x c0512x, EnumC0504o enumC0504o, InterfaceC0163v interfaceC0163v, InterfaceC1164c interfaceC1164c, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.k = c0512x;
        this.f8796l = enumC0504o;
        this.f8797m = interfaceC0163v;
        this.f8798n = (AbstractC0720j) interfaceC1164c;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((L) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [f6.j, n6.c] */
    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new L(this.k, this.f8796l, this.f8797m, this.f8798n, interfaceC0617c);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0099  */
    /* JADX WARN: Type inference failed for: r12v0, types: [f6.j, n6.c] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, o6.u] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, o6.u] */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        o6.u uVar;
        Throwable th;
        o6.u uVar2;
        EnumC0503n enumC0503n;
        EnumC0503n enumC0503n2;
        EnumC0503n enumC0503n3;
        Object u8;
        EnumC0646a enumC0646a;
        L7.X x8;
        InterfaceC0508t interfaceC0508t;
        int i4 = this.j;
        Z5.y yVar = Z5.y.f7506a;
        C0512x c0512x = this.k;
        if (i4 != 0) {
            if (i4 == 1) {
                uVar = this.f8795i;
                uVar2 = this.f8794h;
                try {
                    Z5.a.d(obj);
                } catch (Throwable th2) {
                    th = th2;
                    x8 = (L7.X) uVar2.f13642d;
                    if (x8 != null) {
                        x8.d(null);
                    }
                    interfaceC0508t = (InterfaceC0508t) uVar.f13642d;
                    if (interfaceC0508t == null) {
                        c0512x.f(interfaceC0508t);
                        throw th;
                    }
                    throw th;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            if (c0512x.f8862d != EnumC0504o.f8846d) {
                ?? obj2 = new Object();
                ?? obj3 = new Object();
                try {
                    EnumC0504o enumC0504o = this.f8796l;
                    InterfaceC0163v interfaceC0163v = this.f8797m;
                    ?? r12 = this.f8798n;
                    this.f8794h = obj2;
                    this.f8795i = obj3;
                    this.j = 1;
                    C0150h c0150h = new C0150h(1, E2.c.d0(this));
                    c0150h.v();
                    EnumC0503n.Companion.getClass();
                    int ordinal = enumC0504o.ordinal();
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                enumC0503n = null;
                            } else {
                                enumC0503n = EnumC0503n.ON_RESUME;
                            }
                        } else {
                            enumC0503n = EnumC0503n.ON_START;
                        }
                    } else {
                        enumC0503n = EnumC0503n.ON_CREATE;
                    }
                    int ordinal2 = enumC0504o.ordinal();
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            if (ordinal2 != 4) {
                                enumC0503n3 = null;
                                K k = new K(enumC0503n, obj2, interfaceC0163v, enumC0503n3, c0150h, new U7.c(), r12);
                                obj3.f13642d = k;
                                c0512x.a(k);
                                u8 = c0150h.u();
                                enumC0646a = EnumC0646a.f10656d;
                                if (u8 != enumC0646a) {
                                    return enumC0646a;
                                }
                                uVar = obj3;
                                uVar2 = obj2;
                            } else {
                                enumC0503n2 = EnumC0503n.ON_PAUSE;
                            }
                        } else {
                            enumC0503n2 = EnumC0503n.ON_STOP;
                        }
                    } else {
                        enumC0503n2 = EnumC0503n.ON_DESTROY;
                    }
                    enumC0503n3 = enumC0503n2;
                    K k6 = new K(enumC0503n, obj2, interfaceC0163v, enumC0503n3, c0150h, new U7.c(), r12);
                    obj3.f13642d = k6;
                    c0512x.a(k6);
                    u8 = c0150h.u();
                    enumC0646a = EnumC0646a.f10656d;
                    if (u8 != enumC0646a) {
                    }
                } catch (Throwable th3) {
                    uVar = obj3;
                    th = th3;
                    uVar2 = obj2;
                    x8 = (L7.X) uVar2.f13642d;
                    if (x8 != null) {
                    }
                    interfaceC0508t = (InterfaceC0508t) uVar.f13642d;
                    if (interfaceC0508t == null) {
                    }
                }
            }
            return yVar;
        }
        L7.X x9 = (L7.X) uVar2.f13642d;
        if (x9 != null) {
            x9.d(null);
        }
        InterfaceC0508t interfaceC0508t2 = (InterfaceC0508t) uVar.f13642d;
        if (interfaceC0508t2 != null) {
            c0512x.f(interfaceC0508t2);
        }
        return yVar;
    }
}
