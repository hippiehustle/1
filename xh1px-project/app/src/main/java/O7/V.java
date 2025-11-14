package O7;

import L7.AbstractC0166y;
import L7.C0161t;
import L7.EnumC0164w;
import L7.InterfaceC0163v;
import P7.AbstractC0285b;
import d6.C0623i;
import d6.InterfaceC0617c;
import d6.InterfaceC0622h;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import n6.InterfaceC1165d;
import n6.InterfaceC1166e;

/* loaded from: classes.dex */
public abstract class V {

    /* renamed from: a */
    public static final Q7.t f4104a = new Q7.t("NO_VALUE", 0);

    /* renamed from: b */
    public static final Q7.t f4105b = new Q7.t("NONE", 0);

    /* renamed from: c */
    public static final Q7.t f4106c = new Q7.t("PENDING", 0);

    public static final U a(int i4, int i8, N7.a aVar) {
        if (i4 >= 0) {
            if (i8 >= 0) {
                if (i4 <= 0 && i8 <= 0 && aVar != N7.a.f3795d) {
                    throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
                }
                int i9 = i8 + i4;
                if (i9 < 0) {
                    i9 = Integer.MAX_VALUE;
                }
                return new U(i4, i9, aVar);
            }
            throw new IllegalArgumentException(A.j.l("extraBufferCapacity cannot be negative, but was ", i8).toString());
        }
        throw new IllegalArgumentException(A.j.l("replay cannot be negative, but was ", i4).toString());
    }

    public static /* synthetic */ U b(int i4) {
        int i8;
        N7.a aVar;
        if ((i4 & 1) != 0) {
            i8 = 0;
        } else {
            i8 = 1;
        }
        if ((i4 & 4) != 0) {
            aVar = N7.a.f3795d;
        } else {
            aVar = N7.a.f3796e;
        }
        return a(i8, 0, aVar);
    }

    public static final i0 c(Object obj) {
        if (obj == null) {
            obj = AbstractC0285b.f4640b;
        }
        return new i0(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(InterfaceC0234g interfaceC0234g, Object obj, Object obj2, AbstractC0713c abstractC0713c) {
        C0247u c0247u;
        int i4;
        if (abstractC0713c instanceof C0247u) {
            C0247u c0247u2 = (C0247u) abstractC0713c;
            int i8 = c0247u2.f4187i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0247u2.f4187i = i8 - Integer.MIN_VALUE;
                c0247u = c0247u2;
                Object obj3 = c0247u.f4186h;
                i4 = c0247u.f4187i;
                if (i4 == 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = c0247u.f4185g;
                    Z5.a.d(obj3);
                } else {
                    Z5.a.d(obj3);
                    c0247u.f4185g = obj2;
                    c0247u.f4187i = 1;
                    if (interfaceC0234g.n(obj, c0247u) == EnumC0646a.f10656d) {
                        return;
                    }
                }
                throw new AbortFlowException(obj2);
            }
        }
        c0247u = new AbstractC0713c(abstractC0713c);
        Object obj32 = c0247u.f4186h;
        i4 = c0247u.f4187i;
        if (i4 == 0) {
        }
        throw new AbortFlowException(obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(k0 k0Var, S3.h hVar, Throwable th, AbstractC0713c abstractC0713c) {
        C0243p c0243p;
        int i4;
        try {
            if (abstractC0713c instanceof C0243p) {
                C0243p c0243p2 = (C0243p) abstractC0713c;
                int i8 = c0243p2.f4172i;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    c0243p2.f4172i = i8 - Integer.MIN_VALUE;
                    c0243p = c0243p2;
                    Object obj = c0243p.f4171h;
                    i4 = c0243p.f4172i;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            th = c0243p.f4170g;
                            Z5.a.d(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        Z5.a.d(obj);
                        c0243p.f4170g = th;
                        c0243p.f4172i = 1;
                        Object j = hVar.j(k0Var, th, c0243p);
                        Object obj2 = EnumC0646a.f10656d;
                        if (j == obj2) {
                            return obj2;
                        }
                    }
                    return Z5.y.f7506a;
                }
            }
            if (i4 == 0) {
            }
            return Z5.y.f7506a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                Z5.a.a(th2, th);
            }
            throw th2;
        }
        c0243p = new AbstractC0713c(abstractC0713c);
        Object obj3 = c0243p.f4171h;
        i4 = c0243p.f4172i;
    }

    public static final void f(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static InterfaceC0233f g(InterfaceC0233f interfaceC0233f, int i4) {
        N7.a aVar;
        if (i4 < 0 && i4 != -2 && i4 != -1) {
            throw new IllegalArgumentException(A.j.l("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i4).toString());
        }
        if (i4 == -1) {
            i4 = 0;
            aVar = N7.a.f3796e;
        } else {
            aVar = N7.a.f3795d;
        }
        int i8 = i4;
        N7.a aVar2 = aVar;
        if (interfaceC0233f instanceof P7.v) {
            return AbstractC0285b.b((P7.v) interfaceC0233f, null, i8, aVar2, 1);
        }
        return new P7.i(interfaceC0233f, null, i8, aVar2, 2);
    }

    public static final L h(InterfaceC0233f interfaceC0233f, InterfaceC0233f interfaceC0233f2, InterfaceC0233f interfaceC0233f3, InterfaceC1166e interfaceC1166e) {
        return new L(new InterfaceC0233f[]{interfaceC0233f, interfaceC0233f2, interfaceC0233f3}, interfaceC1166e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        if (r5 == 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Y i(InterfaceC0233f interfaceC0233f, int i4) {
        N7.l.f3838b.getClass();
        int i8 = N7.k.f3837b;
        if (i4 >= i8) {
            i8 = i4;
        }
        int i9 = i8 - i4;
        boolean z8 = interfaceC0233f instanceof P7.f;
        N7.a aVar = N7.a.f3795d;
        if (z8) {
            P7.f fVar = (P7.f) interfaceC0233f;
            InterfaceC0233f c6 = fVar.c();
            N7.a aVar2 = fVar.f4649f;
            if (c6 != null) {
                int i10 = fVar.f4648e;
                if (i10 != -3 && i10 != -2 && i10 != 0) {
                    i9 = i10;
                } else if (aVar2 != aVar) {
                    if (i4 == 0) {
                        i9 = 1;
                    }
                    i9 = 0;
                }
                return new Y(i9, aVar2, c6, fVar.f4647d);
            }
        }
        return new Y(i9, aVar, interfaceC0233f, C0623i.f10448d);
    }

    public static final InterfaceC0233f j(InterfaceC0233f interfaceC0233f) {
        return new W0.d(22, new C0242o(new H7.o(10), interfaceC0233f, null));
    }

    public static final InterfaceC0233f k(InterfaceC0233f interfaceC0233f) {
        if (interfaceC0233f instanceof g0) {
            return interfaceC0233f;
        }
        if (interfaceC0233f instanceof C0231d) {
            ((C0231d) interfaceC0233f).getClass();
            return interfaceC0233f;
        }
        return new C0231d(interfaceC0233f);
    }

    public static final Object l(InterfaceC0234g interfaceC0234g, InterfaceC0233f interfaceC0233f, InterfaceC0617c interfaceC0617c) {
        if (!(interfaceC0234g instanceof k0)) {
            Object x8 = interfaceC0233f.x(interfaceC0234g, interfaceC0617c);
            if (x8 == EnumC0646a.f10656d) {
                return x8;
            }
            return Z5.y.f7506a;
        }
        throw ((k0) interfaceC0234g).f4156d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (r11 == r5) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x002f, B:14:0x0057, B:20:0x006c, B:22:0x0074, B:24:0x007a, B:26:0x0080, B:28:0x0091, B:29:0x0099, B:30:0x009a, B:31:0x00a1, B:39:0x0048, B:42:0x0053), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v1, types: [f6.c] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x008e -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(InterfaceC0234g interfaceC0234g, N7.u uVar, boolean z8, AbstractC0713c abstractC0713c) {
        C0236i c0236i;
        int i4;
        CancellationException cancellationException;
        N7.c cVar;
        InterfaceC0234g interfaceC0234g2;
        N7.c cVar2;
        Object b4;
        try {
            if (abstractC0713c instanceof C0236i) {
                C0236i c0236i2 = (C0236i) abstractC0713c;
                int i8 = c0236i2.f4148l;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    c0236i2.f4148l = i8 - Integer.MIN_VALUE;
                    c0236i = c0236i2;
                    Object obj = c0236i.k;
                    i4 = c0236i.f4148l;
                    cancellationException = null;
                    EnumC0646a enumC0646a = EnumC0646a.f10656d;
                    if (i4 == 0) {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                z8 = c0236i.j;
                                cVar = c0236i.f4147i;
                                uVar = c0236i.f4146h;
                                InterfaceC0234g interfaceC0234g3 = c0236i.f4145g;
                                Z5.a.d(obj);
                                InterfaceC0234g interfaceC0234g4 = interfaceC0234g3;
                                cVar2 = cVar;
                                interfaceC0234g = interfaceC0234g4;
                                c0236i.f4145g = interfaceC0234g;
                                c0236i.f4146h = uVar;
                                c0236i.f4147i = cVar2;
                                c0236i.j = z8;
                                c0236i.f4148l = 1;
                                b4 = cVar2.b(c0236i);
                                if (b4 == enumC0646a) {
                                    interfaceC0234g2 = interfaceC0234g;
                                    cVar = cVar2;
                                    obj = b4;
                                    if (((Boolean) obj).booleanValue()) {
                                        Object obj2 = cVar.f3799d;
                                        Q7.t tVar = N7.j.f3832p;
                                        if (obj2 != tVar) {
                                            cVar.f3799d = tVar;
                                            if (obj2 != N7.j.f3828l) {
                                                c0236i.f4145g = interfaceC0234g2;
                                                c0236i.f4146h = uVar;
                                                c0236i.f4147i = cVar;
                                                c0236i.j = z8;
                                                c0236i.f4148l = 2;
                                                Object n3 = interfaceC0234g2.n(obj2, c0236i);
                                                interfaceC0234g4 = interfaceC0234g2;
                                            } else {
                                                Throwable r8 = cVar.f3801f.r();
                                                int i9 = Q7.s.f4967a;
                                                throw r8;
                                            }
                                        } else {
                                            throw new IllegalStateException("`hasNext()` has not been invoked");
                                        }
                                    } else {
                                        if (z8) {
                                            uVar.d(null);
                                        }
                                        return Z5.y.f7506a;
                                    }
                                } else {
                                    return enumC0646a;
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            z8 = c0236i.j;
                            cVar = c0236i.f4147i;
                            uVar = c0236i.f4146h;
                            InterfaceC0234g interfaceC0234g5 = c0236i.f4145g;
                            Z5.a.d(obj);
                            interfaceC0234g2 = interfaceC0234g5;
                            if (((Boolean) obj).booleanValue()) {
                            }
                        }
                    } else {
                        Z5.a.d(obj);
                        if (!(interfaceC0234g instanceof k0)) {
                            cVar2 = uVar.iterator();
                            c0236i.f4145g = interfaceC0234g;
                            c0236i.f4146h = uVar;
                            c0236i.f4147i = cVar2;
                            c0236i.j = z8;
                            c0236i.f4148l = 1;
                            b4 = cVar2.b(c0236i);
                            if (b4 == enumC0646a) {
                            }
                        } else {
                            throw ((k0) interfaceC0234g).f4156d;
                        }
                    }
                }
            }
            if (i4 == 0) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (z8) {
                    if (th instanceof CancellationException) {
                        cancellationException = th;
                    }
                    if (cancellationException == null) {
                        cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                        cancellationException.initCause(th);
                    }
                    uVar.d(cancellationException);
                }
                throw th2;
            }
        }
        c0236i = new AbstractC0713c(abstractC0713c);
        Object obj3 = c0236i.k;
        i4 = c0236i.f4148l;
        cancellationException = null;
        EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, o6.u] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [o6.u] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(InterfaceC0233f interfaceC0233f, AbstractC0713c abstractC0713c) {
        C c6;
        int i4;
        ?? obj;
        AbortFlowException e9;
        A a3;
        o6.u uVar;
        Object obj2;
        Q7.t tVar = AbstractC0285b.f4640b;
        if (abstractC0713c instanceof C) {
            C c9 = (C) abstractC0713c;
            int i8 = c9.j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c9.j = i8 - Integer.MIN_VALUE;
                c6 = c9;
                Object obj3 = c6.f4061i;
                i4 = c6.j;
                if (i4 == 0) {
                    if (i4 == 1) {
                        a3 = c6.f4060h;
                        obj = c6.f4059g;
                        try {
                            Z5.a.d(obj3);
                            uVar = obj;
                        } catch (AbortFlowException e10) {
                            e9 = e10;
                            if (e9.f12159d != a3) {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj3);
                    obj = new Object();
                    obj.f13642d = tVar;
                    A a4 = new A(obj, 0);
                    try {
                        c6.f4059g = obj;
                        c6.f4060h = a4;
                        c6.j = 1;
                        Object x8 = interfaceC0233f.x(a4, c6);
                        Object obj4 = EnumC0646a.f10656d;
                        uVar = obj;
                        if (x8 == obj4) {
                            return obj4;
                        }
                    } catch (AbortFlowException e11) {
                        e9 = e11;
                        a3 = a4;
                        if (e9.f12159d != a3) {
                            InterfaceC0622h interfaceC0622h = c6.f10782e;
                            o6.j.b(interfaceC0622h);
                            AbstractC0166y.i(interfaceC0622h);
                            uVar = obj;
                            obj2 = uVar.f13642d;
                            if (obj2 != tVar) {
                            }
                        } else {
                            throw e9;
                        }
                    }
                }
                obj2 = uVar.f13642d;
                if (obj2 != tVar) {
                    return obj2;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        c6 = new AbstractC0713c(abstractC0713c);
        Object obj32 = c6.f4061i;
        i4 = c6.j;
        if (i4 == 0) {
        }
        obj2 = uVar.f13642d;
        if (obj2 != tVar) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, o6.u] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(P7.D d2, F f8, AbstractC0713c abstractC0713c) {
        D d3;
        int i4;
        o6.u uVar;
        AbortFlowException e9;
        L3.M m6;
        Object obj;
        Q7.t tVar = AbstractC0285b.f4640b;
        if (abstractC0713c instanceof D) {
            D d9 = (D) abstractC0713c;
            int i8 = d9.j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                d9.j = i8 - Integer.MIN_VALUE;
                d3 = d9;
                Object obj2 = d3.f4064i;
                i4 = d3.j;
                if (i4 == 0) {
                    if (i4 == 1) {
                        m6 = d3.f4063h;
                        uVar = d3.f4062g;
                        try {
                            Z5.a.d(obj2);
                        } catch (AbortFlowException e10) {
                            e9 = e10;
                        }
                        obj = uVar.f13642d;
                        if (obj == tVar) {
                            return obj;
                        }
                        throw new NoSuchElementException("Expected at least one element matching the predicate");
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Z5.a.d(obj2);
                ?? obj3 = new Object();
                obj3.f13642d = tVar;
                L3.M m8 = new L3.M(f8, 6, (Object) obj3);
                try {
                    d3.f4062g = obj3;
                    d3.f4063h = m8;
                    d3.j = 1;
                    d2.x(m8, d3);
                    return EnumC0646a.f10656d;
                } catch (AbortFlowException e11) {
                    uVar = obj3;
                    e9 = e11;
                    m6 = m8;
                }
                if (e9.f12159d != m6) {
                    InterfaceC0622h interfaceC0622h = d3.f10782e;
                    o6.j.b(interfaceC0622h);
                    AbstractC0166y.i(interfaceC0622h);
                    obj = uVar.f13642d;
                    if (obj == tVar) {
                    }
                } else {
                    throw e9;
                }
            }
        }
        d3 = new AbstractC0713c(abstractC0713c);
        Object obj22 = d3.f4064i;
        i4 = d3.j;
        if (i4 == 0) {
        }
        if (e9.f12159d != m6) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o6.u] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [o6.u] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(InterfaceC0233f interfaceC0233f, AbstractC0713c abstractC0713c) {
        E e9;
        int i4;
        ?? obj;
        AbortFlowException e10;
        A a3;
        o6.u uVar;
        if (abstractC0713c instanceof E) {
            E e11 = (E) abstractC0713c;
            int i8 = e11.j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                e11.j = i8 - Integer.MIN_VALUE;
                e9 = e11;
                Object obj2 = e9.f4067i;
                i4 = e9.j;
                if (i4 == 0) {
                    if (i4 == 1) {
                        a3 = e9.f4066h;
                        obj = e9.f4065g;
                        try {
                            Z5.a.d(obj2);
                            uVar = obj;
                        } catch (AbortFlowException e12) {
                            e10 = e12;
                            if (e10.f12159d != a3) {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj2);
                    obj = new Object();
                    A a4 = new A(obj, 1);
                    try {
                        e9.f4065g = obj;
                        e9.f4066h = a4;
                        e9.j = 1;
                        Object x8 = interfaceC0233f.x(a4, e9);
                        Object obj3 = EnumC0646a.f10656d;
                        uVar = obj;
                        if (x8 == obj3) {
                            return obj3;
                        }
                    } catch (AbortFlowException e13) {
                        e10 = e13;
                        a3 = a4;
                        if (e10.f12159d != a3) {
                            InterfaceC0622h interfaceC0622h = e9.f10782e;
                            o6.j.b(interfaceC0622h);
                            AbstractC0166y.i(interfaceC0622h);
                            uVar = obj;
                            return uVar.f13642d;
                        }
                        throw e10;
                    }
                }
                return uVar.f13642d;
            }
        }
        e9 = new AbstractC0713c(abstractC0713c);
        Object obj22 = e9.f4067i;
        i4 = e9.j;
        if (i4 == 0) {
        }
        return uVar.f13642d;
    }

    public static final InterfaceC0233f q(InterfaceC0233f interfaceC0233f, InterfaceC0622h interfaceC0622h) {
        if (interfaceC0622h.B(C0161t.f3244e) == null) {
            if (interfaceC0622h.equals(C0623i.f10448d)) {
                return interfaceC0233f;
            }
            if (interfaceC0233f instanceof P7.v) {
                return AbstractC0285b.b((P7.v) interfaceC0233f, interfaceC0622h, 0, null, 6);
            }
            return new P7.i(interfaceC0233f, interfaceC0622h, 0, null, 12);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + interfaceC0622h).toString());
    }

    public static final InterfaceC0233f r(Q q6, InterfaceC0622h interfaceC0622h, int i4, N7.a aVar) {
        if ((i4 == 0 || i4 == -3) && aVar == N7.a.f3795d) {
            return q6;
        }
        return new P7.h(i4, aVar, q6, interfaceC0622h);
    }

    public static final L7.k0 s(InterfaceC0233f interfaceC0233f, InterfaceC0163v interfaceC0163v) {
        return AbstractC0166y.q(interfaceC0163v, null, null, new C0237j(interfaceC0233f, null), 3);
    }

    public static final P t(InterfaceC0233f interfaceC0233f, InterfaceC0163v interfaceC0163v, a0 a0Var, Object obj) {
        EnumC0164w enumC0164w;
        Y i4 = i(interfaceC0233f, 1);
        i0 c6 = c(obj);
        InterfaceC0622h interfaceC0622h = (InterfaceC0622h) i4.f4116d;
        InterfaceC0233f interfaceC0233f2 = (InterfaceC0233f) i4.f4114b;
        if (a0Var.equals(Z.f4117a)) {
            enumC0164w = EnumC0164w.f3248d;
        } else {
            enumC0164w = EnumC0164w.f3251g;
        }
        AbstractC0166y.p(interfaceC0163v, interfaceC0622h, enumC0164w, new H(a0Var, interfaceC0233f2, c6, obj, null));
        return new P(c6);
    }

    public static final P7.n u(InterfaceC0233f interfaceC0233f, InterfaceC1165d interfaceC1165d) {
        int i4 = AbstractC0252z.f4200a;
        return new P7.n(interfaceC1165d, interfaceC0233f, C0623i.f10448d, -2, N7.a.f3795d);
    }
}
